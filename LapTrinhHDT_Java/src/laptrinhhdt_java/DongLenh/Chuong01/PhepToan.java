/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.DongLenh.Chuong01;

/**
 *
 * @author Admin
 */
public class PhepToan {

    public static void main(String[] args) {
        //số nguyên
        int a = 17, b = 4, c;
        c = a + b;
        System.out.println("Phep cong " + a + " + " + b + " = " + c);
        c = a - b;
        System.out.println("Phep tru " + a + " - " + b + " = " + c);
        c = a * b;
        System.out.println("Phep nhan " + a + " * " + b + " = " + c);
        c = a / b;
        System.out.println("Phep chia lay phan nguyen " + a + " / " + b + " = " + c);
        c = a % b;
        System.out.println("Phep chia lay phan du " + a + " & " + b + " = " + c);

        //Số thực
        double x = 14.3, y = 3.56, z;
        z = x + y;
        System.out.println("Phep cong " + x + " + " + y + " = " + z);
        z = x - y;
        System.out.println("Phep tru " + x + " - " + y + " = " + z);
        z = x * y;
        System.out.println("Phep nhan " + x + " * " + y + " = " + z);
        z = x / y;
        System.out.println("Phep chia lay phan nguyen " + x + " / " + y + " = " + z);
//        z = x % y;
//        System.out.println("Phep chia lay phan du " + x + " % " + y + " = " + z);

        //kiểu logic
        boolean flag1 = true, flag2 = false, flag3 = true;
        System.out.println("Phep AND " + (flag1 && flag2));
        System.out.println("Phep OR " + (flag1 || flag2));
        System.out.println("Phep NOT " + (!flag1));
        System.out.println("Phep XOR " + (flag1 ^ flag3));

        //kiểu chuỗi
        String a1 = "Hue University";
        String a2 = "university";
        System.out.println(a1.toLowerCase());
        System.out.println(a1.toUpperCase());
        System.out.println(a1.contains(a2));
        System.out.println(a1.toLowerCase().contains(a2));
       a1= a1 +" "+ a2;
        System.out.println( a1);

    }

}
