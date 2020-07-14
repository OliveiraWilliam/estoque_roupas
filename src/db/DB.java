/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class DB {
    private static Connection connection;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            if(connection == null){
                connection = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","sa123456");     
            }
            return connection;
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog (null, "Drive DB não localizado" + ex.getMessage());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog (null, "Erro de conexão DB" + ex.getMessage());
        }
        return null;   
    }   

   
}
