/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pasteleria.login;

/**
 *
 * @author israe
 */
public class ConexionDB {
   String dataBase="venta_pasteles";
   String url="jdbc:mysql://localhost:3306/";
   String user="root";
   String password="";
   String driver="com.mysql.cj.jdbc.Driver";
   Connection cx;
   
   public ConexionDB(){
   }

   public Connection conectar(){
       try {
           Class.forName(driver);
               cx=DriverManager.getConnection(url+dataBase, user, password);
               System.out.println("Conexion exitosa a la base de datos "+dataBase);
           } catch (SQLException | ClassNotFoundException ex) {
           Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("No se conecto a la base de datos"+dataBase);
       }
   return cx;
   }
   
 public void  desconectar(){
       try {
           cx.close();
       } catch (SQLException ex) {
           Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
