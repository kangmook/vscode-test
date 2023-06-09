package com.skmns.infra.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skmns.infra.service.AuthService;


@Controller
public class HomeController {
    
	@Autowired
	private AuthService authService;

    @RequestMapping("/")
	public String hello(Model model) throws InterruptedException, ExecutionException, JsonProcessingException {
		// HashMap<String, Object> rtnMap = new HashMap<String, Object>();
		// rtnMap.put("authList", authService.selectAuthList());
		// rtnMap.put("asyncAuthList", authService.selectAuthList1().get());
		// System.out.println("asyncAuthList >>> " + rtnMap.get("asyncAuthList"));
		//odel.addAttribute("authList", authService.selectAuthList());

		ObjectMapper mapper = new ObjectMapper();
		String asyncAuthList = mapper.writeValueAsString(authService.selectAuthList1().get());

		model.addAttribute("asyncAuthList", asyncAuthList);


		return "home";
	}
}
