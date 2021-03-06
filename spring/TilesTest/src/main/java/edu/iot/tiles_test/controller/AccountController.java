package edu.iot.tiles_test.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.iot.tiles_test.exceoption.LoginFailException;
import edu.iot.tiles_test.model.Member;
import edu.iot.tiles_test.service.AccountService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService service;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public void loginForm(Member member) {	
//		return "account/login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String loginSubmit(Member member,HttpSession session, Model model) {
		
		try {
			service.login(member);
//		성공
			session.setAttribute("USER", member);
			return "redirect:/";
		} catch (LoginFailException e) {			
//		실패
			model.addAttribute("error", e.getMessage());
			return "account/login";
		}
		
		
		
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public void joinForm(Member member) {
		
	}
	
	@RequestMapping(value="/join", method = RequestMethod.POST)
	public String joinSubmit(@Valid Member member, BindingResult result) {
		
		log.info(member.toString());
		if(result.hasErrors()) {
			return "account/join";
		}
		
		return "redirect:/";
	}
	
}
