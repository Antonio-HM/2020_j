/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author eddie.hernandezusam
 */
public class testing {
    
    public static void main(String[] args) {
        try {
            Conexion c = new Conexion();
            c.Conectar();
        } catch (Exception e) {
        }
    }
}
