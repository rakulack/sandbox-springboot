package com.rakulack.spring.tabi.controller;

import com.rakulack.spring.tabi.service.AccountService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	private final AccountService accountService;

	public IndexController(AccountService accountService) {
		this.accountService = accountService;
	}

    @GetMapping("/")
	public String get() {
		return "index";
	}

}
