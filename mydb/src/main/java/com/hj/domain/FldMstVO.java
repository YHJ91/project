package com.hj.domain;

public class FldMstVO {

	private int FldNum;
	private String FldNam;
	private int FldPrtNum;
	
	public FldMstVO() {
		// TODO Auto-generated constructor stub
	}

	public int getFldNum() {
		return FldNum;
	}

	public void setFldNum(int fldNum) {
		FldNum = fldNum;
	}

	public String getFldNam() {
		return FldNam;
	}

	public void setFldNam(String fldNam) {
		FldNam = fldNam;
	}

	public int getFldPrtNum() {
		return FldPrtNum;
	}

	public void setFldPrtNum(int fldPrtNum) {
		FldPrtNum = fldPrtNum;
	}

	@Override
	public String toString() {
		return "FldMst [FldNum=" + FldNum + ", FldNam=" + FldNam + ", FldPrtNum=" + FldPrtNum + "]";
	}

}
