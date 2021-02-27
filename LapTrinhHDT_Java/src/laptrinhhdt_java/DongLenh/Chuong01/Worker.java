/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.DongLenh.Chuong01;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Worker extends Person{
 
    private String CongTy;

    public Worker() {
    }

    public Worker(String CongTy) {
        this.CongTy = CongTy;
    }

    public Worker(String CongTy, String HoTen, int GioiTinh, Date NgaySinh) {
        super(HoTen, GioiTinh, NgaySinh);
        this.CongTy = CongTy;
    }

    public String getCongTy() {
        return CongTy;
    }

    public void setCongTy(String CongTy) {
        this.CongTy = CongTy;
    }
    
}
