package com.Jacqueline.Negocio;

import com.Jacqueline.DAO.ClsLoguin;
import com.Jacqueline.Entidades.Loguin;
import com.Jacqueline.Entidades.usuario;

public class clsLoguin {
	
	public int acceso(usuario log) {
		int acceso = 0;
		//if(log.getUser().equals("Jasmin") && log.getPass().equals("123"))
		//{
		//acceso = 1;				
		//}
		ClsLoguin loguinDao = new ClsLoguin();
		usuario usu = new usuario();
		
		usu=loguinDao.login(log);
		if(usu!=null) {
			if(usu.getIdTipoUsuario()==1) {
			acceso=1;
		}else if(usu.getIdTipoUsuario()==2) {
			acceso=2;
		}
		System.out.println("Bienvenido Usuario: "+usu.getUsuario());
	}else {
		System.out.println("Usuario No Valido");
		
	}
		return acceso;
	}
	
}
