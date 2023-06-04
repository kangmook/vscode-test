package com.skmns.infra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping("/")
	public String hello() {
		System.out.println("====== Home.jsp 호출 =======");
		return "home";
	}
}
