package CreationalPatterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        AGeometric hexagon = ShapeFactory.getShape("Hexagon");
        hexagon.draw();
    }
}
