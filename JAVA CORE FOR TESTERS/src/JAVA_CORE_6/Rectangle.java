/*Создайте класс Rectangle, используя в качестве полей длину сторон a и b.
Реализуйте в классе:

конструктор, позволяющий вводить длины сторон a и b;
метод print() выводящий описание Rectangle на экран через toString();
методы для вычисления периметра Rectangle;
Определите методы equals() и hashCode().


Доработайте конструктор таким образом, чтобы при вводе длин сторон a=0 или b=0 выводилось сообщение на экран.

*/
package JAVA_CORE_6;
import java.io.*;
import java.util.*;




public class Rectangle {

    public static void main(String[] args) {
        Rectangle NewRectangle = new Rectangle();
        System.out.println("Периметр прямоугольника равен : " + NewRectangle.perimeter());
    }

    public int a;
    public int b;
    public int perimeter;


    Rectangle() {
        Scanner in = new Scanner(System.in);
        this.a = in.nextInt();
        while(a==0) {
            System.out.println("A не может быть равно нулю - попробуйте еще раз");
            this.a = in.nextInt();
        }

        this.b = in.nextInt();
        while(b==0) {
            System.out.println("B не может быть равно нулю - попробуйте еще раз");
            this.b = in.nextInt();
        }


    }


    int perimeter() { perimeter = 2*a +2*b;
    return perimeter;

    }


}
