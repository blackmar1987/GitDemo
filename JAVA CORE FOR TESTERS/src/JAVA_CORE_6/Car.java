package JAVA_CORE_6;

public class Car {

public static void main (String[] args) {
    Car NewCar = new Car();
    NewCar.drive(3);
    System.out.println(NewCar.distance);
        }

    public  int speed = 50;
    public  int distance;
    public void start(){
        speed = 0;};

    public void stop(){speed = 50;};
    public int drive (int howlong){
        distance = howlong * speed;
        return distance;
    };


}
