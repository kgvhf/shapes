package mi.example.shapes.controllers;

import mi.example.shapes.dto.*;
import mi.example.shapes.entities.Circle;
import mi.example.shapes.entities.Rectangle;
import mi.example.shapes.entities.Square;
import mi.example.shapes.entities.Triangle;
import mi.example.shapes.entities.Shape;
import mi.example.shapes.usecases.CalcAreaUseService;
import mi.example.shapes.usecases.CalcPerimeterUseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "api/shape")
public class ShapeController {

    @Autowired
    CalcAreaUseService calcAreaUseService;
    @Autowired
    CalcPerimeterUseService calcPerimeterUseService;

    @GetMapping()
    public String homePage() {
        return "home page";
    }

    @ResponseBody
    @RequestMapping(value = "calcTriangle", method = RequestMethod.POST)
    public CalcShapeResponse calcTriangle(@Valid @RequestBody TriangleDto triangleDto) {
        Shape shape = new Triangle()
                .setB(triangleDto.getB())
                .setC(triangleDto.getC())
                .setY(triangleDto.getAngle());

        return new CalcShapeResponse(shape.getType(), calcAreaUseService.calc(shape), calcPerimeterUseService.calc(shape));
    }

    @ResponseBody
    @RequestMapping(value = "calcSquare", method = RequestMethod.POST)
    public CalcShapeResponse calcSquare(@Valid @RequestBody SquareDto squareDto) {
        Shape shape = new Square()
                .setA(squareDto.getA());

        return new CalcShapeResponse(shape.getType(), calcAreaUseService.calc(shape), calcPerimeterUseService.calc(shape));
    }

    @ResponseBody
    @RequestMapping(value = "calcRectangle", method = RequestMethod.POST)
    public CalcShapeResponse calcRectangle(@Valid @RequestBody RectangleDto rectangleDto) {
        Shape shape = new Rectangle()
                .setA(rectangleDto.getA())
                .setB(rectangleDto.getB());

        return new CalcShapeResponse(shape.getType(), calcAreaUseService.calc(shape), calcPerimeterUseService.calc(shape));
    }

    @ResponseBody
    @RequestMapping(value = "calcCircle", method = RequestMethod.POST)
    public CalcShapeResponse calcCircle(@Valid @RequestBody CircleDto circleDto) {
        Shape shape = new Circle()
                .setR(circleDto.getR());

        return new CalcShapeResponse(shape.getType(), calcAreaUseService.calc(shape), calcPerimeterUseService.calc(shape));
    }
}