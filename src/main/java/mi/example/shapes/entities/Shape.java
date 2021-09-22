package mi.example.shapes.entities;

import mi.example.shapes.entities.ShapeType;

public interface Shape {
    public ShapeType getType();

    public double calcArea();

    public double calcPerimeter();
}
