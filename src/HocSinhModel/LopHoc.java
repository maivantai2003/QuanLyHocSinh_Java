package QuanLyHocSinh_Java.src.HocSinhModel;

public class LopHoc {
    private String MaLopHoc;
    private String MaGVCN;
    private String MaKhoi;
    private String TenLopHoc;
    private int SiSo;
    public LopHoc(){

    }
    public LopHoc(String MaLopHoc,String MaGVCN,String MaKhoi,String TenLopHoc,int SiSo){
        this.MaLopHoc=MaLopHoc;
        this.MaGVCN=MaGVCN;
        this.MaKhoi=MaKhoi;
        this.TenLopHoc=TenLopHoc;
        this.SiSo=SiSo;
    }

    public String getMaLopHoc() {
        return MaLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        MaLopHoc = maLopHoc;
    }

    public String getMaGVCN() {
        return MaGVCN;
    }

    public void setMaGVCN(String maGVCN) {
        MaGVCN = maGVCN;
    }

    public String getMaKhoi() {
        return MaKhoi;
    }

    public void setMaKhoi(String maKhoi) {
        MaKhoi = maKhoi;
    }

    public String getTenLopHoc() {
        return TenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        TenLopHoc = tenLopHoc;
    }

    public int getSiSo() {
        return SiSo;
    }

    public void setSiSo(int siSo) {
        SiSo = siSo;
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "MaLopHoc='" + MaLopHoc + '\'' +
                ", MaGVCN='" + MaGVCN + '\'' +
                ", MaKhoi='" + MaKhoi + '\'' +
                ", TenLopHoc='" + TenLopHoc + '\'' +
                ", SiSo=" + SiSo +
                '}';
    }
}
