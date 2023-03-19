package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create")   //this is mapping provides navigating from welcome page to open user creator page (means click user create page and open it)
    public String createUser(Model model){
        model.addAttribute("user", new UserDTO());
       // model.addAttribute("roles", new )

   //deneme

       return "/user/create";
    }

}
