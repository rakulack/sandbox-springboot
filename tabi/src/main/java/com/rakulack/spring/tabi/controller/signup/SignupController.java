package com.rakulack.spring.tabi.controller.signup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * アカウント登録にかかわる動作を管理する
 * @author rakulack
 */
@Controller
@RequestMapping(value = "signup")
public class SignupController {

    @GetMapping("/")
	public String get() {
		return "signup";
	}

    @PostMapping("/")
	public String post(@ModelAttribute("signup") SignupForm signupForm, RedirectAttributes redirectAttributes) {
		return "redirect:/";
	}

}
