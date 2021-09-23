package mi.example.shapes.mappers;

import mi.example.shapes.dto.TriangleDto;
import mi.example.shapes.entities.Triangle;
import org.springframework.stereotype.Component;

@Component
public class TriangleMapper {

    private Triangle triangle;

    public TriangleMapper(Triangle triangle) {
        this.triangle = triangle;
    }

    public Triangle createFromDto(TriangleDto triangleDto) {
        return this.triangle
                .setB(triangleDto.getB())
                .setC(triangleDto.getC())
                .setY(triangleDto.getAngle());
    }
}
