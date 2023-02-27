package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachKhoi {
    private ArrayList<Khoi> khoi;
    public DanhSachKhoi(){
        this.khoi=new ArrayList<>();
    }
    public DanhSachKhoi(ArrayList<Khoi> khoi){
        this.khoi=khoi;
    }

    public ArrayList<Khoi> getKhoi() {
        return khoi;
    }

    public void setKhoi(ArrayList<Khoi> khoi) {
        this.khoi = khoi;
    }
}
