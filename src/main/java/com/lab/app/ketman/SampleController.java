package com.lab.app.ketman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}