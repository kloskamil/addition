package biz.klos.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NumbersService {

    private final RestTemplate restTemplate;

    public NumbersService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getNumberFromApi() {
        String url = "https://www.random.org/integers/?num=1&min=1&max=999&col=1&base=10&format=plain&rnd=new";
        return this.restTemplate.getForObject(url, String.class);
    }

    public String adding() {
        double randomNumber = Math.random();
        double numberFromApi = Double.parseDouble(getNumberFromApi());
        double result = numberFromApi + randomNumber;
        String randomNumberString = Double.toString(randomNumber);
        String numberFromApiString = Double.toString(numberFromApi);
        String resultString = Double.toString(result);
        String finalString = randomNumberString+" + "+numberFromApiString+" = "+resultString;
        return finalString;
    }

}