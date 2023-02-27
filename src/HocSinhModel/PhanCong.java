package QuanLyHocSinh_Java.src.HocSinhModel;

public class PhanCong {
    private String MaGV;
    private String MaMonHoc;
    private String MonGiangDay;
    public PhanCong(){

    }
    public PhanCong(String MaGV,String MaMonHoc,String MonGiangDay){
        this.MaGV=MaGV;
        this.MaMonHoc=MaMonHoc;
        this.MonGiangDay=MonGiangDay;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String maGV) {
        MaGV = maGV;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        MaMonHoc = maMonHoc;
    }

    public String getMonGiangDay() {
        return MonGiangDay;
    }

    public void setMonGiangDay(String monGiangDay) {
        MonGiangDay = monGiangDay;
    }

    @Override
    public String toString() {
        return "PhanCong{" +
                "MaGV='" + MaGV + '\'' +
                ", MaMonHoc='" + MaMonHoc + '\'' +
                ", MonGiangDay='" + MonGiangDay + '\'' +
                '}';
    }
}
