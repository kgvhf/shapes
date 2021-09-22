package mi.example.shapes.dto;


import io.swagger.v3.oas.annotations.media.Schema;

public class SquareDto {

    @Schema(description = "сторона квадрата", required = true, example = "50")
    public double a;

    public double getA() {
        return a;
    }

    public SquareDto setA(double a) {
        this.a = a;
        return this;
    }
}
