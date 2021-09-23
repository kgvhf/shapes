package mi.example.shapes.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@Validated
public class CircleDto {

    @Schema(description = "радиус", required = true, example = "50")
    @Min(1)
    public double r;
}
