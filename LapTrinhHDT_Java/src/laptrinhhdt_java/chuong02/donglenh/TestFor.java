/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.chuong02.donglenh;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class TestFor {

    public static void main(String[] args) {
        //tính tổng thứ nhất
        int n = 100;
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (double) 1 / i;
        }
        System.out.println("Tổng thứ nhất là :" + s);

        //tính tổng thứ hai
        n = 99;
        int s2 = 0;
        for (int i = 1; i <= n; i += 2) {

            s2 = s2 + i;
        }
        System.out.println("Tổng thứ nhất là :" + s2);

        //Sinh ngẫu nhiên n số nguyên
        Random rnd = new Random();
        int x;
        for (int i = 0; i < 10; i++) {
            x = rnd.nextInt(101);
            System.out.println(x);
        }

    }
}
