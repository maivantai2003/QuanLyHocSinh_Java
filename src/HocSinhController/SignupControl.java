package QuanLyHocSinh_Java.src.HocSinhController;

import QuanLyHocSinh_Java.src.HocSinhView.Login;
import QuanLyHocSinh_Java.src.HocSinhView.Signup;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class SignupControl implements ActionListener{
    Signup su;
    public SignupControl(Signup su){
        this.su = su;
    }
    public boolean check(String ps, String psC){
        if (ps.equals(psC)){
            return true;
        }
        return false;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
       if(e.getActionCommand().equals("Đăng nhập")){
        new Login("Quản lý học sinh");
        su.dispose();
       }
       if(e.getActionCommand().equals("Đăng ký")){
            String tk = su.getTaiKhoan().getText();
            System.out.println(tk);
            String ps = String.valueOf(su.getMatKhau().getPassword());
            String psComfirm = String.valueOf(su.getXacNhan().getPassword());
            if (check(ps, psComfirm)){
                JOptionPane.showMessageDialog(null, "Thông tin đã được gửi đi, vui lòng chờ phế duyệt","Thông báo",JOptionPane.PLAIN_MESSAGE);
                new Login("Quản lý học sinh");
                su.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Mật khẩu và mật khẩu xác nhận không trung khớp","Thông báo",JOptionPane.PLAIN_MESSAGE);

            }
        
       }
    }
    
}
