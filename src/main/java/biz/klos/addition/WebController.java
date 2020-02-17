package biz.klos.addition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WebController {

    @Autowired
    private NumbersService numbersService;

    @RequestMapping("/")
    public String index() {
        return numbersService.adding() ;
    }

}