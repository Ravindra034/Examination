package com.practice.ravindra.Examination;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ravindra.nuggu on 03/10/18.
 */
@RestController
public class WelcomeController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hi";
    }
}
