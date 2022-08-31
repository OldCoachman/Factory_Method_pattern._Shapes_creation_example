package shapeFactory;

import shape.Circle;
import shape.IShape;
import shape.Rectangle;
import shape.Square;

public class SimpleShapeFactory implements IShapeFactory {
    
    @Override
    public IShape createCircle() {
        return new Circle();
    }

    @Override
    public IShape createSquare() {
        return new Square();
    }

    @Override
    public IShape createRectangle() {
        return new Rectangle();
    }
}
