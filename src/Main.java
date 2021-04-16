import gen.GrammaLexer;
import gen.GrammaParser;
import gen.my.ConverterToJava;
import gen.my.Visitor;
import gen.my.Walker;
import gen.my.base.Base;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;


import javax.swing.*;
import java.util.Arrays;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Main {
    public static double TREE_SCALE = 1.5;
    public static String PATH = "G:\\IAPIS_1\\test\\";
    public static String FILE =
            //"ЯПИС_1.txt";
            //"test.txt";
            "javaTestCode.txt";

    public static void main( String[] args) throws Exception{
        Main obj = new Main();
        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromString(obj.readFileAsString(PATH + FILE));
        } catch (Exception e) {
            e.printStackTrace();
        }

        GrammaLexer lexer = new GrammaLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammaParser parser = new GrammaParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new Walker());

        ParseTree tree = parser.program();
        //System.out.println(tree.toStringTree(parser));
        Visitor visitor = new Visitor();
        Base result = visitor.visit(tree);
        if(Walker.isErrors()) {
            return;
        }
        ConverterToJava converter = new ConverterToJava();
        converter.convertToJava(visitor.code, Paths.get("src/java/Test.java"));

        String className = "src/java/Test.java";
        String command = "javac " + className;
        String output = obj.executeCommand(command);

        //System.out.println(output);

    }
    private String executeCommand(String command) {
        StringBuffer output = new StringBuffer();
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    private String readFileAsString(String filePath) throws IOException {
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        char[] buf  = new char[1024];
        int numRead = 0;
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();;
        return fileData.toString();
    }
}
