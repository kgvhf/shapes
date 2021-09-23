package mi.example.shapes.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@Validated
public class TriangleDto {

    @Schema(description = "сторона b", required = true, example = "50")
    @Min(1)
    public double b;
    @Schema(description = "сторона c", required = true, example = "50")
    @Min(1)
    public double c;
    @Schema(description = "угол между ними", required = true, example = "90")
    @Min(1)
    public double angle;
}
