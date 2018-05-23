package xyz.fz.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/time")
    public String time(@RequestBody Map params) {
        return System.currentTimeMillis() + params.toString();
    }
}
