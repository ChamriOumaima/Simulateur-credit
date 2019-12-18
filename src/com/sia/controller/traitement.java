package com.sia.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sia.DAO.ImplementationDAO;
import com.sia.model.Credit;

/**
 * Servlet implementation class traitement
 */
public class traitement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public traitement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("traitement.jsp");   

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		HttpSession httpse=request.getSession();
		Double capp= (Double) httpse.getAttribute("cap");
		Double taux= (Double) httpse.getAttribute("taux");
		Double annuite=(Double) httpse.getAttribute("annuite");
		int duree=(int) httpse.getAttribute("duree");
		String date=(String) httpse.getAttribute("date");
		int numcli= (int) httpse.getAttribute("numcli");
		int numcre= (int)(1900+Math.random()*288);
		String datepre= request.getParameter("dpv");

			Credit c= new Credit(numcre,numcli, duree, date,datepre,capp,taux,annuite);
			boolean b= ImplementationDAO.sauvegaderCredit(c);
			if(b==true) {
				response.sendRedirect("save.jsp");
				}
	}
		
	

}
