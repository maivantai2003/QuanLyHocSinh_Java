package QuanLyHocSinh_Java.src.HocSinhView;
import javax.swing.*;
import QuanLyHocSinh_Java.src.HocSinhController.SignupControl;

import java.awt.*;
import java.awt.event.*;
public class Signup extends JFrame{
    JPanel heading;
    JPanel content;
    JLabel title;
    JLabel taiKhoanText;
    JLabel matKhauText;
    JLabel xacNhanText;
    JTextField taiKhoan;
    public JTextField getTaiKhoan() {
        return taiKhoan;
    }
    public void setTaiKhoan(JTextField taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    public JPasswordField getMatKhau() {
        return matKhau;
    }
    public void setMatKhau(JPasswordField matKhau) {
        this.matKhau = matKhau;
    }
    public JPasswordField getXacNhan() {
        return xacNhan;
    }
    public void setXacNhan(JPasswordField xacNhan) {
        this.xacNhan = xacNhan;
    }
    JPasswordField matKhau;
    JPasswordField xacNhan;
    JButton login;
    JButton signup;
    public Signup(){
        this.setSize(530,380);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        heading = new Heading();
        content = new JPanel();
        content.setBounds(0,110,530,233);
        content.setBackground(Color.white);
        content.setLayout(null);

        ActionListener ac = new SignupControl(this);

        title = new JLabel("Đăng ký");
        title.setFont(new Font("my font",Font.BOLD,24));
        title.setForeground(new Color(255, 92, 0));
        title.setBounds(209,94,127,29);

        taiKhoanText = new JLabel("Tài khoản:");
        taiKhoanText.setFont(new Font("my font",Font.BOLD,20));
        taiKhoanText.setBounds(33,41,133,29);

        taiKhoan = new JTextField();
        taiKhoan.setBounds(153,33,294,34);

        matKhauText = new JLabel("Mật khẩu:");
        matKhauText.setFont(new Font("my font",Font.BOLD,20));
        matKhauText.setBounds(33,88,133,29);

        matKhau = new JPasswordField();
        matKhau.setBounds(153,80,294,34);

        xacNhanText = new JLabel("Xác nhận:");
        xacNhanText.setFont(new Font("my font",Font.BOLD,20));
        xacNhanText.setBounds(33,135,133,29);

        xacNhan = new JPasswordField();
        xacNhan.setBounds(153,127,294,34);

        login = new JButton("Đăng nhập");
        login.setBackground(new Color(197, 251, 248));
        login.setFocusable(false);
        login.setFont(new Font("my font",Font.BOLD,14));
        login.setBounds(154,173,110,31);
        login.addActionListener(ac);
        signup = new JButton("Đăng ký");
        signup.setBackground(new Color(197, 251, 248));
        signup.setFocusable(false);
        signup.setFont(new Font("my font",Font.BOLD,14));
        signup.setBounds(284,173,105,31);
        signup.addActionListener(ac);
        content.add(taiKhoanText);
        content.add(matKhauText);
        content.add(xacNhanText);

        content.add(taiKhoan);
        content.add(matKhau);
        content.add(xacNhan);

        content.add(login);
        content.add(signup);

        this.add(title);
        this.add(heading);
        this.add(content);
        this.setVisible(true);
    }

}
