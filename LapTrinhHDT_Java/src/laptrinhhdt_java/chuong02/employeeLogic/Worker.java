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
public class Worker extends Person implements  TaxInterface{
 
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

    @Override
    public double calcTax(double income) {
       return  income*0.04;
    }
    
}
