/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import conexion.ConexionDB;
import pasteleria.login;
/**
 *
 * @author israe
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ConexionDB conect=new ConexionDB();
//        conect.conectar();
        login lg=new login();
        lg.setVisible(true);
    }
    
}
