package com.hyungjun.demo.cmm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hyungjun.demo.mbr.MemberService;

@Controller
public class HomeCtrl {
	@Autowired MemberService service;
	@GetMapping
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("----- 1 ------");
		Integer count = service.count();
		System.out.println("회원수는 총" + count + "입니다");
		model.addAttribute("count",count);
		return "index";
	}
}
