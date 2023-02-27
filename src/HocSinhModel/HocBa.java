package QuanLyHocSinh_Java.src.HocSinhModel;

public class HocBa {
    private String MaHocBa;
    private String MaHocSinh;
    private String MaHocKy;
    private String MaLop;
    private float DiemTrungBinhHK1;
    private String XepLoaiHK1;
    private float DiemTrungBinhHK2;
    private String XepLoaiHK2;
    private float DiemTrungBinhCN;
    public HocBa(){

    }
    public HocBa(String MaHocBa,String MaHocSinh,String MaHocKy,String MaLop,float DiemTrungBinhHK1,String XepLoaiHK1,float DiemTrungBinhHK2,String XepLoaiHK2,float DiemTrungBinhCN){
        this.MaHocBa=MaHocBa;
        this.MaHocSinh=MaHocSinh;
        this.MaHocKy=MaHocKy;
        this.MaLop=MaLop;
        this.DiemTrungBinhHK1=DiemTrungBinhHK1;
        this.XepLoaiHK1=XepLoaiHK1;
        this.DiemTrungBinhHK2=DiemTrungBinhHK2;
        this.XepLoaiHK2=XepLoaiHK2;
        this.DiemTrungBinhCN=DiemTrungBinhCN;
    }

    public String getMaHocBa() {
        return MaHocBa;
    }

    public void setMaHocBa(String maHocBa) {
        MaHocBa = maHocBa;
    }

    public String getMaHocSinh() {
        return MaHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        MaHocSinh = maHocSinh;
    }

    public String getMaHocKy() {
        return MaHocKy;
    }

    public void setMaHocKy(String maHocKy) {
        MaHocKy = maHocKy;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }

    public float getDiemTrungBinhHK1() {
        return DiemTrungBinhHK1;
    }

    public void setDiemTrungBinhHK1(float diemTrungBinhHK1) {
        DiemTrungBinhHK1 = diemTrungBinhHK1;
    }

    public String getXepLoaiHK1() {
        return XepLoaiHK1;
    }

    public void setXepLoaiHK1(String xepLoaiHK1) {
        XepLoaiHK1 = xepLoaiHK1;
    }

    public float getDiemTrungBinhHK2() {
        return DiemTrungBinhHK2;
    }

    public void setDiemTrungBinhHK2(float diemTrungBinhHK2) {
        DiemTrungBinhHK2 = diemTrungBinhHK2;
    }

    public String getXepLoaiHK2() {
        return XepLoaiHK2;
    }

    public void setXepLoaiHK2(String xepLoaiHK2) {
        XepLoaiHK2 = xepLoaiHK2;
    }

    public float getDiemTrungBinhCN() {
        return DiemTrungBinhCN;
    }

    public void setDiemTrungBinhCN(float diemTrungBinhCN) {
        DiemTrungBinhCN = diemTrungBinhCN;
    }

    @Override
    public String toString() {
        return "HocBa{" +
                "MaHocBa='" + MaHocBa + '\'' +
                ", MaHocSinh='" + MaHocSinh + '\'' +
                ", MaHocKy='" + MaHocKy + '\'' +
                ", MaLop='" + MaLop + '\'' +
                ", DiemTrungBinhHK1=" + DiemTrungBinhHK1 +
                ", XepLoaiHK1='" + XepLoaiHK1 + '\'' +
                ", DiemTrungBinhHK2=" + DiemTrungBinhHK2 +
                ", XepLoaiHK2='" + XepLoaiHK2 + '\'' +
                ", DiemTrungBinhCN=" + DiemTrungBinhCN +
                '}';
    }
}
