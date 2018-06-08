package com.gejian.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.gejian.service.dao.User;

@Controller
public class WebController {

    @GetMapping(value = "/index")
    public String index(){
        User user = new User();
        user.setName("werson");
        System.out.println("-------this is index, name=" + user.getName() + "-----");
        return "index";
    }

}
