package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachHocSinh {
    private ArrayList<HocSinh> Hocsinh;
    public DanhSachHocSinh(){
        this.Hocsinh=new ArrayList<>();
    }
    public DanhSachHocSinh(ArrayList<HocSinh> Hocsinh){
        this.Hocsinh=Hocsinh;
    }

    public ArrayList<HocSinh> getHocsinh() {
        return Hocsinh;
    }

    public void setHocsinh(ArrayList<HocSinh> hocsinh) {
        Hocsinh = hocsinh;
    }
}
