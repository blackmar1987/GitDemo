package JAVA_CORE_9_CONTROL;

public class ShapeFactory extends AbstractFactory  {

    @Override
    public Shape getShape(String shape){
        if (shape==null) {
            return null;}
        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();}

        if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();}

        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();}

        return null;

    }

    @Override
    Color getColor(String color) {
        return null;
    }

}
