/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.ppp.config;

import com.google.gson.Gson;
import pe.edu.upeu.ppp.dao.UsuarioDao;
import pe.edu.upeu.ppp.daoImpl.UsuarioaDaoImpl;

/**
 *
 * @author ProfCisco
 */
public class Test {
static UsuarioDao udao = new UsuarioaDaoImpl();
static Gson g = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(Conexion.getConexion()!=null){
            System.out.println("Conectado");
        }
        System.out.println(g.toJson(udao.login("dreyna", "123")));
    }
    
}
