
import java.sql.SQLException;
import java.util.List;
import model.user;
import user.DAO.userDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VietBao
 */
public class Test {
     public static void main(String[] args) throws SQLException, ClassNotFoundException{
        userDAO uD = new userDAO();
        List<user> list = uD.getListUsers();        
        for (user object : list) {
            System.out.println(object.toString());
        }       
    }
}
