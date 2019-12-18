package com.sia.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sia.DAO.ImplementationDAO;
import com.sia.model.Client;

/**
 * Servlet implementation class Authentification
 */
@WebServlet("/login")
public class Authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authentification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("nom");
		String s2=request.getParameter("password");
	    Client client= ImplementationDAO.login(s1,s2);
		if(client!=null) {
		HttpSession httpse=request.getSession();
		httpse.setAttribute("numcli",(int)client.getNumCli());
		httpse.setAttribute("nom",client.getNomCli());
		response.sendRedirect("traitement.jsp");  } 
		else {
			response.sendRedirect("formulaire.jsp");
		}

	}

}
