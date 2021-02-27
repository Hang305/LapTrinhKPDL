/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.chuong02.employeeLogic;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Person {

    private String HoTen;
    private int GioiTinh;
    private Date NgaySinh;

    public Person() {
    }

    public Person(String HoTen, int GioiTinh, Date NgaySinh) {
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
    }

    Person(String nguyen_Van_A, boolean b, String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int isGioiTinh() {

        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        if (isGioiTinh() == 0) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }

    @Override
    public String toString() {
        return "Person{" + "HoTen = " + HoTen + ", GioiTinh = " + GioiTinh + ", NgaySinh = " + NgaySinh + '}';
    }

}
