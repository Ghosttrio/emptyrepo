package com.myspring.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("movieDAO")
public class MovieDAO {

	@Autowired
	private SqlSession sqlSession;
	
//	영화정보조회
	public List movieList() {
		List movieList = new ArrayList();
		movieList = sqlSession.selectList("mapper.member.movieList");
		return movieList;
	}
	
}
