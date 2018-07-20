package gmail.nathanv75.spring.boot.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nathan Voskamp on 2018-07-19.
 */
@RestController
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello World!";
    }

}
