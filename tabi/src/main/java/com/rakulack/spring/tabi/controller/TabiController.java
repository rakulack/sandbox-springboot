package com.rakulack.spring.tabi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TabiController {

    @GetMapping("/")
	public String get() {
		return "tabi";
	}

}
