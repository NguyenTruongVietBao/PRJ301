/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBUtils;

/**
 *
 * @author VietBao
 */
public class UserDAO {
    
    private static final String LOGIN="SELECT fullName, roleID FROM tblUsers WHERE userID=? AND password=?";
    public UserDTO checkLogin(String userID, String password) throws SQLException {
        UserDTO user = null; 
        Connection conn= null;
        PreparedStatement ptm= null;
        ResultSet rs= null;
        try {
            conn= DBUtils.getConnection();
            if(conn!= null){
                ptm= conn.prepareStatement(LOGIN);
                ptm.setString(1, userID);
                ptm.setString(2, password);
                rs= ptm.executeQuery();
                if(rs.next()){
                    String fullName = rs.getString("fullName");
                    String roleID = rs.getString("roleID");
                    user = new UserDTO(userID, fullName, roleID, "");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(rs!= null) rs.close();
            if(ptm!= null) ptm.close();
            if(conn!= null) conn.close();
        }
        return user;
    }
    
    private static final String LIST ="SELECT* FROM dbo.tblUsers";
    public List<UserDTO> getAllUser(){
        Connection conn= null;
        PreparedStatement ptm= null;
        List<UserDTO> list = new ArrayList<>();
        try {
            //ket noi DB
            conn = DBUtils.getConnection();
            // chuyen cau lenh query
            ptm = conn.prepareStatement(LIST);
            // chay query va tra ve rs
            ResultSet rs = ptm.executeQuery();                 
            while (rs.next()) {
                UserDTO u = new UserDTO(rs.getString("userID"),
                                    rs.getString("fullName"),                                     
                                    rs.getString("roleID"),
                                    rs.getString("password"));
                list.add(u);                            
            }            
        } catch (Exception e) {            
            System.out.println(e);
        }
        return list;
    }
    
    
    //DELETE userID
    private static final String DELETE = "DELETE FROM dbo.tblUsers WHERE userID=? ";
    public void deleteUser(String id) throws ClassNotFoundException{
        Connection conn= null;
        PreparedStatement ptm= null;
        try {
            conn= DBUtils.getConnection();
            ptm = conn.prepareStatement(DELETE);
            ptm.setString(1, id);
            ptm.executeUpdate();           
        } catch (SQLException e) {
            System.out.println(e);
        }  
    }  
    
    
     //check id co ton tai hay k
    private static final String CHECK_ID = "SELECT* FROM dbo.tblUsers WHERE userID=?";
    public UserDTO getUserID(String id) throws ClassNotFoundException{
        List<UserDTO> list = new ArrayList<>();
        try {
            Connection conn= DBUtils.getConnection();
            PreparedStatement ptm = conn.prepareStatement(CHECK_ID);
            ptm.setString(1, id);
            ResultSet rs = ptm.executeQuery();
            if (rs.next()) {
                UserDTO u = new UserDTO();
                u.setUserID(rs.getString("userID"));
                u.setFullName(rs.getString("fullName"));
                u.setPassword(rs.getString("roleID"));
                u.setRoleID(rs.getString("password"));
                return u;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    //INSERT
    private static final String INSERT = "INSERT INTO dbo.tblUsers VALUES (?, ?, ?, ?, 1)";
    public void insertServlet(UserDTO u) throws ClassNotFoundException{  
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ptm = conn.prepareStatement(INSERT);
            ptm.setString(1,u.getUserID());
            ptm.setString(2,u.getFullName());
            ptm.setString(3,u.getRoleID());
            ptm.setString(4,u.getPassword());
            ptm.executeUpdate();
        } catch (SQLException e) {
                System.out.println(e);
        }      
    }
    
    //UPDATE by userID
    private static final String UPDATE = "UPDATE dbo.tblUsers SET fullName = ?, password = ?, roleID = ?, status=1  WHERE userID = ?";
    public void updateUser(UserDTO u){
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
    
    private static final String SEARCH = "SELECT userID, fullName, roleID FROM tblUsers WHERE fullName LIKE ?";
    public List<UserDTO> getListUser(String search) throws SQLException{
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<UserDTO> result = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH);
                ptm.setString(1, "%" + search + "%");
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String userID = rs.getString("userID");
                    String fullName = rs.getString("fullName");
                    String roleID = rs.getString("roleID");
                    UserDTO user = new UserDTO(userID, fullName, roleID, "");
                    result.add(user);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs!=null) rs.close();
            if (ptm!=null) ptm.close();
            if (conn!=null) conn.close();
        }
        return result;
    }
    
}
