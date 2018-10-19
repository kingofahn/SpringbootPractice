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
	@GetMapping
	@RequestMapping("/piechart")
	public String pieChart(Model model) {
		System.out.println("----- piechart ------");
		return "util/piechart";
	}
	@GetMapping
	@RequestMapping("/wordcloud")
	public String wordcloud(Model model) {
		System.out.println("----- wordcloud ------");
		return "util/wordcloud";
	}
	
	@GetMapping
	@RequestMapping("/gmap")
	public String geochart(Model model) {
		System.out.println("----- gmap ------");
		return "util/gmap";
	}
	@GetMapping
	@RequestMapping("/initmap")
	public String initmap(Model model) {
		System.out.println("----- initmap ------");
		return "util/initmap";
	}
	
}
