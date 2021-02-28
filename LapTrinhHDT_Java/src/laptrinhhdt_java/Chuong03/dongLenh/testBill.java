/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong03.dongLenh;

import laptrinhhdt_java.Chuong03.coffeeLogic.Bill;
import laptrinhhdt_java.Chuong03.coffeeLogic.Product;

/**
 *
 * @author Admin
 */
public class testBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Bill a = new Bill(12, new Product[]{
            new Product("CloseUp", 32),
            new Product("PS", 12),
            new Product("Shapoo", 34),
            new Product("Soda", 24),
        });
        System.out.println("a = "+ a);
        Bill temp = (Bill) a.clone();
        temp.setBillID(15);
        System.out.println("a = "+ a);
        System.out.println("temp = " +temp);
    }
    
}
