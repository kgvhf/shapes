package mi.example.shapes.dto;


import io.swagger.v3.oas.annotations.media.Schema;

public class RectangleDto {

    @Schema(description = "сторона прямоугольника", required = true, example = "30")
    public double a;
    @Schema(description = "сторона прямоугольника", required = true, example = "50")
    public double b;

    public double getA() {
        return a;
    }

    public RectangleDto setA(double a) {
        this.a = a;
        return this;
    }

    public double getB() {
        return b;
    }

    public RectangleDto setB(double b) {
        this.b = b;
        return this;
    }
}
