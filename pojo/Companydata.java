package com.cts.starter.pojo;


import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "Companydata")

public class Companydata {

	@Id

	private String companyname;

	

	private int turnover;

	private String ceoname;

	private String BOD;

	private int ListedinSE;

	private String Sector;

	private String Remarks;

	private int StockCode;

	@Override

	public String toString() {

		return "Companies [companyname=" + companyname + ", turnover=" + turnover + ", ceoname=" + ceoname + ", BOD="

				+ BOD + ", ListedinSE=" + ListedinSE + ", Sector=" + Sector + ", Remarks=" + Remarks + ", StockCode="

				+ StockCode + "]";

	}
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getTurnover() {

		return turnover;

	}

	public void setTurnover(int turnover) {

		this.turnover = turnover;

	}

	public String getCeoname() {

		return ceoname;

	}

	public void setCeoname(String ceoname) {

		this.ceoname = ceoname;

	}

	public String getBOD() {

		return BOD;

	}

	public void setBOD(String bOD) {

		BOD = bOD;

	}

	public int getListedinSE() {

		return ListedinSE;

	}

	public void setListedinSE(int listedinSE) {

		ListedinSE = listedinSE;

	}

	public String getSector() {

		return Sector;

	}

	public void setSector(String sector) {

		Sector = sector;

	}

	public String getRemarks() {

		return Remarks;

	}

	public void setRemarks(String remarks) {

		Remarks = remarks;

	}

	public int getStockCode() {

		return StockCode;

	}

	public void setStockCode(int stockCode) {

		StockCode = stockCode;

	}

	

}
