package QuanLyHocSinh_Java.src.HocSinhModel;

public class MonHoc {
    private String MaMonHoc;
    private String TenMonHoc;
    private int SoTiet;
    public MonHoc(){
    }
    public MonHoc(String MaMonHoc,String TenMonHoc,int SoTiet){
        this.MaMonHoc=MaMonHoc;
        this.TenMonHoc=TenMonHoc;
        this.SoTiet=SoTiet;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        MaMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        TenMonHoc = tenMonHoc;
    }

    public int getSoTiet() {
        return SoTiet;
    }

    public void setSoTiet(int soTiet) {
        SoTiet = soTiet;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "MaMonHoc='" + MaMonHoc + '\'' +
                ", TenMonHoc='" + TenMonHoc + '\'' +
                ", SoTiet=" + SoTiet +
                '}';
    }
}
