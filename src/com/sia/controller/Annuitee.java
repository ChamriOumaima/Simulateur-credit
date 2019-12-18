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
import org.apache.ws.axis2.WebserviceStub.CalculMensualite;
import org.apache.ws.axis2.WebserviceStub.CalculMensualiteResponse;

import com.sia.DAO.ImplementationDAO;
import com.sia.model.Credit;

/**
 * Servlet implementation class Annuitee
 */
public class Annuitee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Annuitee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	if(request.getParameter("calculer")!=null) {
	 Double cap= Double.parseDouble(request.getParameter("capital"));
	 Double taux=Double.parseDouble(request.getParameter("taux"));
	 int duree= Integer.parseInt(request.getParameter("duree"));
	 WebserviceStub stub= new WebserviceStub();
	 CalculMensualite cal=new CalculMensualite();
	 cal.setC(cap);
	 cal.setN(duree);
	 cal.setTaux(taux);
	 CalculMensualiteResponse res= stub.calculMensualite(cal);
	 request.getSession().setAttribute("annuite",res.get_return());
	 HttpSession httpse=request.getSession();
     httpse.setAttribute("cap",cap);
     httpse.setAttribute("taux", taux);
     httpse.setAttribute("duree",duree);
     httpse.setAttribute("annuite",res.get_return());
     Date actuelle = new Date();
     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
     String dat = dateFormat.format(actuelle);
     httpse.setAttribute("date",dat);
 	 response.sendRedirect("annuite.jsp");}
	
	 if(request.getParameter("sauvegarder")!=null) {
		 Double cap= Double.parseDouble(request.getParameter("capital"));
		 Double taux=Double.parseDouble(request.getParameter("taux"));
		 int duree= Integer.parseInt(request.getParameter("duree"));
		 WebserviceStub stub= new WebserviceStub();
		 CalculMensualite cal=new CalculMensualite();
		 cal.setC(cap);
		 cal.setN(duree);
		 cal.setTaux(taux);
		 CalculMensualiteResponse res= stub.calculMensualite(cal);
		 request.getSession().setAttribute("annuite",res.get_return());
		 HttpSession httpse=request.getSession();
	     httpse.setAttribute("cap",cap);
	     httpse.setAttribute("taux", taux);
	     httpse.setAttribute("duree",duree);
	     httpse.setAttribute("annuite",res.get_return());
	     Date actuelle = new Date();
	     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	     String dat = dateFormat.format(actuelle);
	     httpse.setAttribute("date",dat);
	 	 response.sendRedirect("formulaire.jsp");

	}
 	 
 	 
 	 
	}

}
