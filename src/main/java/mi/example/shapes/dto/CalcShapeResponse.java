package mi.example.shapes.dto;


import mi.example.shapes.entities.ShapeType;

public class CalcShapeResponse {
    private ShapeType type;
    private double area;
    private double perimeter;

    public CalcShapeResponse(ShapeType type, double area, double perimeter) {
        this.type = type;
        this.area = area;
        this.perimeter = perimeter;
    }

    public ShapeType getType() {
        return type;
    }

    public CalcShapeResponse setType(ShapeType type) {
        this.type = type;
        return this;
    }

    public double getArea() {
        return area;
    }

    public CalcShapeResponse setArea(double area) {
        this.area = area;
        return this;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public CalcShapeResponse setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        return this;
    }
}
