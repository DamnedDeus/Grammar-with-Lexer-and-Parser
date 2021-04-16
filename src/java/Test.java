
package java;

import java.Table;

public class Test {
    private static Test test = new Test();

    private static Table createTable(String str) {
        Table t = new Table();
        Column name = new Column(t, "name", 0);
        Column count = new Column(t, "count", 1);
        String rez = "";
        for (Integer q = 0; q < 10; q++) {
            rez = str + " " + (q).toString();
            Row r = new Row(t, q);
            t.update(q, "name", rez);
            t.update(q, "count", rez);
            t.find(q, "count");
        }
        return t;
    }

    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 10;
        Integer c = 0;
        String temp = "car";
        String rez = "";
        Table t = new Table();
        t = test.createTable(temp);
        if (a == b) {
            c = a + b;
        } else {
            Integer i = 4;
        }
        Float k = 5.0f - 8.0f;
        for (Integer q = 0; q < 200; q++) {
            a++;
            Float f = 5.0f - 8.0f;
        }
        Integer w = 9;
        while (w < c) {
            w = 6;
            w = 7;
            w = 8;
            t.update(a, "name", rez);
        }
        t.find(b, "cars", temp);
        c = a + 10;
        rez = temp + " " + (a).toString();
        t.find(a, "count", temp);
        Row r = new Row(t, a);
        t.update(a, "name", rez);
        t.update(a, "count", rez);
    }
}
