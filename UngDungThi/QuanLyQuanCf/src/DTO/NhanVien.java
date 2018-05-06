/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ThanhAn
 */
public class NhanVien {
    private String sManv;
    private String sTennv;
    private String sNgaysinh;
    private String sGioitinh;
    private String sDiachi;
    private String sDienthoai;
    private String sLuong;
    private String sTenhienthi;
    private String sMatkhau;
    private String sQuyen;
    
    public NhanVien(String ma, String ten, String ngaysinh, String gioitinh, String diachi, String dienthoai, String tenhienthi, String matkhau, String q, String luong)
    {
        this.sManv = ma;
        this.sTennv = ten;
        this.sNgaysinh = ngaysinh;
        this.sGioitinh = gioitinh;
        this.sDiachi = diachi;
        this.sDienthoai = dienthoai;
        this.sTenhienthi = tenhienthi;
        this.sMatkhau = matkhau;
        this.sQuyen = q;
        this.sLuong = luong;
    }

    /**
     * @return the sManv
     */
    public String getsManv() {
        return sManv;
    }

    /**
     * @param sManv the sManv to set
     */
    public void setsManv(String sManv) {
        this.sManv = sManv;
    }

    /**
     * @return the sTennv
     */
    public String getsTennv() {
        return sTennv;
    }

    /**
     * @param sTennv the sTennv to set
     */
    public void setsTennv(String sTennv) {
        this.sTennv = sTennv;
    }

    /**
     * @return the sNgaysinh
     */
    public String getsNgaysinh() {
        return sNgaysinh;
    }

    /**
     * @param sNgaysinh the sNgaysinh to set
     */
    public void setsNgaysinh(String sNgaysinh) {
        this.sNgaysinh = sNgaysinh;
    }

    /**
     * @return the sGioitinh
     */
    public String getsGioitinh() {
        return sGioitinh;
    }

    /**
     * @param sGioitinh the sGioitinh to set
     */
    public void setsGioitinh(String sGioitinh) {
        this.sGioitinh = sGioitinh;
    }

    /**
     * @return the sDiachi
     */
    public String getsDiachi() {
        return sDiachi;
    }

    /**
     * @param sDiachi the sDiachi to set
     */
    public void setsDiachi(String sDiachi) {
        this.sDiachi = sDiachi;
    }

    /**
     * @return the sDienthoai
     */
    public String getsDienthoai() {
        return sDienthoai;
    }

    /**
     * @param sDienthoai the sDienthoai to set
     */
    public void setsDienthoai(String sDienthoai) {
        this.sDienthoai = sDienthoai;
    }

    /**
     * @return the sLuong
     */
    public String getsLuong() {
        return sLuong;
    }

    /**
     * @param sLuong the sLuong to set
     */
    public void setsLuong(String sLuong) {
        this.sLuong = sLuong;
    }

    /**
     * @return the sTenhienthi
     */
    public String getsTenhienthi() {
        return sTenhienthi;
    }

    /**
     * @param sTenhienthi the sTenhienthi to set
     */
    public void setsTenhienthi(String sTenhienthi) {
        this.sTenhienthi = sTenhienthi;
    }

    /**
     * @return the sMatkhau
     */
    public String getsMatkhau() {
        return sMatkhau;
    }

    /**
     * @param sMatkhau the sMatkhau to set
     */
    public void setsMatkhau(String sMatkhau) {
        this.sMatkhau = sMatkhau;
    }

    /**
     * @return the sQuyen
     */
    public String getsQuyen() {
        return sQuyen;
    }

    /**
     * @param sQuyen the sQuyen to set
     */
    public void setsQuyen(String sQuyen) {
        this.sQuyen = sQuyen;
    }
}
