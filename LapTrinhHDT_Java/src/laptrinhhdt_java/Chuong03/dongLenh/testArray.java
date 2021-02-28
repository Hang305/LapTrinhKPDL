/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong03.dongLenh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class testArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a;
        //khởi tạo
        a = new int[4];
        a[0] = 12;
        a[1] = 9;
        a[2] = 1;
        a[3] = 15;
        //xuất dữ liệu
        System.out.println(Arrays.toString(a));

        int[] b = new int[]{
            1, 3, -7, 8, 9, 20
        };
        System.out.println(Arrays.toString(b));
        System.out.println("Số lượng phần tử của mảng: " + b.length);

        //nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Số lượng phần tử của mảng n = ");
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        int[] c = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("c [" + i+"] = " );
//            input = sc.nextLine();
//            c[i]= Integer.parseInt(input);  
//        }
//        System.out.println("Giá trị của mảng vừa nhập là : ");
//        System.out.println(Arrays.toString(c));
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[i]+" ");
//        }

//khởi tạo giá trị của mảng ngẫu nhiên
        Random rdn = new Random();
        for (int i = 0; i < n; i++) {
            c[i] = rdn.nextInt(1000);
        }
        System.out.println(Arrays.toString(c));
    }

}
