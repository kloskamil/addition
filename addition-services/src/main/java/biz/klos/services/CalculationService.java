package biz.klos.services;


import biz.klos.integration.ExternalSystemService;
import biz.klos.services.model.AdditionDetails;
import biz.klos.services.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class CalculationService {

    @Autowired
    private NumberRepository numberRepository;

    @Autowired
    private ExternalSystemService externalSystemService;

    public AdditionDetails calculate() {
        AdditionDetails result = new AdditionDetails();

        result.setDatabaseNumber(numberRepository.findNumber());
        result.setExternalSystemNumber(externalSystemService.getExternalNumber());

        return result;
    }

}