package JAVA_CORE_9_CONTROL;

public class ColorFactory extends AbstractFactory  {

    @Override
    public Color getColor(String color){
        if (color==null) {
            return null;}
        if (color.equalsIgnoreCase("RED")) {
            return new Red();}

        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();}

        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();}

        return null;

    }

    @Override
    Shape getShape(String shape) {
        return null;
    }

}
