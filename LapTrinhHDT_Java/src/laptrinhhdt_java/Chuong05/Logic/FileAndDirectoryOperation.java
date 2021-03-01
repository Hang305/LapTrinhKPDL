/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong05.Logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import oracle.jrockit.jfr.events.ContentTypeImpl;

/**
 *
 * @author Admin
 */
public class FileAndDirectoryOperation {

    public FileAndDirectoryOperation() {
    }
    
    //thao tác liệt kê tất cả các thư mục và tập tin trong thư mục hiện tại
    public File[] getDirecttoryContent (String folder){
        File directory = new File(folder);
        if (directory.isFile()) {
            return  null;
        }
        File[] result = directory.listFiles();
        return  result;
    }
    //thao tác xuất kết quả ra màn hình
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < content.length; i++) {
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
            System.out.print(sb);
            
        }
        return sb.toString();
    }
    //thao tác lọc ra các thư mục
    public File[] getSubDirectory(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++) {
            if (content[i].isDirectory()) {
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    //thao tác lọc ra tất cả các tập tin 
    public File[] getFiles(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++) {
            if (content[i].isFile()) {
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    //thao tác duyệt đệ quy xuất tất cả các tập tin thư mục
    public void getContentRecursively (String folder){
            File content = new File(folder);
            //điều kiện dừng 
            if (content.isFile()) {
                System.out.println(File.separator + content.getPath() +content.getName());
                return;
        }
            //gọi đệ quy trong stack
            System.out.println("Thư mục "+ folder);
            File [] sub = content.listFiles();
            for (int i = 0; i < sub.length; i++) {
                getContentRecursively(folder +File.separator +sub[i].getName());
        }
    }
    //tao tác đọc file văn bản
    public String readTextFile(String filename) throws FileNotFoundException, IOException{
        StringBuilder content = new StringBuilder();
        
        //dùng bộ đệm
        try ( // mở file
                FileReader fr = new FileReader(filename)) {
            //dùng bộ đệm
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while ((line= br.readLine()) != null) {
                content.append(line);
                content.append("\n");
            }
            //đóng file
            br.close();
        }
        catch (FileNotFoundException ex){
            return "Không tìm thấy file " + filename;
        }
        catch (IOException ex){
            return "Không thể đọc file " + filename;
        }
        return content.toString();
    }
    public boolean writeTextFile(String filename, String content) throws IOException{
        boolean  flag = false;
        //sử dụng buffer
        try ( //mở file
                FileWriter fw = new FileWriter(filename)) {
            //sử dụng buffer
            BufferedWriter bw = new BufferedWriter(fw);
            //ghi ra file
            bw.write(content);
            //đóng file
            bw.flush();
            bw.close();
        }
        catch(IOException ex){
            return  false;
        }
        return flag;
    }
}
