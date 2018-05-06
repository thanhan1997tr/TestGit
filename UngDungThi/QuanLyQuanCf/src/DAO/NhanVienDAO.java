/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThanhAn
 */
public class NhanVienDAO {
    public ArrayList<NhanVien> LoadTb(){
        ArrayList<NhanVien> nv = new ArrayList<>();
        try {
            String sql = "EXEC SP_NHANVIEN_LOAD";
            DBConnect s = new DBConnect();
            Connection conn = s.getConnection();
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                String manv = rs.getString("MANV");
                String tennv = rs.getString("TENNV");
                String ngaysinh = rs.getString("NGAYSINH");
                String gioitinh = rs.getString("GIOITINH");
                String diachi = rs.getString("DIACHI");
                String dienthoai = rs.getString("DIENTHOAI");
                String tenhienthi = rs.getString("TENHIENTHI");
                String matkhau = rs.getString("MATKHAU");
                String quyen = rs.getString("QUYEN");
                String luong = rs.getString("LUONGCOBAN");
                NhanVien nvnew = new NhanVien(manv, tennv, ngaysinh, gioitinh, diachi, dienthoai, tenhienthi, matkhau, quyen, luong);
                nv.add(nvnew);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nv;
    }
}
