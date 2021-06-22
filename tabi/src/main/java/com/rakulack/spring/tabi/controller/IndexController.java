package com.rakulack.spring.tabi.controller;

import java.security.Principal;

import com.rakulack.spring.tabi.auth.SimpleLoginUser;
import com.rakulack.spring.tabi.repository.HeaderRepository;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	HeaderRepository headerRepository;

	public IndexController(HeaderRepository headerRepository) {
		this.headerRepository = headerRepository;
	}

	@GetMapping(value = "/")
	public String get(Principal principal, Model model) {
		if (principal != null) {
			Authentication authentication = (Authentication) principal;
			SimpleLoginUser loginUser = (SimpleLoginUser) authentication.getPrincipal();
			model.addAttribute("headers", headerRepository.findByUserIdOrderByPrcDate(loginUser.getUser().getId()));
		}

		return "index";
	}
}
