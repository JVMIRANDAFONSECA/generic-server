package fonsecaecunha.example.genericserver.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class ApiController {


    @RequestMapping("/helloWorld")
    public String index() {
        return "Hello World!";
    }


}
