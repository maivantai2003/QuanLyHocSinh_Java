package QuanLyHocSinh_Java.src.HocSinhView;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        new Login("Quản lý học sinh");
        JFrame f = new JFrame();
        f.setSize(300, 545);
        TitleBar t = new TitleBar(f);
        f.setLayout(new BorderLayout());
        
        NavBar nav = new NavBar("E:\\JAVA\\untitled\\src\\QuanLyHocSinh_Java\\img\\conan.jpg", new ArrayList<String>(Arrays.asList("Thông tin","Lịch giảng dạy","Nhập điểm","Lớp CN","Đăng xuất")));
        f.add(nav,BorderLayout.CENTER);
        f.add(t,BorderLayout.NORTH);
        f.setUndecorated(true);
        System.out.println((int)f.getSize().getWidth());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        
    }
    
}
