package com.example.demo;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExampleEntity {

    @PositiveOrZero
    @Digits(integer = 2, fraction = 5)
    private BigDecimal goodExample;

    @Digits(integer = 2, fraction = 5)
    @PositiveOrZero
    private BigDecimal badExample;

}
