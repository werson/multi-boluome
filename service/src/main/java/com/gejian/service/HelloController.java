package com.gejian.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HelloController {

    @GetMapping(value = "/index")
    public String index(){
        System.out.println("------index--------");
        return "index";
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
    }

}
