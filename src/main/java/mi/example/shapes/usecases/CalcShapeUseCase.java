package mi.example.shapes.usecases;

import mi.example.shapes.dto.*;
import mi.example.shapes.entities.Shape;
import mi.example.shapes.mappers.CircleMapper;
import mi.example.shapes.mappers.RectangleMapper;
import mi.example.shapes.mappers.SquareMapper;
import mi.example.shapes.mappers.TriangleMapper;
import mi.example.shapes.services.ShapeService;
import mi.example.shapes.view.ShapeResponse;
import org.springframework.stereotype.Component;

@Component
public class CalcShapeUseCase {

    private final ShapeResponse shapeResponse;
    private final ShapeService shapeService;
    private final TriangleMapper triangleMapper;
    private final CircleMapper circleMapper;
    private final SquareMapper squareMapper;
    private final RectangleMapper rectangleMapper;

    public CalcShapeUseCase(ShapeResponse shapeResponse, ShapeService shapeService, TriangleMapper triangleMapper, CircleMapper circleMapper, SquareMapper squareMapper, RectangleMapper rectangleMapper) {
        this.shapeResponse = shapeResponse;
        this.shapeService = shapeService;
        this.triangleMapper = triangleMapper;
        this.circleMapper = circleMapper;
        this.squareMapper = squareMapper;
        this.rectangleMapper = rectangleMapper;
    }

    public ShapeResponse calcTriangle(TriangleDto triangleDto) {
        Shape shape = triangleMapper.createFromDto(triangleDto);

        return getResponse(shape);
    }

    public ShapeResponse calcCirlce(CircleDto circleDto) {
        Shape shape = circleMapper.createFromDto(circleDto);

        return getResponse(shape);
    }

    public ShapeResponse calcSquare(SquareDto squareDto) {
        Shape shape = squareMapper.createFromDto(squareDto);

        return getResponse(shape);
    }

    public ShapeResponse calcRectangle(RectangleDto rectangleDto) {
        Shape shape = rectangleMapper.createFromDto(rectangleDto);

        return getResponse(shape);
    }

    private ShapeResponse getResponse(Shape shape) {
        return shapeResponse
                .setType(shape.getType())
                .setArea(shapeService.calcArea(shape))
                .setPerimeter(shapeService.calcPerimeter(shape));
    }


}
