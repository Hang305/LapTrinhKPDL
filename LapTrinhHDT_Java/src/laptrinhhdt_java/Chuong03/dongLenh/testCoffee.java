/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong03.dongLenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import laptrinhhdt_java.Chuong03.coffeeLogic.CoffeeShop;
import laptrinhhdt_java.Chuong03.coffeeLogic.Manager;

/**
 *
 * @author Admin
 */
public class testCoffee {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY", Locale.ENGLISH);

        CoffeeShop[] a = new CoffeeShop[]{
            new CoffeeShop("Thanh Coffee", "20 Thái Phiên"),
            new CoffeeShop("Bali Coffee", "12 Nguyễn Huệ"),
            new CoffeeShop("Liti Coffee", "89 Nguyễn Huệ")
        };
        Manager[] managers;
        managers = new Manager[]{
            new Manager(a, 1000, "Trần Thị Thủy", 0, df.parse("12-12-1998")),
            new Manager(new CoffeeShop[]{
                 new CoffeeShop("Hoàng Hạc", "98 Nguyễn Huệ")}, 2000, "Nguyễn Thị An", 0, df.parse("12-12-2000"))
                
        };
        System.out.println(Arrays.toString(managers));
    }
}
