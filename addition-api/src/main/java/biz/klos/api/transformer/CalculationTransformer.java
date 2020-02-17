package biz.klos.api.transformer;

import biz.klos.api.dto.AdditionDetailsRequestDto;
import biz.klos.services.model.AdditionDetails;

public class CalculationTransformer {

    public static AdditionDetailsRequestDto toDto(AdditionDetails model) {
        AdditionDetailsRequestDto dto = new AdditionDetailsRequestDto();
        dto.setExternalSystemNumber(model.getExternalSystemNumber());
        dto.setDatabaseNumber(model.getDatabaseNumber());
        dto.setAdditionResult(model.getAdditionResult());
        return dto;
    }
}
