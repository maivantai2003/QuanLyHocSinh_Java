package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachMonHoc {
    private ArrayList<MonHoc> Monhoc;
    public DanhSachMonHoc(){
        Monhoc=new ArrayList<>();
    }
    public DanhSachMonHoc(ArrayList<MonHoc> monhoc) {
        Monhoc = monhoc;
    }

    public ArrayList<MonHoc> getMonhoc() {
        return Monhoc;
    }

    public void setMonhoc(ArrayList<MonHoc> monhoc) {
        Monhoc = monhoc;
    }
}
