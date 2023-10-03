/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Admin;
import utils.DBUtils;

/**
 *
 * @author VietBao
 */
public class DAO extends DBUtils{
    
    private static final String CHECK = "SELECT Username, Password, role FROM dbo.Admin WHERE Username = ? AND Password = ?";
    public Admin checkLogin(String username, String password){
        Connection conn = null;     
        PreparedStatement ptm = null;   
        ResultSet rs = null;    
        try {
            conn= DBUtils.getConnection();      
            ptm = conn.prepareStatement(CHECK);  
            ptm.setString(1, username);
            ptm.setString(2, password);
            rs = ptm.executeQuery();            
            if (rs.next()) { 
                Admin a = new Admin(rs.getString("Username"), rs.getString("Password"), rs.getInt("role"));
                return a;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
