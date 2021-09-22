package mi.example.shapes.entities;

public class Rectangle implements Shape {

    /**
     * Сторона a
     */
    private double a;
    /**
     * Сторона a
     */
    private double b;

    @Override
    public ShapeType getType() {
        return ShapeType.RECTANGLE;
    }

    public Rectangle setA(double a) {
        this.a = a;
        return this;
    }

    public Rectangle setB(double b) {
        this.b = b;
        return this;
    }

    public double calcArea() {
        return a * b;
    }

    public double calcPerimeter() {
        return 2 * a + 2 * b;
    }
}
