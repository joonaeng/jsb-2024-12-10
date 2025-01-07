package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public int home() {
        return 22;
    }

    @GetMapping("/about")
    @ResponseBody
    public void about() {
        System.out.println("about hello");
    }
}
