package JAVA_CORE_7;

public class Simple {
    private int i;
    private boolean b;
    private String s;


    Simple() {
        int y =1;
        if (i > 0) y = 5;
        System.out.println("i = " + i + " b = " + b + " s = " + s + " y = " + y);

        String s = ""; for (int i = 0; i < 3; i++) {s = s + '_';}
        System.out.println(s);

    }

    public static void main(String[] args) {
        Simple Simple = new Simple();
    }
}