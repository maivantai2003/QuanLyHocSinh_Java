package QuanLyHocSinh_Java.src.HocSinhModel;

public class GiaoVien {
    private String MaGV;
    private String TenGV;
    private int TuoiGV;
    private int Sdt;
    private String Gmail;
    private String Diachi;
    public GiaoVien(){

    }
    public GiaoVien(String MaGV, String TenGV,int TuoiGV,int Sdt,String Gmail,String Diachi){
        this.MaGV=MaGV;
        this.TenGV=TenGV;
        this.TuoiGV=TuoiGV;
        this.Sdt=Sdt;
        this.Gmail=Gmail;
        this.Diachi=Diachi;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String maGV) {
        MaGV = maGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String tenGV) {
        TenGV = tenGV;
    }

    public int getTuoiGV() {
        return TuoiGV;
    }

    public void setTuoiGV(int tuoiGV) {
        TuoiGV = tuoiGV;
    }

    public int getSdt() {
        return Sdt;
    }

    public void setSdt(int sdt) {
        Sdt = sdt;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
}
