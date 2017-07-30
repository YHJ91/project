package com.hj.domain;

public class ItmInfVO {

	private int ItmNum;
	private int ItmTmpNum;
	private int ItmFldNum;
	private String ItmValue;
	private String ItmDtm;
	
	public ItmInfVO() {
		// TODO Auto-generated constructor stub
	}

	public int getItmNum() {
		return ItmNum;
	}

	public void setItmNum(int itmNum) {
		ItmNum = itmNum;
	}

	public int getItmTmpNum() {
		return ItmTmpNum;
	}

	public void setItmTmpNum(int itmTmpNum) {
		ItmTmpNum = itmTmpNum;
	}

	public int getItmFldNum() {
		return ItmFldNum;
	}

	public void setItmFldNum(int itmFldNum) {
		ItmFldNum = itmFldNum;
	}

	public String getItmValue() {
		return ItmValue;
	}

	public void setItmValue(String itmValue) {
		ItmValue = itmValue;
	}

	public String getItmDtm() {
		return ItmDtm;
	}

	public void setItmDtm(String itmDtm) {
		ItmDtm = itmDtm;
	}

	@Override
	public String toString() {
		return "ItmInfVO [ItmNum=" + ItmNum + ", ItmTmpNum=" + ItmTmpNum + ", ItmFldNum=" + ItmFldNum + ", ItmValue="
				+ ItmValue + ", ItmDtm=" + ItmDtm + "]";
	}

}
