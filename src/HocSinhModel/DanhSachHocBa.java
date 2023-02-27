package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachHocBa {
    private ArrayList<HocBa> Hocba;
    public DanhSachHocBa(){
        this.Hocba=new ArrayList<>();
    }
    public DanhSachHocBa(ArrayList<HocBa> Hocba){
        this.Hocba=Hocba;
    }

    public ArrayList<HocBa> getHocba() {
        return Hocba;
    }

    public void setHocba(ArrayList<HocBa> hocba) {
        Hocba = hocba;
    }
}
