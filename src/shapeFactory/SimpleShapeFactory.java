package shapeFactory;

import shape.Circle;
import shape.IShape;
import shape.Rectangle;
import shape.Square;

import java.util.Scanner;

/**
 * Concrete creator
 */
public class SimpleShapeFactory implements IShapeFactory {

    /**
     * Create a shape by typing a number.
     */
    @Override
    public IShape createShape() {
        Scanner scanner = new Scanner(System.in);
        IShape shape;

        System.out.println("What do you want to create?");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.print("\nEnter only the number: ");
        byte n = scanner.nextByte();

        switch (n) {
            case 1:
                shape = new Circle();
                break;
            case 2:
                shape = new Rectangle();
                break;
            case 3:
                shape = new Square();
                break;
            default:
                System.out.println("There is no such shape. So, I'm choosing a circle.");
                shape = new Circle();
        }

        return shape;
    }

}
