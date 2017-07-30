package com.hj.domain;

public class TmpMstVO {

	private int TmpNum;
	private String TmpNam;
	private int TmpGrpNum;
	
	public TmpMstVO() {
		// TODO Auto-generated constructor stub
	}

	public int getTmpNum() {
		return TmpNum;
	}

	public void setTmpNum(int tmpNum) {
		TmpNum = tmpNum;
	}

	public String getTmpNam() {
		return TmpNam;
	}

	public void setTmpNam(String tmpNam) {
		TmpNam = tmpNam;
	}

	public int getTmpGrpNum() {
		return TmpGrpNum;
	}

	public void setTmpGrpNum(int tmpGrpNum) {
		TmpGrpNum = tmpGrpNum;
	}

	@Override
	public String toString() {
		return "TmpMstVO [TmpNum=" + TmpNum + ", TmpNam=" + TmpNam + ", TmpGrpNum=" + TmpGrpNum + "]";
	}

}
