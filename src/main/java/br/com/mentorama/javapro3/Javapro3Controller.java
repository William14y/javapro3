package br.com.mentorama.javapro3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class Javapro3Controller {

    private final String hlw = "Hello World";

    @GetMapping
    public String helloWorld(){
        return hlw;
    }
}
