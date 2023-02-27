package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachGiaoVien {
    private ArrayList<GiaoVien> Giaovien;
    public DanhSachGiaoVien(){
        Giaovien=new ArrayList<>();
    }
    public DanhSachGiaoVien(ArrayList<GiaoVien> Giaovien){
        this.Giaovien=Giaovien;
    }

    public ArrayList<GiaoVien> getGiaovien() {
        return Giaovien;
    }

    public void setGiaovien(ArrayList<GiaoVien> giaovien) {
        Giaovien = giaovien;
    }
}
