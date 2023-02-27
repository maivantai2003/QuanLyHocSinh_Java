package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachPhongHoc {
    private ArrayList<PhongHoc> Phonghoc;
    public DanhSachPhongHoc(){
        this.Phonghoc=new ArrayList<>();
    }
    public DanhSachPhongHoc(ArrayList<PhongHoc> Phonghoc){
        this.Phonghoc=Phonghoc;
    }

    public ArrayList<PhongHoc> getPhonghoc() {
        return Phonghoc;
    }

    public void setPhonghoc(ArrayList<PhongHoc> phonghoc) {
        Phonghoc = phonghoc;
    }
}
