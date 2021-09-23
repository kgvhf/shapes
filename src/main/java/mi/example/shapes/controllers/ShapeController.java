package mi.example.shapes.controllers;

import mi.example.shapes.dto.*;
import mi.example.shapes.usecases.CalcShapeUseCase;
import mi.example.shapes.view.ShapeResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@Validated
@RestController
@RequestMapping(path = "api/shape")
public class ShapeController {

    private final CalcShapeUseCase calcShapeUseCase;

    public ShapeController(CalcShapeUseCase calcShapeUseCase) {
        this.calcShapeUseCase = calcShapeUseCase;
    }

    @GetMapping()
    public String homePage() {
        return "home page";
    }

    @ResponseBody
    @RequestMapping(value = "calcTriangle", method = RequestMethod.POST)
    public ShapeResponse calcTriangle(@Valid @RequestBody TriangleDto triangleDto) {
        return calcShapeUseCase.calcTriangle(triangleDto);
    }

    @ResponseBody
    @RequestMapping(value = "calcSquare", method = RequestMethod.POST)
    public ShapeResponse calcSquare(@Valid @RequestBody SquareDto squareDto) {
        return calcShapeUseCase.calcSquare(squareDto);
    }

    @ResponseBody
    @RequestMapping(value = "calcRectangle", method = RequestMethod.POST)
    public ShapeResponse calcRectangle(@Valid @RequestBody RectangleDto rectangleDto) {
        return calcShapeUseCase.calcRectangle(rectangleDto);
    }

    @ResponseBody
    @RequestMapping(value = "calcCircle", method = RequestMethod.POST)
    public ShapeResponse calcCircle(@Valid @RequestBody CircleDto circleDto) {
        return calcShapeUseCase.calcCirlce(circleDto);
    }
}