/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong04.donglenh;

import laptrinhhdt_java.Chuong04.Logic.FibonaccNumber;

/**
 *
 * @author Admin
 */
public class testFinonaccNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FibonaccNumber fn = new FibonaccNumber();
        System.out.println("So Fibonacc tai vi tri n =15 la " +fn.calcFino(15));
        for (int i = 0; i < 20; i++) {
             System.out.print(fn.calcFino(i) + " ");
        }
    }
    
}
