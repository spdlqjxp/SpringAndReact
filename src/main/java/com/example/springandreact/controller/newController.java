package com.example.springandreact.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class newController {
    @RequestMapping(value = "/test/hello")
    @ResponseBody
    public String helloRuckus(Model model) {
        return "Hello Ruckus";
    }

}