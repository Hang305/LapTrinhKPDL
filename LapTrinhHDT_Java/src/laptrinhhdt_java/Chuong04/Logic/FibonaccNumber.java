/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong04.Logic;

/**
 *
 * @author Admin
 */
public class FibonaccNumber {

    public FibonaccNumber() {
    }
    
    public int calcFino(int n){
        //điều kiện dừng 
        if (n==0) {
            return  0;
        }
        if (n==1) {
            return 1;
        }
        //lời gọi đệ quy
        
        return calcFino(n-1)+ calcFino(n-2);
        
    }
}
