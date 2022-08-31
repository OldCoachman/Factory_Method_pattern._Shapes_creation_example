import shape.IShape;
import shapeFactory.ConcreteShapeFactory;
import shapeFactory.IShapeFactory;

public class Main {

    public static void main(String[] args) {

        // Choose by which concrete factory we create a shape.
        IShapeFactory shapeFactory = new ConcreteShapeFactory();

        // Create a shape not by the 'new' operator, but by concrete factory.
        IShape shape = shapeFactory.createCircle();
        shape.getShape();

        shape = shapeFactory.createSquare();
        shape.getShape();
        
        shape = shapeFactory.createRectangle();
        shape.getShape();
    }
}
