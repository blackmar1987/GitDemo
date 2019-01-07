package JAVA_CORE_9_CONTROL;

public class FactoryProducer {
public AbstractFactory getFactory(String choice) {

    if (choice.equalsIgnoreCase("SHAPE")){
        return new ShapeFactory();
    }

    if (choice.equalsIgnoreCase("SHAPE")){
        return new ColorFactory();
    }

    return null;

}

}
