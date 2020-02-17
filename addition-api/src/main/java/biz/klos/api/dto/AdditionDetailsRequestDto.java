package biz.klos.api.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AdditionDetailsRequestDto {
    private BigDecimal externalSystemNumber;
    private BigDecimal databaseNumber;
    private BigDecimal additionResult;
}