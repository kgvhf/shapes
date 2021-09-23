package mi.example.shapes.services;

import mi.example.shapes.entities.Shape;
import org.springframework.stereotype.Component;

@Component
public class ShapeService {

    public double calcArea(Shape shape) {
        return round(shape.calcArea());
    }

    public double calcPerimeter(Shape shape) {
        return round(shape.calcPerimeter());
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
