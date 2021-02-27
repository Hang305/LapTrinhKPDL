/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.chuong02.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import laptrinhhdt_java.chuong02.employeeLogic.Student;

/**
 *
 * @author Admin
 */
public class TestStudent {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY", Locale.ENGLISH);
        String input = "12-02-2012";
        Date ngaysinh = df.parse(input);
        Student obj = new Student("Đại học Huế"
              , "Xuất sắc",
                "Nguyễn Văn A", 0, ngaysinh);
        switch (obj.getHocLuc()) {
            case "Xuất sắc":
                obj.setHocBong(1000);
                break;
            case "Giỏi":
                obj.setHocBong(855);
                break;
            default:
                obj.setHocBong(0);
        }
        System.out.println(obj);
    }
}
