package edu.iot.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import edu.iot.spring.HomeController;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HelloController {
	private static final Logger logger=
								LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		logger.info("/hello 요청 처리");
		logger.warn("/hello 요청 처리");
		ModelAndView  mav = new ModelAndView();
		mav.setViewName("test/hello");
		mav.addObject("greeting", getGreeting());
				
		return mav;
	}
	
	@RequestMapping("/hello2")
	public String hello2(Model model) {
		model.addAttribute("greeting",getGreeting());
		return "test/hello";
	}
	
	private String getGreeting() {
		return "안녕하세요";
	}
}
