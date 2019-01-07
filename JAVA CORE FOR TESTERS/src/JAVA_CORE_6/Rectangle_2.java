/*Создайте класс треуголников на координатной плоскости, используя в качестве полей объекты-точки.
Реализуйте в классе:a) конструктор, позволяющий задавать вершины с клавиатуры;
b) метод print() выводящий описание треугольника на экран;
c) методы для вычисления периметра и площади треугольника.
 */

package JAVA_CORE_6;

import java.util.Scanner;

import static java.lang.Math.*;

public class Rectangle_2 {

    public static void main(String[] args) {
        Rectangle_2 NewRectangle = new Rectangle_2();
    }

    public int x1, x2, x3;
    public int y1, y2, y3;
    public double perimeter;


    Rectangle_2() {


        System.out.println("Ведите координаты первой точки : введите x1 ");

        Scanner in = new Scanner(System.in);
        this.x1 = in.nextInt();

        System.out.println("Ведите координаты первой точки : введите y1 ");
        this.y1 = in.nextInt();


        System.out.println("Ведите координаты второй точки : введите x2 ");
        this.x2 = in.nextInt();

        System.out.println("Ведите координаты второй точки : введите y2 ");
        this.y2 = in.nextInt();

        while (x1==x2&&y1==y2){
            System.out.println("Вторая вершина треугольника не может совпадать с первой ");
            System.out.println("Ведите координаты второй точки : введите x2 ");
            this.x2 = in.nextInt();
            System.out.println("Ведите координаты второй точки : введите y2 ");
            this.y2 = in.nextInt();

        }

        System.out.println("Ведите координаты третьей точки : введите x3 ");
        this.x3 = in.nextInt();

        System.out.println("Ведите координаты третьей точки : введите y3 ");
        this.y3 = in.nextInt();


        /* точки лежат на одной прямой если
        (x1 - x3)(y2 - y3) - (x2 - x3)(y1 - y3) = 0*/

        while ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {

            if (x3 == x2 && y3 == y2) {
                System.out.println("Третья вершина треугольника не может совпадать со второй");}
                else
            if (x3 == x1 && y3 == y1) {
                System.out.println("Третья вершина треугольника не может совпадать с первой");}
            else
                System.out.println("Все точки треугольника лежат на одной прямой");

            System.out.println("Ведите координаты третьей точки : введите x3 ");
            this.x3 = in.nextInt();
            System.out.println("Ведите координаты третьей точки : введите y3 ");
            this.y3 = in.nextInt();

            while (x3 == x2 && y3 == y2) {
                System.out.println("Третья вершина треугольника не может совпадать со второй");
                this.x3 = in.nextInt();
                this.y3 = in.nextInt();

                while (x3 == x1 && y3 == y1) {
                    System.out.println("Третья вершина треугольника не может совпадать с первой");
                    this.x3 = in.nextInt();
                    this.y3 = in.nextInt();
                }

            }

            while (x3 == x1 && y3 == y1) {
                System.out.println("Третья вершина треугольника не может совпадать с первой");
                this.x3 = in.nextInt();
                this.y3 = in.nextInt();

                while (x3 == x2 && y3 == y2) {
                    System.out.println("Третья вершина треугольника не может совпадать со второй");
                    this.x3 = in.nextInt();
                    this.y3 = in.nextInt();
                }

            }
        }


        System.out.println("Периметр прямоугольника равен : " + this.perimeter());


    }

/*Р = АВ + ВС + СА = √((X₂-X₁)² + (Y₂-Y₁)²) + √(( X₃-X₂)² + (Y₃-Y₂)²) + √((X₃-X₁)² + (Y₃-Y₁)²).*/
    double perimeter() { perimeter = sqrt(pow((x2-x1), 2) + pow((y2-y1), 2)) + sqrt(pow((x3-x2), 2) + pow((y3-y2), 2)) + sqrt(pow((x3-x1), 2) + pow((y3-y1), 2));
        return perimeter;
    }


}


/*проверка A(1, 8), B(-2, -7), C(-4, -17)*/