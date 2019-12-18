package com.sia.model;

public class Client {
	//TClient (NumCli,NomCli,PreCli,AdrCli,VilCli,TelCli, MailCli, PassCli)
	   int NumCli;
	   String NomCli ,PreCli, AdrCli, VilCli, MailCli, TelCli, PassCli;
	
	public Client() {
		   
	   }
	   
	public Client(String n, String p , String Adr, String vil, String Mail, String tel, String Pass ) {
		NomCli=n;
		PreCli=p;
		AdrCli= Adr;
		VilCli= vil;
		MailCli= Mail;
		TelCli= tel;
		PassCli= Pass;
	}
	public int getNumCli() {
		return NumCli;
	}
	public void setNumCli(int numCli) {
		NumCli = numCli;
	}
	public String getNomCli() {
		return NomCli;
	}
	public void setNomCli(String nomCli) {
		NomCli = nomCli;
	}
	public String getTelCli() {
		return TelCli;
	}
	public void setTelCli(String nomCli) {
		TelCli = nomCli;
	}
	public String getPreCli() {
		return PreCli;
	}
	public void setPreCli(String preCli) {
		PreCli = preCli;
	}
	public String getAdrCli() {
		return AdrCli;
	}
	public void setAdrCli(String adrCli) {
		AdrCli = adrCli;
	}
	public String getVilCli() {
		return VilCli;
	}
	public void setVilCli(String vilCli) {
		VilCli = vilCli;
	}
	public String getMailCli() {
		return MailCli;
	}
	public void setMailCli(String mailCli) {
		MailCli = mailCli;
	}
	public String getPassCli() {
		return PassCli;
	}
	public void setPassCli(String PassClii) {
		PassCli = PassClii;
	}
	
	   
	   
}
