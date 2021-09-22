package mi.example.shapes.dto;


import io.swagger.v3.oas.annotations.media.Schema;

public class CircleDto {

    @Schema(description = "радиус", required = true, example = "50")
    public double r;

    public double getR() {
        return r;
    }

    public CircleDto setR(double r) {
        this.r = r;
        return this;
    }
}
