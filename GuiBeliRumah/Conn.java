/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GuiBeliRumah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conn {
    public static void main(String[] args){
        String url ="jdbc:mysql://localhost:3306/netbeanscoba";
        String user ="root";
        String password = "";
        
        Connection koneksi;
        
        try{
            koneksi = DriverManager.getConnection(url,user,password);
            System.out.println("berhasil");
            
        }
        catch(SQLException e){
            e.getMessage();
        }
    }
}
