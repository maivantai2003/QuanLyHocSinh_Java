package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachHocKy {
    private ArrayList<HocKy> Hocky;
    public DanhSachHocKy(){
        this.Hocky=new ArrayList<>();
    }
    public DanhSachHocKy(ArrayList<HocKy> Hocky){
        this.Hocky=Hocky;
    }

    public ArrayList<HocKy> getHocky() {
        return Hocky;
    }

    public void setHocky(ArrayList<HocKy> hocky) {
        Hocky = hocky;
    }
}
