package com.sia.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sia.model.Client;
import com.sia.model.Credit;

public class ImplementationDAO {
	
	
	public static Connection connectBase() throws SQLException {
		Connection con= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjetSIA","root","123");  
	        System.out.println("Connection created");  
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return con;
	}
	
	public static Client login(String username, String pass) {
		PreparedStatement ps;
		Client c = null;
		try {
			ps = connectBase().prepareStatement("select NumCli, NomCli from tclient where NomCli=? and PassCli=?");
			ps.setString(1,username);
			ps.setString(2,pass);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				c = new Client();
				c.setNumCli(rs.getInt("NumCli")); 
				c.setNomCli(rs.getString("NomCli"));//pour ajouter l'id de ce client à la table credit
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  return c; 
	}

	
	public static boolean sauvegarderClient(Client c) {
			PreparedStatement ps;
			boolean b=false;
			try {
				ps = connectBase().prepareStatement("INSERT INTO tclient VALUES(?,?,?,?,?,?,?,?)");
				ps.setInt(1, c.getNumCli());
				ps.setString(2,c.getNomCli());
				ps.setString(3,c.getPreCli());
				ps.setString(4,c.getAdrCli());
				ps.setString(5, c.getVilCli());
				ps.setString(6, c.getTelCli());
				ps.setString(7, c.getMailCli());
				ps.setString(8, c.getPassCli());
				int rs= ps.executeUpdate();
				b=true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return b;	
		
	}
	
	public static boolean sauvegaderCredit(Credit c) {
		PreparedStatement ps;
		boolean b=false;
		try {
			ps = connectBase().prepareStatement("INSERT INTO tcredit VALUES(?,?,?,?,?,?,?,?)");
			ps.setInt(1,c.getNumCre());
			ps.setString(2,c.getDateCre());
			ps.setDouble(3,c.getMonCre());
			ps.setDouble(4, c.getDureCre());
			ps.setDouble(5, c.getTauxCre());
			ps.setDouble(6, c.getAnnCre());
			ps.setString(7, c.getDatePreVer());
			ps.setInt(8,c.getNumCli());
			int rs= ps.executeUpdate();
			b=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return b;	
	}
}




