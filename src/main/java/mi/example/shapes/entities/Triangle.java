package mi.example.shapes.entities;

public class Triangle implements Shape {

    /**
     * Сторона B
     */
    private double b;
    /**
     * Сторона С
     */
    private double c;
    /**
     * Угол между ними
     */
    private double angle;

    @Override
    public ShapeType getType() {
        return ShapeType.TRIANGLE;
    }

    public Triangle setB(double b) {
        this.b = b;
        return this;
    }

    public Triangle setC(double c) {
        this.c = c;
        return this;
    }

    public Triangle setY(double angle) {
        this.angle = angle;
        return this;
    }

    public double calcArea() {
        // Считаем третюю сторону
        double a = calc3part();
        // полупериметр
        double pp = (a + b + c) / 2.0;
        // прямо по формуле Герона из вики
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    /**
     * Считаем третюю сторону
     */
    private double calc3part() {
        return Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2) - 2 * b * c * Math.cos(angle));
    }

    public double calcPerimeter() {
        // Считаем третюю сторону
        double a = calc3part();

        return a + b + c;
    }
}
