package com.jc.tri.mapper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jc.tri.model.BizPlan;

@Repository
public class TestMapper {

	@Autowired
	@Qualifier("sqlSession")
	private SqlSessionTemplate sessionTemplate;
	
	private final static String NAMESPACE = "com.jc.tri.mapper.TestMapper";
	
	public List<BizPlan> selectPlan() throws Exception {
		return sessionTemplate.selectList(NAMESPACE + "selectPlan");
	}
	
}
