/*Create a program which calculates the expression 14/209 + 14 * (29-13² + 14/3) and displays the result on the screen.
 */


package JAVA_CORE_1;

public class Home_Work_1_3 {
    public static void main(String[] args) {

        double a = 14 / 209;
        double b = 14 * (29 - Math.pow(13, 2) + 14 / 3);
        double c = a + b;
        System.out.print(c);
    }
}
