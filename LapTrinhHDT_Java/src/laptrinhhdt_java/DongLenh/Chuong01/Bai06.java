/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.DongLenh.Chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class Bai06 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY", Locale.ENGLISH);
        String input = "27-02-2012";
        Date ngaysinh = df.parse(input);

        Person person = new Person("Nguyễn Văn A", 1, ngaysinh);
        System.out.println("Họ tên : " + person.getHoTen() + "; Giới tính : "
                + person.getGioiTinh() + "; Ngày sinh : "
                + df.format(person.getNgaySinh()));

        Student sinhvien = new Student();
        sinhvien.setHoTen("Nguyễn Văn B");
        sinhvien.setGioiTinh(0);
        sinhvien.setNgaySinh(df.parse("12-12-2016"));
        sinhvien.setTruongHoc("Đại học Huế");
        sinhvien.setDiaChi("99 Hồ Đắc Di");

        System.out.println("Họ tên : " + sinhvien.getHoTen() + "; Giới tính : "
                + sinhvien.getGioiTinh() + "; Ngày sinh : "
                + df.format(sinhvien.getNgaySinh()) + "; Trường học : " + sinhvien.getTruongHoc()
                + "; Địa chỉ : " + sinhvien.getDiaChi());

        Worker congnhan = new Worker();
        congnhan.setHoTen("Nguyễn Thị C");
        congnhan.setGioiTinh(0);
        congnhan.setNgaySinh(df.parse("15-07-1928"));
        congnhan.setCongTy("Công ty ABC");

        System.out.println("Họ tên : " + congnhan.getHoTen() + "; Giới tính : "
                + congnhan.getGioiTinh() + "; Ngày sinh : "
                + df.format(congnhan.getNgaySinh())
                + "; Trường học : " + congnhan.getCongTy());

    }
}
