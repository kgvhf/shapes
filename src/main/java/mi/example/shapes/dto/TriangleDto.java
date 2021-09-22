package mi.example.shapes.dto;


import io.swagger.v3.oas.annotations.media.Schema;

public class TriangleDto {

    @Schema(description = "сторона b", required = true, example = "50")
    public double b;
    @Schema(description = "сторона c", required = true, example = "50")
    public double c;
    @Schema(description = "угол между ними", required = true, example = "90")
    public double angle;

    public TriangleDto(double b, double c, double y) {
        this.b = b;
        this.c = c;
        this.angle = y;
    }

    public double getB() {
        return b;
    }

    public TriangleDto setB(double b) {
        this.b = b;
        return this;
    }

    public double getC() {
        return c;
    }

    public TriangleDto setC(double c) {
        this.c = c;
        return this;
    }

    public double getAngle() {
        return angle;
    }

    public TriangleDto setAngle(double angle) {
        this.angle = angle;
        return this;
    }
}
