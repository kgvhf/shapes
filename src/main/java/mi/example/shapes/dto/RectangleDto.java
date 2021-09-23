package mi.example.shapes.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@Validated
public class RectangleDto {

    @Schema(description = "сторона прямоугольника", required = true, example = "30")
    @Min(1)
    public double a;
    
    @Schema(description = "сторона прямоугольника", required = true, example = "50")
    @Min(1)
    public double b;
}
