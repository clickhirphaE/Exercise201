package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform1")
    public String loadloginform(){
        return "loadform";
    }
    @RequestMapping("/loadconfirm")
    public String Confirm(@RequestParam("login1") String login1, Model model){
        model.addAttribute("Login_value",login1);
        return "confirm";
    }

}
