package QuanLyHocSinh_Java.src.HocSinhModel;

public class LoaiNguoiDung {
    private String manguoidung;
    private String tenloainguoidung;
    public LoaiNguoiDung(){

    }
    public LoaiNguoiDung(String manguoidung,String tenloainguoidung){
        this.manguoidung=manguoidung;
        this.tenloainguoidung=tenloainguoidung;
    }

    public String getManguoidung() {
        return manguoidung;
    }

    public void setManguoidung(String manguoidung) {
        this.manguoidung = manguoidung;
    }

    public String getTenloainguoidung() {
        return tenloainguoidung;
    }

    public void setTenloainguoidung(String tenloainguoidung) {
        this.tenloainguoidung = tenloainguoidung;
    }

    @Override
    public String toString() {
        return "LoaiNguoiDung{" +
                "manguoidung='" + manguoidung + '\'' +
                ", tenloainguoidung='" + tenloainguoidung + '\'' +
                '}';
    }
}
