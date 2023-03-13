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
	
	
//	��ȭ���
	public List movieList() {
		List movieList = movieDAO.movieList();
		return movieList;
	}
	
//	articleNO�� �´� ��ȭ���
	public List viewArticle(int articleNO) {
		List article = movieDAO.viewArticle(articleNO);
		return article;
	}
	
//	��ȭ�߰�
	public void add(MovieDTO movieDTO) {
		movieDAO.movieAdd(movieDTO);
	}
	
//	���ƿ� ������Ʈ
	public void updateLike(int articleNO) {
		movieDAO.update_Like(articleNO);
	}
	
//	���ƿ� ���
	public int selectLike(int articleNO) {
		int like = movieDAO.select_Like(articleNO);
		return like;
	}
	
}
