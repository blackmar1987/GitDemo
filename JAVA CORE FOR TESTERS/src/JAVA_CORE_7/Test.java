package JAVA_CORE_7;


public class Test {
    static String str = "Value 1";

    public static void changeIt(String s) {
        s = "Value 2";
        System.out.println(str);
    }

    public static void main(String[] args) {
        changeIt(str);
        System.out.println(str);
    }
}
