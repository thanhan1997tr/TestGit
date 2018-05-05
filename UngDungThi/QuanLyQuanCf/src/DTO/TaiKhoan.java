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
public class TaiKhoan {
    private String sTaiKhoan;
    private String sTenHienThi;
    private String sMatKhau;
    
    public TaiKhoan(){
        sTaiKhoan = "";
        sTenHienThi = "";
        sMatKhau = "";
    }

    /**
     * @return the sTaiKhoan
     */
    public String getsTaiKhoan() {
        return sTaiKhoan;
    }

    /**
     * @param sTaiKhoan the sTaiKhoan to set
     */
    public void setsTaiKhoan(String sTaiKhoan) {
        this.sTaiKhoan = sTaiKhoan;
    }

    /**
     * @return the sTenHienThi
     */
    public String getsTenHienThi() {
        return sTenHienThi;
    }

    /**
     * @param sTenHienThi the sTenHienThi to set
     */
    public void setsTenHienThi(String sTenHienThi) {
        this.sTenHienThi = sTenHienThi;
    }

    /**
     * @return the sMatKhau
     */
    public String getsMatKhau() {
        return sMatKhau;
    }

    /**
     * @param sMatKhau the sMatKhau to set
     */
    public void setsMatKhau(String sMatKhau) {
        this.sMatKhau = sMatKhau;
    }
}
