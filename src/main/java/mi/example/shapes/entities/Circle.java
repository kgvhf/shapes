package mi.example.shapes.entities;

public class Circle implements Shape {
    /**
     * радиус
     */
    private double r;

    @Override
    public ShapeType getType() {
        return ShapeType.CIRCLE;
    }

    public Circle setR(double r) {
        this.r = r;
        return this;
    }

    public double calcArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public double calcPerimeter() {
        return 2 * Math.PI * r;
    }
}
