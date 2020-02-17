package biz.klos.integration.impl;

import biz.klos.integration.ExternalSystemService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class ExternalSystemServiceImpl implements ExternalSystemService {

    @Override
    public BigDecimal getExternalNumber() {
        return getNumberFromApi();
    }

    private String applyNewLineFilter(String string) {
        string = string.substring(0, string.length() - 1);
        return string;
    }

    private BigDecimal getNumberFromApi() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.random.org/integers/?num=1&min=1&max=999&col=1&base=10&format=plain&rnd=new";
        String value = restTemplate.getForObject(url, String.class);
        value = applyNewLineFilter(value);
        BigDecimal numberFromApi = null;
        if (value != null) {
            numberFromApi = new BigDecimal(value);
        }
        return numberFromApi;
    }

}
