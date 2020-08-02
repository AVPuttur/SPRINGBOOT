package com.example.springweb;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springweb.model.Alien;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2")int j, ModelMap m) {
		//ModelView type
		//ModelAndView mv = new ModelAndView();
		//mv.setViewName("result");
		
		int sum = i + j;
		//mv.addObject("result", sum);
		m.addAttribute("result", sum);
		return "result";
	}
	
//	@RequestMapping("addAlien1")
//	public String addAlien1(@RequestParam("aid") int id, @RequestParam("aname") String aname, Model m) {
//		
//		Alien ali =  new Alien();
//		ali.setAid(id);
//		ali.setAname(aname);
//		
//		m.addAttribute("resultAlien", ali.toString());
//		return "result";
//	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		List<Alien> aliens = Arrays.asList(new Alien(201, "Navin"), new Alien(103, "Rachel"));
		m.addAttribute("arrayResults", aliens);
		return "result";
		
	} 
	
	@PostMapping("addAlien")
	public String addAlien(Alien a) {
		return "result";
	}
}