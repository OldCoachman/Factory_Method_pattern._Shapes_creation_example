package shapeFactory;

import shape.IShape;

public interface IShapeFactory {
    IShape createCircle();
    IShape createSquare();
    IShape createRectangle();
}
