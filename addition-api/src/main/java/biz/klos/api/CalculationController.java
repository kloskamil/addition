package biz.klos.api;

import biz.klos.api.dto.AdditionDetailsRequestDto;
import biz.klos.api.transformer.CalculationTransformer;
import biz.klos.services.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    @Autowired
    private CalculationService calculationService;

    @GetMapping("/")
    public AdditionDetailsRequestDto calculate() {
        return CalculationTransformer.toDto(calculationService.calculate());
    }

}