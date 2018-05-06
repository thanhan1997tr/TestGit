/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ThanhAn
 */
public class NhanVienBUS {
    public void Load(JTable tb){
        NhanVienDAO nvdao = new NhanVienDAO();
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("MANV");
        tbTieuDe.add("TENNV");
        tbTieuDe.add("NGAYSINH");
        tbTieuDe.add("GIOITINH");
        tbTieuDe.add("DIACHI");
        tbTieuDe.add("DIENTHOAI");
        tbTieuDe.add("TENHIENTHI");
        tbTieuDe.add("QUYEN");
        tbTieuDe.add("LUONG");
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        dsnv = nvdao.LoadTb();
        for (NhanVien l : dsnv){
            Vector vDong = new Vector();
            vDong.add(l.getsManv());
            vDong.add(l.getsTennv());
            vDong.add(l.getsNgaysinh());
            vDong.add(l.getsGioitinh());
            vDong.add(l.getsDiachi());
            vDong.add(l.getsDienthoai());
            vDong.add(l.getsTenhienthi());
            vDong.add(l.getsQuyen());
            vDong.add(l.getsLuong());
            tbDong.add(vDong);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
        }
    }
}
