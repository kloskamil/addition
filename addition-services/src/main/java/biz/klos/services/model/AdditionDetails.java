package biz.klos.services.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AdditionDetails {
    private BigDecimal externalSystemNumber;
    private BigDecimal databaseNumber;
    private BigDecimal additionResult;
}

