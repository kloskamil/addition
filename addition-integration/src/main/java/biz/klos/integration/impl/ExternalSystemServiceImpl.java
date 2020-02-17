package biz.klos.integration.impl;

import biz.klos.integration.ExternalSystemService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class ExternalSystemServiceImpl implements ExternalSystemService {

    @Override
    public BigDecimal getExternalNumber() {
        return getNumberFromApi();
    }

    private BigDecimal getNumberFromApi() {
        return null;
    }

}
