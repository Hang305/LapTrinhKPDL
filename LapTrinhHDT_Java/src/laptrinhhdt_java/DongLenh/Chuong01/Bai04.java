/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.DongLenh.Chuong01;

/**
 *
 * @author Admin
 */
public class Bai04 {

    public static void main(String[] args) {
        Circle htron = new Circle(5, 1, 2);
        System.out.println("Chu vi của hình tròn :" + htron.calcPerimeter());
        System.out.println("Diện của hình tròn :" + htron.calcArea());

        Rectangle hcn = new Rectangle(3,15,8,5);
        System.out.println("Chu vi của hình chữ nhật :" + hcn.calcPermeter());
        System.out.println("Diện của hình chữ nhật :" + hcn.calcArea());
    }
}
