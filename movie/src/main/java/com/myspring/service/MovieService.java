package com.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.dao.MovieDAO;
import com.myspring.dto.MovieDTO;

@Service("movieService")
public class MovieService {
	
	@Autowired
	private MovieDAO movieDAO;
	
	@Autowired
	private MovieDTO movieDTO;
	
	
//	영화출력
	public List movieList() {
		List movieList = movieDAO.movieList();
		return movieList;
	}
	
//	articleNO에 맞는 영화출력
	public List viewArticle(int articleNO) {
		List article = movieDAO.viewArticle(articleNO);
		return article;
	}
	
//	영화추가
	public void add(MovieDTO movieDTO) {
		movieDAO.movieAdd(movieDTO);
	}
	
	
	
	
}
