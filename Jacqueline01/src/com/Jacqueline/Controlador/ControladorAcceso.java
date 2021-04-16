package com.Jacqueline.Controlador;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Jacqueline.DAO.ClsLoguin;
import com.Jacqueline.DAO.ClsUsuario;
import com.Jacqueline.Entidades.Loguin;
import com.Jacqueline.Entidades.usuario;
import com.Jacqueline.Negocio.clsLoguin;
import com.google.gson.Gson;


/**
 * Servlet implementation class ControladorAcceso
 */
@WebServlet("/ControladorAcceso")
public class ControladorAcceso extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControladorAcceso() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String usuari = request.getParameter("user");
		String password = request.getParameter("pass");
		
		usuario log = new usuario();
		log.setUsuario(usuari);
		log.setPass(password);
		
		clsLoguin clsL = new clsLoguin();
		int valordeacceso=clsL.acceso(log);
		
		if(valordeacceso == 1)
		{
			System.out.println("WELCOME");
			ClsUsuario cls = new ClsUsuario();
			ArrayList<usuario> clsuser = new ArrayList<usuario>();
			
			for (var iteracion:cls.ListadoUSUARIOS()) {
				usuario usua = new usuario();
				usua.setIdUsuario(iteracion.getIdUsuario());
				usua.setUsuario(iteracion.getUsuario());
				usua.setPass(iteracion.getPass());
				usua.setIdTipoUsuario(iteracion.getIdTipoUsuario());
				clsuser.add(usua);
			}
			
			response.sendRedirect("Welcome.jsp");
		}else if(valordeacceso==2){
			System.out.println("USUARIO NORMAL");
			response.sendRedirect("UsuarioNormal.jsp");
			
		}else {
			System.out.println("ERROR");
			response.sendRedirect("error.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		ClsUsuario usu = new ClsUsuario();
		Gson json = new Gson();
		response.getWriter().append(json.toJson(usu.ListadoUSUARIOS()));
	}

}
