package QuanLyHocSinh_Java.src.HocSinhModel;

public class HocKy {
    private String MaHocKy;
    private String namhoc;
    private String TenHocKy;
    public HocKy(){

    }
    public HocKy(String MaHocKy,String namhoc,String TenHocKy){
        this.MaHocKy=MaHocKy;
        this.namhoc=namhoc;
        this.TenHocKy=TenHocKy;
    }

    public String getMaHocKy() {
        return MaHocKy;
    }

    public void setMaHocKy(String maHocKy) {
        MaHocKy = maHocKy;
    }

    public String getNamhoc() {
        return namhoc;
    }

    public void setNamhoc(String namhoc) {
        this.namhoc = namhoc;
    }

    public String getTenHocKy() {
        return TenHocKy;
    }

    public void setTenHocKy(String tenHocKy) {
        TenHocKy = tenHocKy;
    }

    @Override
    public String toString() {
        return "HocKy{" +
                "MaHocKy='" + MaHocKy + '\'' +
                ", namhoc='" + namhoc + '\'' +
                ", TenHocKy='" + TenHocKy + '\'' +
                '}';
    }
}
