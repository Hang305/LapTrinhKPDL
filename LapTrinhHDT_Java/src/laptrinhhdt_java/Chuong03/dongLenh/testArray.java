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
        //sắp xếp mảng tăng dần
//        int temp;
//        for (int i = 0; i < n + 1; i++) {
//            for (int j = i; j < n; j++) {
//                if (c[i] > c[j]) {
//                    temp = c[i];
//                    c[i] = c[j];
//                    c[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(c));

// sắp xếp mảng theo thư viện sort
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        
        //Tìm kiếm vét cạn
        System.out.print("Nhap gia tri can tim kiem = ");
        input = sc.nextLine();
        int x = Integer.parseInt(input);
//        boolean flag = false;
//        for (int i = 0; i < c.length; i++) {
//            if (c[i]== x) {
//                flag = true;
//                System.out.println("Gia tri can tim kiem có trong mang tai vi tri " +i);
//                break;
//            }
//        }
//        if (!flag) {
//            System.out.println("Gia tri can tim kiem khong có trong mang " );
//        }
        //tìm kiếm sắp xếp
        
        int index = Arrays.binarySearch(c, x);
        if (index <0) {
            System.out.println("Khong tim thay" );
        }
        else{
             System.out.println("Gia tri can tim kiem có trong mang tai vi tri " +index);
        }
    }

}
