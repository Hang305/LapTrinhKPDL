/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.chuong02.donglenh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class testWhile {

    public static void main(String[] args) {

        int n = 0, i = 1;
        //kĩ thuật cộng dồn
//        double s1 =0;
//       n=100;
//        while (i<=n) {
//            s1=s1+(double)1/i;
//            i++;
//        }
//        System.out.println("Tổng thứ nhất :" +s1);
//        
//      

        //kĩ thuật thay đổi bước nhảy
        //tính số nguyên dương của số lẻ
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.print("Nhập số nguyên dương : n = ");
            String input = sc.nextLine();
            n = Integer.parseInt(input);
//            if ((n > 0) && (n % 2 != 0)) {
//                flag = true;
//            } else {
//                flag = false;
//////            }
            flag = ((n > 0) && (n % 2 != 0) ? true : false);
        }
        int s2 = 0;
        i = 1;
        while (i <= n) {
            s2 += i;
            i += 2;
        }
        System.out.println("Tổng thứ hai :" + s2);

    }
}
