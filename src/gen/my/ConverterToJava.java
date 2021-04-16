package gen.my;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ConverterToJava {

    private List<String> myCode = new ArrayList<>();

    public void convertToJava(List<String> myCode, Path path) {

        this.myCode.add("package java;");
        this.myCode.add("import java.Table;");
        this.myCode.add("public class Test{");
        this.myCode.add("private static Test test = new Test();");
        this.myCode.addAll(myCode);
        this.myCode.add("}");

        if(Files.exists(path)) {
            System.out.println("file exists");
        } else {
            try {
                Files.createFile(path);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            Files.write(path,this.myCode, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
