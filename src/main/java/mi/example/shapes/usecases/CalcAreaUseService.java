package mi.example.shapes.usecases;

import mi.example.shapes.entities.Shape;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


/**
 * рассчет площади фигуры
 */
@Component
public class CalcAreaUseService {

    public double calc(Shape shape) {
        return Math.round(shape.calcArea() * 100.0) / 100.0;
    }
}
