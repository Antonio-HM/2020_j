
package DAO;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {

    private static String bd  ="java2020";
    private static String user = "root";
    private static String pass  ="root";
    private static String url  ="jdbc:mysql://localhost/" + bd + "?useSSL=false";

    private Connection cnx;

    public Connection getCnx() {
        return cnx;
    }

    public void setCnx(Connection cnx) {
        this.cnx = cnx;
    }
    
public void Conectar()throws Exception{

    try {
        Class.forName("com.mysql.jdbc.Driver");
        this.cnx = DriverManager.getConnection(url,user,pass);
        if (this.cnx != null ){
            System.out.println("conectado a bace de datos : " + bd);
        
        }else {
            System.out.println(" fallo wey");
        }
    } catch (Exception e) {
     e.printStackTrace();
        System.out.println("Error : " +  e.getMessage());
    }   
}

public void Desconectar()throws Exception{
    try {
        this.cnx.close();
    } catch (Exception e) {
    }

}
}
