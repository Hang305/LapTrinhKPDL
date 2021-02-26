/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.DongLenh.Chuong01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class XuatNhap {
    public static void main(String[] args) {
        boolean flag = true;
        int a =15;
        byte b =2;
        double c = 12.6;
        float d = 4.5f;
        String s ="Hello";
        char ch ='A';
        //Nhập họ tên - chuyển kiểu string
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten:");
        String hoten = sc.nextLine();
        System.out.println("Ban da nhap ho ten : "+ hoten);
        //Nhập số nguyên - chuyển từ string sang int
        System.out.print("Hay nhap vao mot so nguyen: ");
        String input = sc.nextLine();
        a = Integer.parseInt(input);
        System.out.println("So nguyen ban da nhap: "+ a);
         //Nháp số thực - chuyển từ string sang double
        System.out.print("Hay nhap vao mot so thuc: ");
        input = sc.nextLine();
        c =  Double.parseDouble(input);
        System.out.println("So nguyen ban da nhap: "+ c);
        
    }
    
}
