package com.sia.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ws.axis2.WebserviceStub;
import org.apache.ws.axis2.WebserviceStub.CalculDuree;
import org.apache.ws.axis2.WebserviceStub.CalculDureeResponse;

import com.sia.DAO.ImplementationDAO;
import com.sia.model.Credit;

/**
 * Servlet implementation class Duree
 */
public class Duree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Duree() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("calculer") != null) {
		Double taux=Double.parseDouble(request.getParameter("taux"));
		Double annuite=Double.parseDouble(request.getParameter("annuite"));
		Double capital= Double.parseDouble(request.getParameter("capital"));
		WebserviceStub stub= new WebserviceStub();
		CalculDuree cal=new CalculDuree();
		 cal.setC(annuite);
		 cal.setN(capital);
		 cal.setTaux(taux);
		 
		 CalculDureeResponse res= stub.calculDuree(cal);
		 request.getSession().setAttribute("duree",(int)res.get_return());
		 HttpSession httpse=request.getSession();
	     httpse.setAttribute("cap",capital);
	     httpse.setAttribute("taux", taux);
	     httpse.setAttribute("duree",(int)res.get_return());
	     httpse.setAttribute("annuite",annuite);
	     Date actuelle = new Date();
	     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	     String dat = dateFormat.format(actuelle);
	     httpse.setAttribute("date",dat);
	 	 response.sendRedirect("duree.jsp");}
		
		
		if(request.getParameter("sauvegarder")!=null) {
			Double taux=Double.parseDouble(request.getParameter("taux"));
			Double annuite=Double.parseDouble(request.getParameter("annuite"));
			Double capital= Double.parseDouble(request.getParameter("capital"));
			WebserviceStub stub= new WebserviceStub();
			CalculDuree cal=new CalculDuree();
			 cal.setC(annuite);
			 cal.setN(capital);
			 cal.setTaux(taux);
			 
			 CalculDureeResponse res= stub.calculDuree(cal);
			 request.getSession().setAttribute("duree",(int)res.get_return());
			 HttpSession httpse=request.getSession();
		     httpse.setAttribute("cap",capital);
		     httpse.setAttribute("taux", taux);
		     httpse.setAttribute("duree",(int)res.get_return());
		     httpse.setAttribute("annuite",annuite);
		     Date actuelle = new Date();
		     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		     String dat = dateFormat.format(actuelle);
		     httpse.setAttribute("date",dat);
		 	 response.sendRedirect("formulaire.jsp");

		}
	 	 
		
	
	}

}
