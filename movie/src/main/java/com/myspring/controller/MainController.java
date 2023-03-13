package com.myspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspring.dto.MovieDTO;
import com.myspring.service.MovieService;

@Controller("mainController")
@RequestMapping("/main")
public class MainController {
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieDTO movieDTO;
	
//	영화출력
	@RequestMapping(value="/main.do", method=RequestMethod.GET)
	public String movieList(Model model) {
		System.out.println("메인 실행");
		List movieList = movieService.movieList();
//		List list2 = movieService.movieList2();
		model.addAttribute("movieList", movieList);
//		model.addAttribute("movieList2", list2);
		return "main/main";
	}
	
	
	
}
