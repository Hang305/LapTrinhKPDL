/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.chuong02.logicLayer;

/**
 *
 * @author Admin
 */
public class PhuongTrinhBac2 implements PhuongTrinhInterface {

    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private String ketqua;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PhuongTrinhBac2() {
    }

    @Override
    public void GiaiPhuongTrinh() {
        if (a == 0) {
            PhuongTrinhBac1 ptbac1 = new PhuongTrinhBac1(b, c);
            ptbac1.GiaiPhuongTrinh();
            ketqua = ptbac1.getKetqua();
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                ketqua = "Phương trình bậc 2 vô nghiệm ";
            } else {
                if (delta == 0) {
                    x1 = -b / (2 * a);
                    ketqua = "Phương trình bậc 2 có nghiệm kép : " + x1;
                } else {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    ketqua = "Phương trình bậc 2 có 2 nghiệm phân biệt là x1 : " + x1 + "; x2 : " + x2;
                }
            }
        }
    }

    @Override
    public String toString() {
        if (ketqua == null || ketqua.isEmpty()) {
            GiaiPhuongTrinh();
        }
        return ketqua;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    

}
