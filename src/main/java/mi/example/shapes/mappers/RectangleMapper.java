package mi.example.shapes.mappers;

import mi.example.shapes.entities.Rectangle;
import mi.example.shapes.entities.Square;
import org.springframework.stereotype.Component;

@Component
public class RectangleMapper {

    private Rectangle rectangle;

    public RectangleMapper(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Rectangle createFromDto(mi.example.shapes.dto.RectangleDto rectangleDto) {
        return this.rectangle
                .setA(rectangleDto.getA())
                .setB(rectangleDto.getB());
    }
}
