/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author ThanhAn
 */
public class DangNhap {
    
    public Boolean DangNhap(String TaiKhoan, String MatKhau){
        boolean test = true;
        try {
            DBConnect s = new DBConnect();
            Connection conn = s.getConnection();
            
            String sql = "{call SP_DANGNHAP(?, ?)}";
            CallableStatement cs =conn.prepareCall(sql);
            cs.setString(1, TaiKhoan);
            cs.setString(2, MatKhau);
            
            ResultSet r = cs.executeQuery();
            if (r.next()){
                test = true;
            }
            else{
                test = false;
            }
            
        } catch (Exception e) {
            test = false;
        }
        return test;
    }
}
