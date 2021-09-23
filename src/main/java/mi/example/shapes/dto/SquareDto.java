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
public class SquareDto {

    @Schema(description = "сторона квадрата", required = true)
    @Min(1)
    public double a;
}
