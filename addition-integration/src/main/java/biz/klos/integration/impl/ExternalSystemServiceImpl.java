package biz.klos.integration.impl;

import biz.klos.integration.ExternalSystemService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
@PropertySource("classpath:application.properties")
public class ExternalSystemServiceImpl implements ExternalSystemService {

    @Value("${external.system.url}")
    private String url;

    @Override
    public BigDecimal getExternalNumber() {
        return getNumberFromApi();
    }

    private String applyNewLineFilter(String string) {
        return string.substring(0, string.length() - 1);
    }

    private BigDecimal getNumberFromApi() {
        RestTemplate restTemplate = new RestTemplate();
        String value = restTemplate.getForObject(url, String.class);
        value = applyNewLineFilter(value);
        return new BigDecimal(value);
    }
}
