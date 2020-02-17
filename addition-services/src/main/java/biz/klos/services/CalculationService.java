package biz.klos.services;


import biz.klos.integration.ExternalSystemService;
import biz.klos.services.model.AdditionDetails;
import biz.klos.services.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        // Tutaj należałoby wykonać sprawdzenie dodawanych wartości (np. != null itp.), ale celowo pomijam ze względu
        // na charakter demonstacyjny projektu.
        BigDecimal additionResult = result.getDatabaseNumber().add(result.getExternalSystemNumber());
        result.setAdditionResult(additionResult);
        return result;
    }

}