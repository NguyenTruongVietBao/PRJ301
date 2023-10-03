
import java.util.ArrayList;
import java.util.List;
import sample.user.UserDAO;
import sample.user.UserDTO;

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
    public static void main(String[] args) {
        UserDAO uD = new UserDAO();
        List<UserDTO> list = uD.getAllUser();
        for (UserDTO u : list) {
            System.out.println(u);
        }
    }
}
