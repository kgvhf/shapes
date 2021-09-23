package mi.example.shapes.mappers;

import mi.example.shapes.entities.Circle;
import mi.example.shapes.entities.Triangle;
import org.springframework.stereotype.Component;

@Component
public class CircleMapper {

    private Circle circle;

    public CircleMapper(Circle circle) {
        this.circle = circle;
    }

    public Circle createFromDto(mi.example.shapes.dto.CircleDto circleDto) {
        return this.circle
                .setR(circleDto.getR());
    }
}
