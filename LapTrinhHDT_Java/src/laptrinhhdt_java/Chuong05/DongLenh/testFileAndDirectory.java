/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong05.DongLenh;

import java.io.File;
import laptrinhhdt_java.Chuong05.Logic.FileAndDirectoryOperation;

/**
 *
 * @author Admin
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDirectoryOperation fo = new FileAndDirectoryOperation();
//        File[] content = fo.getDirecttoryContent("E:\\KPDL\\BaiTap\\LTHDT_Java\\LapTrinhKPDL\\LapTrinhHDT_Java\\build\\classes\\laptrinhhdt_java");
////        System.out.print(fo.displayContent(content));
//        //hiển thị danh sách các thư mục
//        File[] thumuc = fo.getSubDirectory(content);
//        System.out.println("Danh sách các thư mục :");
//        System.out.println(fo.displayContent(thumuc));
//        //hiển thị danh sách tập tin
//        System.out.print(fo.displayContent(content));
//        File[] taptin = fo.getFiles(content);
//        System.out.println("Danh sách các tập tin :");
//        System.out.println(fo.displayContent(taptin));
        fo.getContentRecursively("F:\\DAIHOC");

    }

}
