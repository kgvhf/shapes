package mi.example.shapes.view;


import mi.example.shapes.entities.ShapeType;
import org.springframework.stereotype.Component;

@Component
public class ShapeResponse {
    private ShapeType type;
    private double area;
    private double perimeter;

    public ShapeType getType() {
        return type;
    }

    public ShapeResponse setType(ShapeType type) {
        this.type = type;
        return this;
    }

    public double getArea() {
        return area;
    }

    public ShapeResponse setArea(double area) {
        this.area = area;
        return this;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public ShapeResponse setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        return this;
    }
}
