package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachThanNhan {
    private ArrayList<ThanNhan> Thannhan;
    public DanhSachThanNhan(){
        this.Thannhan=new ArrayList<>();
    }
    public DanhSachThanNhan(ArrayList<ThanNhan> Thannhan){
        this.Thannhan=Thannhan;
    }

    public ArrayList<ThanNhan> getThannhan() {
        return Thannhan;
    }

    public void setThannhan(ArrayList<ThanNhan> thannhan) {
        Thannhan = thannhan;
    }
}
