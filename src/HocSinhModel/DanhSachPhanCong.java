package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachPhanCong {
    private ArrayList<PhanCong> Phancong;
    public DanhSachPhanCong(){
        this.Phancong=new ArrayList<>();
    }
    public DanhSachPhanCong(ArrayList<PhanCong> Phancong){
        this.Phancong=Phancong;
    }

    public ArrayList<PhanCong> getPhancong() {
        return Phancong;
    }

    public void setPhancong(ArrayList<PhanCong> phancong) {
        Phancong = phancong;
    }
}
