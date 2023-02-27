package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachLop {
    private ArrayList<LopHoc> Lophoc;
    public DanhSachLop(){
        this.Lophoc=new ArrayList<>();
    }
    public DanhSachLop(ArrayList<LopHoc> Lophoc){
        this.Lophoc=Lophoc;
    }

    public ArrayList<LopHoc> getLophoc() {
        return Lophoc;
    }

    public void setLophoc(ArrayList<LopHoc> lophoc) {
        Lophoc = lophoc;
    }
}
