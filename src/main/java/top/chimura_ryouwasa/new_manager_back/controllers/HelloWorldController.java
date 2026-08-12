package top.chimura_ryouwasa.new_manager_back.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello_word!";
    }
}
