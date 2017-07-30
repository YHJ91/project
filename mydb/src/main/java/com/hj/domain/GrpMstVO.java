package com.hj.domain;

public class GrpMstVO {

	private int grpNum;
	private String grpNam;
	
	public GrpMstVO() {
		// TODO Auto-generated constructor stub
	}

	public int getGrpNum() {
		return grpNum;
	}

	public void setGrpNum(int grpNum) {
		this.grpNum = grpNum;
	}

	public String getGrpNam() {
		return grpNam;
	}

	public void setGrpNam(String grpNam) {
		this.grpNam = grpNam;
	}

	@Override
	public String toString() {
		return "GrpMstVO [grpNum=" + grpNum + ", grpNam=" + grpNam + "]";
	}

}
