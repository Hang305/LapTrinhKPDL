/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.chuong02.donglenh;

import laptrinhhdt_java.chuong02.logicLayer.PhuongTrinhBac2;

/**
 *
 * @author Admin
 */
public class TestPTB2 {
    
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2 ");
        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2(3, 4.5,-2);
//        ptb2.GiaiPhuongTrinh();
        System.out.println(ptb2.toString());
    }
}
