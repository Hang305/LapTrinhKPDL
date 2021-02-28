/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong03.coffeeLogic;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Manager extends  Person{
    
private CoffeeShop[] shops;
private double income;

    public Manager(CoffeeShop[] shops, double income, String HoTen, int GioiTinh, Date NgaySinh) {
        super(HoTen, GioiTinh, NgaySinh);
        this.shops = shops;
        this.income = income;
    }

    public Manager() {
    }

    public CoffeeShop[] getShops() {
        return shops;
    }

    public void setShops(CoffeeShop[] shops) {
        this.shops = shops;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        String ketqua =super.toString();
        return  ketqua += "Manager{" + "shops=" + Arrays.deepToString(shops)+ ", income=" + income + '}';
    }


}
