package com.project.web.Dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.web.Dto.ReviewDTO;

@Repository
public class ReviewDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public ReviewDTO detail(int rownumber) {
		return sqlSession.selectOne("review.detail", rownumber);
	}

	public void reviewWrite(ReviewDTO reviewDTO) {
		sqlSession.insert("review.reviewSave", reviewDTO);
	}



	

	
}
