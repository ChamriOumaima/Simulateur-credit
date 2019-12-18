package com.sia.model;

public class Credit {

	int NumCre, NumCli, DureCre;
	String DateCre, DatePreVer;
	Double MonCre, TauxCre, AnnCre;
	public int getNumCre() {
		return NumCre;
	}
	public void setNumCre(int numCre) {
		NumCre = numCre;
	}
	public int getNumCli() {
		return NumCli;
	}
	public void setNumCli(int numCli) {
		NumCli = numCli;
	}
	public int getDureCre() {
		return DureCre;
	}
	public void setDureCre(int dureCre) {
		DureCre = dureCre;
	}
	public String getDateCre() {
		return DateCre;
	}
	public void setDateCre(String dateCre) {
		DateCre = dateCre;
	}
	public String getDatePreVer() {
		return DatePreVer;
	}
	public void setDatePreVer(String datePreVer) {
		DatePreVer = datePreVer;
	}
	public Double getMonCre() {
		return MonCre;
	}
	public void setMonCre(Double monCre) {
		MonCre = monCre;
	}
	public Double getTauxCre() {
		return TauxCre;
	}
	public void setTauxCre(Double tauxCre) {
		TauxCre = tauxCre;
	}
	public Double getAnnCre() {
		return AnnCre;
	}
	public void setAnnCre(Double annCre) {
		AnnCre = annCre;
	}
	public Credit(int numCre, int numCli, int dureCre, String dateCre, String datePreVer, Double monCre, Double tauxCre,
			Double annCre) {
		super();
		NumCre = numCre;
		NumCli = numCli;
		DureCre = dureCre;
		DateCre = dateCre;
		DatePreVer = datePreVer;
		MonCre = monCre;
		TauxCre = tauxCre;
		AnnCre = annCre;
	}

	
 	}
