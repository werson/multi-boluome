package com.gejian.service;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HelloController {

    @GetMapping(value = "/index")
    public String index(){
        System.out.println("------index--------");
        System.out.println(this.getClass().getClassLoader().getResource("").getPath());
        return "index";
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
    }

}
