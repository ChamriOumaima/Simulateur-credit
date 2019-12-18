package com.sia.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sia.DAO.ImplementationDAO;
import com.sia.DAO.ImplementationDAO.*;
import com.sia.model.Client;

/**
 * Servlet implementation class inscription
 */
public class inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("formulaire.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String mail=request.getParameter("email");
		String adresse=request.getParameter("adresse");
		String tel=request.getParameter("tel");
		String ville=request.getParameter("ville");
		String pass=request.getParameter("password");
		Client c= new Client(nom,prenom, adresse, ville, mail, tel, pass);
		c.setNumCli((int)(1000+Math.random()*247));
		boolean b= ImplementationDAO.sauvegarderClient(c);
		if(b==true) {
		response.sendRedirect("login.jsp");}
		
	}

}
