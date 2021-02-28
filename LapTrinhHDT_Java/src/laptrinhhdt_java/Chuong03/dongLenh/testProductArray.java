/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong03.dongLenh;

import java.util.Arrays;
import laptrinhhdt_java.Chuong03.coffeeLogic.Product;
import laptrinhhdt_java.Chuong03.coffeeLogic.ProductCompByName;
import laptrinhhdt_java.Chuong03.coffeeLogic.ProductCompByPrice;

/**
 *
 * @author Admin
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tạo mảng các sản phẩm 
        Product[] sp = new Product[]{
            new Product("Subsilk", 12),
            new Product("Subsilk", 25),
            new Product("Coca cola", 23),
            new Product("Milk", 32),
            new Product("Thien Long", 14),
            new Product("LifeBoy", 8)
        };
        System.out.println("Mang ban dau la ");
        System.out.println(Arrays.toString(sp));

//       Product temp;
//        for (int i = 0; i < sp.length -1; i++) {
//            for (int j = i+1; j < sp.length; j++) {
//                if (sp[i].getPrice()> sp[j].getPrice()) {
//                    temp=sp[i];
//                    sp[i]= sp[j];
//                    sp[j]= temp;
//                }
//            }
////        }
        //sắp xếp mảng theo giá cả
        Arrays.sort(sp, new ProductCompByPrice());
        System.out.println("Mang sap xep tang dan theo gia ca ");
        System.out.println(Arrays.toString(sp));
        //sắp xếp theo tên sản phẩm
        Arrays.sort(sp, new ProductCompByName());
        System.out.println("Mang sap xep tang dan theo san pham ");
        System.out.println(Arrays.toString(sp));

       int index = Arrays.binarySearch(sp, 
               new Product("Subsilk", 12),
               new ProductCompByName());
        if (index <0) {
             System.out.println("Khong tim thay" );
        }
        else {
             System.out.println("Phan tu thu " + index +" chua gia tri can tim");
             System.out.println(sp[index]);
        }
    }

}
