package xyz.fz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/time")
    public String time() {
        return System.currentTimeMillis() + "";
    }
}
