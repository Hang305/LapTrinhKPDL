/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.chuong02.employeeLogic;


import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student  extends  Person implements  TaxInterface{
    
    private String TruongHoc;
    private String DiaChi;
    private String HocLuc;
    private double HocBong;

    public Student() {
    }
    public Student(String TruongHoc, String DiaChi) {
        this.TruongHoc = TruongHoc;
        this.DiaChi = DiaChi;
    }

    
  public Student(String TruongHoc, String HocLuc,  String HoTen, int GioiTinh, Date NgaySinh) {
        super(HoTen, GioiTinh, NgaySinh);
        this.TruongHoc = TruongHoc;
        this.HocLuc = HocLuc;
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

    public String getHocLuc() {
        return HocLuc;
    }

    public void setHocLuc(String HocLuc) {
        this.HocLuc = HocLuc;
    }

    public double getHocBong() {
        return HocBong;
    }

    public void setHocBong(double HocBong) {
        this.HocBong = HocBong;
    }

    @Override
    public double calcTax(double income) {
      return income *0.01;
    }

    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua +="Student{" + "TruongHoc=" + TruongHoc + ", DiaChi=" + DiaChi + ", HocLuc=" + HocLuc + ", HocBong=" + HocBong + '}';
        return ketqua;
    }
    
}
