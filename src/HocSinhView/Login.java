package QuanLyHocSinh_Java.src.HocSinhView;
import javax.swing.*;
import java.awt.event.*;
import QuanLyHocSinh_Java.src.HocSinhController.LoginControl;

import java.awt.*;

public class Login extends JFrame{
    JPanel heading;
    JPanel content;
    JLabel title;
    JLabel taiKhoanText;
    JLabel matKhauText;
    JTextField taiKhoan;
    JPasswordField matKhau;
    
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
    public JButton getFaceID() {
        return faceID;
    }
    public void setFaceID(JButton faceID) {
        this.faceID = faceID;
    }
    public JButton getLogin() {
        return login;
    }
    public void setLogin(JButton login) {
        this.login = login;
    }
    public JButton getSignup() {
        return signup;
    }
    public void setSignup(JButton signup) {
        this.signup = signup;
    }
    public JComboBox getQuyenTruyCap() {
        return quyenTruyCap;
    }
    public void setQuyenTruyCap(JComboBox quyenTruyCap) {
        this.quyenTruyCap = quyenTruyCap;
    }
    JButton faceID;
    JButton login;
    JButton signup;
    
    JComboBox quyenTruyCap;
    Font f = new Font("my font",Font.BOLD,14);
    
    public Login(){
        this.setSize(530,347);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        heading = new Heading();
        ActionListener ac = new LoginControl(this);
        title = new JLabel("Đăng nhập");
        title.setFont(new Font("my font",Font.BOLD,24));
        title.setForeground(new Color(255, 92, 0));
        title.setBounds(189,94,127,29);

        taiKhoanText = new JLabel("Tài khoản");
        taiKhoanText.setFont(new Font("my font",Font.BOLD,20));
        taiKhoanText.setBounds(33,41,133,29);

        taiKhoan = new JTextField();
        taiKhoan.setBounds(153,33,294,34);

        matKhauText = new JLabel("Mật khẩu");
        matKhauText.setFont(new Font("my font",Font.BOLD,20));
        matKhauText.setBounds(33,88,133,29);

        matKhau = new JPasswordField();
        matKhau.setBounds(153,80,294,34);

        
        faceID = new JButton("Face ID");
        faceID.setBackground(new Color(197, 251, 248));
        faceID.setFont(f);
        faceID.setFocusable(false);
        faceID.setBounds(43,142,90,31);
        faceID.addActionListener(ac);

        login = new JButton("Đăng nhập");
        login.addActionListener(ac);
        login.setBackground(new Color(197, 251, 248));
        login.setFont(f);
        login.setFocusable(false);
        login.setBounds(262,142,114,31);

        signup = new JButton("Đăng ký");
        signup.setBackground(new Color(197, 251, 248));
        signup.setFont(f);
        signup.setFocusable(false);
        signup.setBounds(152,142,93,31);
        signup.addActionListener(ac);

        String[] quyen = {"Admin", "Giáo viên", "Học sinh"};
        quyenTruyCap = new JComboBox(quyen);
        quyenTruyCap.setBackground(new Color(197, 251, 248));
        quyenTruyCap.setFont(f);
        quyenTruyCap.setFocusable(false);
        quyenTruyCap.setBounds(400,142,80,31);
       
        

        content = new JPanel();
        content.setLayout(null);
        content.setBackground(new Color(255,255,255));
        content.setBounds(0, 110, 530, 200);
        content.add(taiKhoanText);
        content.add(matKhauText);
        content.add(taiKhoan);
        content.add(matKhau);
        content.add(faceID);
        content.add(signup);
        content.add(login);
        content.add(quyenTruyCap);

        this.add(title);
        this.add(heading);
        this.add(content);

        this.setVisible(true);
    }
}