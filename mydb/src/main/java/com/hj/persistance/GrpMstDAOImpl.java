package com.hj.persistance;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hj.domain.GrpMstVO;

@Repository
public class GrpMstDAOImpl implements GrpMstDAO{

	@Inject
	private SqlSession session;
	
	private static String namespace="";
	
	@Override
	public void create(GrpMstVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GrpMstVO read(Integer GrpNum) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(GrpMstVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer GrpNum) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<GrpMstVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}
