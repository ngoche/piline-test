package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//change 4

    @GetMapping("odey")
    public String getString1(){
        return "<div style=\"color: gold;\">odey</div>";
    }
}
