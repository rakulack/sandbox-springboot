package com.rakulack.spring.tabi.controller.signup;

import com.rakulack.spring.tabi.service.AccountService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * アカウント登録にかかわる動作を管理する
 * 
 * @author rakulack
 */
@Controller
public class SignupController {

	private final AccountService accountService;

	public SignupController(AccountService accountService) {
		this.accountService = accountService;
	}

	@GetMapping(value = "/signup")
	public String get() {
		return "signup";
	}

	@PostMapping(value = "/signup")
	public String post(@ModelAttribute("signup") SignupForm signupForm, RedirectAttributes redirectAttributes) {
		String[] roles = { "ROLE_USER" };
		accountService.register(signupForm.getEmail(), signupForm.getPassword(), roles);
		redirectAttributes.addFlashAttribute("successMessage", "アカウントの登録が完了しました。利用する場合はログインしてください");
		return "redirect:/";
	}
}
