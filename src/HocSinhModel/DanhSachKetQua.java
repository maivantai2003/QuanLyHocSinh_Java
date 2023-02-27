package QuanLyHocSinh_Java.src.HocSinhModel;

import java.util.ArrayList;

public class DanhSachKetQua {
    private ArrayList<KetQua> Ketqua;
    public DanhSachKetQua(){
        this.Ketqua=new ArrayList<>();
    }
    public DanhSachKetQua(ArrayList<KetQua> Ketqua){
        this.Ketqua=Ketqua;
    }

    public ArrayList<KetQua> getKetqua() {
        return Ketqua;
    }

    public void setKetqua(ArrayList<KetQua> ketqua) {
        Ketqua = ketqua;
    }
}
