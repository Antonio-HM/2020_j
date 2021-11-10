/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Entity.Cliente;

public class ClienteDAO extends Conexion{
    
    
    
    public ArrayList<Cliente> LlenarCLienet()throws Exception{
    
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        try {
            this.Conectar();
            String Q = "select * from dbcliente";
            PreparedStatement stm = this.getCnx().prepareStatement(Q);
            ResultSet rt = stm.executeQuery();
            while(rt.next()){
            Cliente c  =new Cliente();
                c.setId_cliente(rt.getInt("id_cliente"));
                c.setNombre(rt.getString("nombre"));
                c.setApellido(rt.getString("apellido"));
                c.setDui(rt.getString("dui"));
                c.setTelefono(rt.getInt("telefono"));
                c.setDireccion(rt.getString("direccion"));
            
                lista.add(c);
            }
                   
        } catch (Exception e) {
            System.out.println("Erro");
        }finally{
        this.Desconectar();
        }
    
    
    
    
    }
    
}
