package com.hj.domain;

public class FldPrtMst {
	
	private int PrtNum;
	private String PrtNam;
	private String PrtTyp;
	
	public FldPrtMst() {
		// TODO Auto-generated constructor stub
	}

	public int getPrtNum() {
		return PrtNum;
	}

	public void setPrtNum(int prtNum) {
		PrtNum = prtNum;
	}

	public String getPrtNam() {
		return PrtNam;
	}

	public void setPrtNam(String prtNam) {
		PrtNam = prtNam;
	}

	public String getPrtTyp() {
		return PrtTyp;
	}

	public void setPrtTyp(String prtTyp) {
		PrtTyp = prtTyp;
	}

	@Override
	public String toString() {
		return "FldPrtMst [PrtNum=" + PrtNum + ", PrtNam=" + PrtNam + ", PrtTyp=" + PrtTyp + "]";
	}

}
