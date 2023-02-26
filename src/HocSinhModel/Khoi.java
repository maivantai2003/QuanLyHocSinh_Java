package QuanLyHocSinh_Java.src.HocSinhModel;

public class Khoi {
    private String MaKhoi;
    private String TenKhoi;
    public Khoi(){

    }
    public Khoi(String MaKhoi,String TenKhoi){
        this.MaKhoi=MaKhoi;
        this.TenKhoi=TenKhoi;
    }

    public String getMaKhoi() {
        return MaKhoi;
    }

    public void setMaKhoi(String maKhoi) {
        MaKhoi = maKhoi;
    }

    public String getTenKhoi() {
        return TenKhoi;
    }

    public void setTenKhoi(String tenKhoi) {
        TenKhoi = tenKhoi;
    }

    @Override
    public String toString() {
        return "Khoi{" +
                "MaKhoi='" + MaKhoi + '\'' +
                ", TenKhoi='" + TenKhoi + '\'' +
                '}';
    }
}
