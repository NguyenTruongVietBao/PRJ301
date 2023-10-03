/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.user;
import user.utils.DBUtils;

/**
 *
 * @author hd
 */
public class userDAO extends DBUtils{
    
 public user checkLogin(String user, String pass){
        Connection conn = null;     
        PreparedStatement ptm = null;   
        ResultSet rs = null;    
        String sql = "SELECT * FROM dbo.tblUsers WHERE  userID= ? AND password = ?";
        try {
            conn= DBUtils.getConnection();      // mo ket noi voi SQL Sever
            ptm = conn.prepareStatement(sql);   // chuyen cau query from NetBean to SQL Sever
            ptm.setString(1, user);
            ptm.setString(2, pass);
            rs = ptm.executeQuery();            // excute query va nhan ket qua tra ve
            while (rs.next()) { 
                user u = new user(rs.getString("userID"),
                                    "",
                                    rs.getString("password"),"",true); 
                return u;
            }
        } catch (Exception e) {
        }
        return null;
    }
 
    
    //SELECT * FROM tblUsers
    public List<user> getAll() throws SQLException, ClassNotFoundException{
        Connection conn= null;
        PreparedStatement ptm= null;
        List<user> list = new ArrayList<>();
        String sql = "SELECT* FROM dbo.tblUsers";
        try {
            conn= DBUtils.getConnection();
            ptm = conn.prepareStatement(sql);
            ResultSet rs = ptm.executeQuery();
            while (rs.next()) {
                user u = new user(rs.getString("userID"),
                                    rs.getString("fullName"),
                                    rs.getString("password"), 
                                    rs.getString("roleID"),
                                    true);
                list.add(u);                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }        
        return list;
    }
    
    //DELETE userID
    public void deleteServlet(String id) throws ClassNotFoundException{
        Connection conn= null;
        PreparedStatement ptm= null;
        List<user> list = new ArrayList<>();
        String sql = "DELETE FROM dbo.tblUsers WHERE userID=? ";
        try {
            conn= DBUtils.getConnection();
            ptm = conn.prepareStatement(sql);
            ptm.setString(1, id);
            ptm.executeUpdate();           
        } catch (SQLException e) {
            System.out.println(e);
        }  
    }  
    
    //check id co ton tai hay k
    public user getUserID(String id) throws ClassNotFoundException{
        List<user> list = new ArrayList<>();
        String sql = "SELECT* FROM dbo.tblUsers WHERE userID=?";
        try {
            Connection conn= DBUtils.getConnection();
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, id);
            ResultSet rs = ptm.executeQuery();
            if (rs.next()) {
                user u = new user();
                u.setUserID(rs.getString("userID"));
                u.setFullName(rs.getString("fullName"));
                u.setPassword(rs.getString("password"));
                u.setRoleID(rs.getString("roleID"));
                return u;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    
    //INSERT
    public void insertServlet(user u) throws ClassNotFoundException{  
        String sql = "INSERT INTO dbo.tblUsers VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1,u.getUserID());
            ptm.setString(2,u.getFullName());
            ptm.setString(3,u.getPassword());
            ptm.setString(4,u.getRoleID());
            ptm.setBoolean(5,u.isStatus());
            ptm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }  
    }
    
    
    //UPDATE by userID
    private static final String UPDATE = "UPDATE dbo.tblUsers SET fullName = ?, password = ?, roleID = ?, status=1  WHERE userID = ?";
    public void updateUser(user u){
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ptm = conn.prepareStatement(UPDATE);
            ptm.setString(1, u.getFullName());
            ptm.setString(2, u.getPassword());
            ptm.setString(3, u.getRoleID());
            ptm.setString(4, u.getUserID());
            ptm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
