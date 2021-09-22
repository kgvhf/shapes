package mi.example.shapes.usecases;

import mi.example.shapes.entities.Shape;
import org.springframework.stereotype.Component;

/**
 * рассчет периметра фигуры
 */
@Component
public class CalcPerimeterUseService {
    public double calc(Shape shape) {
        return Math.round(shape.calcPerimeter() * 100.0) / 100.0;
    }
}
