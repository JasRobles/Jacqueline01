package com.Jacqueline.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.Jacqueline.ConexionBd.ConexionBd;
import com.Jacqueline.Entidades.usuario;


public class ClsLoguin {
	
	ConexionBd con = new ConexionBd();
    Connection coneccion = con.RetornarConexion();
   
    
	public usuario login(usuario user) {

        usuario usuar = new usuario();
        try {
            CallableStatement call = coneccion.prepareCall("Call SP_S_LOGIN(?,?)");
            call.setString("pUsuario", user.getUsuario());
            call.setString("pPass", user.getPass());
            ResultSet resul = call.executeQuery();
            while (resul.next()) {
            	usuar.setIdUsuario(resul.getInt("idUsuario"));
                usuar.setUsuario(resul.getString("Usuario"));
                usuar.setPass(resul.getString("PassWord"));
                usuar.setIdTipoUsuario(resul.getInt("tipoUsuario"));
                
                 }
            
            coneccion.close();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
      
        return usuar;
        
    }
}
