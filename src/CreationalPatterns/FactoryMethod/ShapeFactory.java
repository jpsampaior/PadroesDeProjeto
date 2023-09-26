package CreationalPatterns.FactoryMethod;

public class ShapeFactory {
    public static AGeometric getShape(String name) {
        if(name.equals("Hexagon")) {
            return new Hexagon();
        } else if(name.equals("Circle")) {
            return new Circle();
        } else if(name.equals("Cube")) {
            return new Cube();
        }

        return null;
    }
}
