/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong03.dongLenh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = " Thanh Pho Hue Xinh dep,\nHue trong lanh";
        System.out.println(content);
        //Thao tã tìm vị trí của 1 kí tự
        System.out.println("Vị trí của kí tự P trong chuỗi là : " + content.indexOf("P"));
        System.out.println("Vị trí của kí tự Hue trong chuỗi là : " + content.indexOf("Hue"));
        //Thao tác kiểm tra chuỗi khởi đầu và kết thúc
        System.out.println("Chuỗi mở đâu bằng từ Hue " + content.startsWith("Hue"));
        System.out.println("Chuỗi mở đâu bằng từ Hue " + content.endsWith("dep"));
        //thao tác theo vị trí 
        String temp = content.substring(0, 13);
        System.out.println(temp);
        //thao tác phân tách chuỗi
        String[] result = content.split("\n");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
//        result = content.split(" ");
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
        //cắt khoảng trắng 2 đầu content
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].trim());
        }
        // thao tác thay thế kí tự
        temp = content.replace("a", "z");
        System.out.println(temp);

        //thao tác chuyển kiểu chữ hoa - thường
        temp = content.toUpperCase();
        System.out.println(temp);
        temp = content.toLowerCase();
        System.out.println(temp);

        //thao tác so sánh chuỗi
        temp = "Nguyen";
        if (temp.compareToIgnoreCase("nguyen") == 0) {
            System.out.println("2 chuoi bang nhau");
        } else {
            System.out.println("2 chuoi khong bang nhau");
        }

        //thao tác nối chuỗi
//        temp =temp.concat(" Văn A");
        System.out.println(temp.concat(" Văn A"));

        //thao tác truuy xuất tung chỉ số
        for (int i = 0; i < temp.length(); i++) {
            System.out.print(temp.charAt(i));
        }
        System.out.println();

        //thao tác chuyển kiểu
        temp = "155";
        int n = Integer.parseInt(temp);
        System.out.println(n);

        //thao tác stringBuilder - nối chuỗi 
        //tiết kiệm bộ nhớ
        StringBuilder sb = new StringBuilder();
        sb.append("Long lanh day nuoc in troi \n");
        sb.append("Thanh xay kho biec no phoi trong vang");
        temp = sb.toString();
        System.out.println(temp);

        //regular exp
        Pattern pattern = Pattern.compile("Thanh pho Hue", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("xinh dep !");
        boolean flag = matcher.find();
        if (flag) {
            System.out.println("Tìm thấy");
        } else {
            System.out.println("Không tìm thấy");
        }

    }

}
