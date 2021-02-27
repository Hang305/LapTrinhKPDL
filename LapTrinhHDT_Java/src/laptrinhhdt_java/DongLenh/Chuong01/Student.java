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
public class Student  extends  Person implements  TaxInterface{
    
    private String TruongHoc;
    private String DiaChi;

    public Student() {
    }

    public Student(String TruongHoc, String DiaChi) {
        this.TruongHoc = TruongHoc;
        this.DiaChi = DiaChi;
    }

    public Student(String TruongHoc, String DiaChi, String HoTen, int GioiTinh, Date NgaySinh) {
        super(HoTen, GioiTinh, NgaySinh);
        this.TruongHoc = TruongHoc;
        this.DiaChi = DiaChi;
    }

    public String getTruongHoc() {
        return TruongHoc;
    }

    public void setTruongHoc(String TruongHoc) {
        this.TruongHoc = TruongHoc;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    @Override
    public double calcTax(double income) {
      return income *0.01;
    }
    
    
}
