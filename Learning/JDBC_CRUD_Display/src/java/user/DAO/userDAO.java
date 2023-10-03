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
    
    //lấy tất cả dữ liệu từ bảng tblUsers
    public List<user> getListUsers() throws SQLException, ClassNotFoundException{
        Connection conn = null;     
        PreparedStatement ptm = null;   
        ResultSet rs = null;    
        List<user> list = new ArrayList<>();
        try {          
            String sql = "SELECT* FROM dbo.tblUsers";
            conn= DBUtils.getConnection();      // mo ket noi voi SQL Sever
            ptm = conn.prepareStatement(sql);   // chuyen cau query from NetBean to SQL Sever
            rs = ptm.executeQuery();            // excute query va nhan ket qua tra ve
            while (rs.next()) { 
                user u = new user(rs.getString("userID"),
                                    rs.getString("fullName"),
                                    rs.getString("password"), 
                                    rs.getString("roleID"),
                                    rs.getBoolean("status") );
                list.add(u);                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }        
        return list;
    }
  
}
