package QuanLyHocSinh_Java.src.HocSinhController;

import java.awt.event.*;

import QuanLyHocSinh_Java.src.HocSinhView.Login;
import QuanLyHocSinh_Java.src.HocSinhView.Signup;

public class LoginControl implements ActionListener{
    private Login lg;
    public LoginControl(Login lg){
        this.lg=lg;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Đăng nhập")){
            System.out.println(lg.getTaiKhoan().getText() +" "+ String.valueOf(lg.getMatKhau().getPassword()) + " " + lg.getQuyenTruyCap().getSelectedIndex());
        }
        if(e.getActionCommand().equals("Đăng ký")){
            System.out.println(1);
            new Signup("Quản lý học sinh");
            lg.dispose();
        }
        if(e.getActionCommand().equals("Face ID")){
            System.out.println("Open the camera");
        }
    }
    
    
}
