/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import user.utils.DBUtils;

/**
 *
 * @author VietBao
 */
public class UserDAO {
    
    //bien ket noi voi DB
    Connection conn = null;
    PreparedStatement ptm = null;
    ResultSet rs = null;
    
    //Login
    private static final String LOGIN = "SELECT fullName, roleID FROM tblUsers WHERE userID=? AND password=?";
    public UserDTO login(String userID, String password) throws SQLException{
        UserDTO user = null;
        try {
            conn = DBUtils.getConnection();            
            ptm = conn.prepareStatement(LOGIN);            
            ptm.setString(1, userID);
            ptm.setString(2, password);            
            rs = ptm.executeQuery();
            if (rs.next()) {   
                    String fullName = rs.getString("fullName");
                    String roleID = rs.getString("roleID");
                    user = new UserDTO(userID, fullName, roleID, "");   
                }
        }  catch (Exception e) {
            e.getStackTrace();
        } finally {
            if (rs != null) rs.close();            
            if (ptm!= null) ptm.close();          
            if (conn != null)conn.close();            
        }
        return user;
    } 
}
