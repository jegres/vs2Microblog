package com.vs2.microblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Walde on 19.03.16.
 */
@Controller
public class LoginController {

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String greeting(@RequestParam(value="name", defaultValue="World", required = false) String name, Model model) {
        model.addAttribute("name", name);

        return "login";
    }
}
