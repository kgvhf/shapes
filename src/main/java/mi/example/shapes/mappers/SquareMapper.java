package mi.example.shapes.mappers;

import mi.example.shapes.entities.Circle;
import mi.example.shapes.entities.Square;
import org.springframework.stereotype.Component;

@Component
public class SquareMapper {

    private Square square;

    public SquareMapper(Square square) {
        this.square = square;
    }

    public Square createFromDto(mi.example.shapes.dto.SquareDto squareDto) {
        return this.square
                .setA(squareDto.getA());
    }
}
