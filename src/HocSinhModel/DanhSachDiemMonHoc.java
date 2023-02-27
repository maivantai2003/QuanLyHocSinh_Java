package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachDiemMonHoc {
    private ArrayList<DiemMonHoc> Diemmonhoc;
    public DanhSachDiemMonHoc(){
        this.Diemmonhoc=new ArrayList<>();
    }
    public DanhSachDiemMonHoc(ArrayList<DiemMonHoc> Diemmonhoc){
        this.Diemmonhoc=Diemmonhoc;
    }
}
