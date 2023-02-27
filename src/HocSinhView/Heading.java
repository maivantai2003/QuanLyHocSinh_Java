package QuanLyHocSinh_Java.src.HocSinhView;
import javax.swing.*;
import java.awt.*;

public class Heading extends JPanel {
    JLabel logo;
    JLabel title1;
    JLabel title2;
    Heading(){
        logo = new JLabel();
        this.setBackground(new Color(197, 251, 248));
        this.setBounds(0,0,530,110);
        this.setLayout(null);
        ImageIcon logoIcon = new ImageIcon("E:\\JAVA\\untitled\\src\\QuanLyHocSinh_Java\\img\\logo.png");
        logo.setIcon(logoIcon);
        logo.setBounds(36,4,100,100);
        title1 = new JLabel("Quản lý học sinh");
        title2 = new JLabel("Trường trung học thực hành Sài Gòn");
        title1.setFont(new Font("my font",Font.BOLD,18));
        title1.setBounds(134,35,350,20);
        title2.setFont(new Font("my font",Font.BOLD,18));
        title2.setBounds(134,60,350,30);
        this.add(logo);
        this.add(title1);
        this.add(title2);
        
    }
}
