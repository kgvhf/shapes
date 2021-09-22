package mi.example.shapes.entities;

public class Square implements Shape {
    /**
     * Сторона a
     */
    private double a;

    @Override
    public ShapeType getType() {
        return ShapeType.SQUARE;
    }

    public Square setA(double a) {
        this.a = a;
        return this;
    }

    public double calcArea() {
        return Math.pow(a, 2);
    }

    public double calcPerimeter() {
        return 4 * a;
    }
}
