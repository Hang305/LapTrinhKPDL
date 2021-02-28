/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong03.dongLenh;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class test2DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matran;
        matran = new int[5][7];
        Random rdn = new Random();
        Scanner sc = new Scanner(System.in);
        //khởi tạo giá trị của ma tran băng cách sinh ngẫu nhiên
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                matran[i][j] = rdn.nextInt(1000);
//                System.out.print("a [ " + i + "] [" + j + "] = ");
//                String input = sc.nextLine();
//                int n = Integer.parseInt(input);
//                matran[i][j] = n;
            }
        }
        //xuất giá trị của ma trận ra màn hình
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                System.out.print(matran[i][j] + " ");
            }
            System.out.println();
        }
      

    }

}
