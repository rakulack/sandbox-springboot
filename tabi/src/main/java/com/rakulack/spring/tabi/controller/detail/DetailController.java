package com.rakulack.spring.tabi.controller.detail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailController {

    @GetMapping("/detail")
    public String get() {
        return "detail";
    }

}
