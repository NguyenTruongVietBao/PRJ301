/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sample.model.Category;
import sample.model.Product;
import sample.utils.DBUtils;

/**
 *
 * @author VietBao
 */
public class DAO {  
    
    public List<Category> getAllCatetory(){
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<Category> list = new ArrayList<>();   
        String SQL = "SELECT * FROM dbo.Categories";
        try {
            conn= DBUtils.getConnection();
            ptm = conn.prepareStatement(SQL);
            rs = ptm.executeQuery();
            while (rs.next()) {                
                Category c = new Category(rs.getInt("id"), rs.getString("name"), rs.getString("describe"));
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    //Tim 1 catetoru khi co id
    public Category getCatetoryById(int id){
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM dbo.Categories WHERE ID = ?";
        try {
            conn= DBUtils.getConnection();
            ptm = conn.prepareStatement(SQL);
            ptm.setInt(1, id);
            rs = ptm.executeQuery();
            if (rs.next()) {                
                Category c = new Category(rs.getInt("id"), rs.getString("name"), rs.getString("describe"));
                return c;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    //Doc tu bang Product theo cid
    public List<Product> getProductByCid(int cid){
        List<Product> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM dbo.products WHERE cid = ?";
        try {
            conn= DBUtils.getConnection();
            ptm = conn.prepareStatement(SQL);
            ptm.setInt(1, cid);
            rs = ptm.executeQuery();
            while (rs.next()) {                
                Product p = new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setPrice(rs.getDouble("id"));
                p.setReleaseDate(rs.getString("releaseDate"));
                p.setDescribe(rs.getString("describe"));
                p.setImage(rs.getString("image"));
                Category c = getCatetoryById(rs.getInt("cid"));
                p.setCategory(c);
                list.add(p);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
