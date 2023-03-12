package com.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.dao.MovieDAO;

@Service("movieService")
public class MovieService {
	
	@Autowired
	private MovieDAO movieDAO;
	
	public List movieList() {
		List movieList = movieDAO.movieList();
		return movieList;
	}
}
