package com.hj.persistance;

import java.util.List;

import com.hj.domain.GrpMstVO;

public interface GrpMstDAO {

	public void create (GrpMstVO vo) throws Exception;
	
	public GrpMstVO read(Integer GrpNum) throws Exception;
	
	public void update (GrpMstVO vo) throws Exception;
	
	public void delete(Integer GrpNum) throws Exception;
	
	public List<GrpMstVO> listAll() throws Exception;
	
}
