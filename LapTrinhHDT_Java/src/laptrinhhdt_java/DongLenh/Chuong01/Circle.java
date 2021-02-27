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
public class Circle  extends shape{
    
    private int radius;
    private int x,y;

    public Circle() {
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    @Override
    public  double calcPerimeter(){
        return 2*Math.PI*this.radius;
   
    }
    @Override
    public String toString() {
     return "Chu vi của hình chữ tròn là: "+ calcPerimeter() + "; Diện tích : " +calcArea();//To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double calcArea(){
       return  Math.PI*this.radius*this.radius;
       
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
}
