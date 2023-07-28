package kz.mirazh.rest_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start/v1/")
public class MainControllerV1 {
    @GetMapping("getInit")
    public String getInit() {
        return "Hello world";
    }
}
