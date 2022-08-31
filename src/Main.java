import shape.IShape;
import shapeFactory.SimpleShapeFactory;
import shapeFactory.IShapeFactory;

public class Main {

    public static void main(String[] args) {

        // Choose by which concrete factory we create a shape.
        IShapeFactory shapeFactory = new SimpleShapeFactory();

        // Create a shape not by the 'new' operator, but by concrete factory.
        IShape shape = shapeFactory.createShape();
        shape.getShape();

    }
}
