package QuanLyHocSinh_Java.src.HocSinhModel;

public class DiemMonHoc {
    private String MaHocSinh;
    private String MaMonHoc;
    private String MaHocKy;
    private int DiemMiengCot1;
    private int DiemMiengCot2;
    private float Diem15pcot1;
    private float Diem15pcot2;
    private float Diem1t;
    private float DiemThi;
    private float DiemTrungBinh;
    public DiemMonHoc(){

    }
    public DiemMonHoc(String MaHocSinh,String MaMonHoc,String MaHocKy,int DiemMiengCot1,int DiemMiengCot2,float Diem15pcot1,float Diem15pcot2,float Diem1t,float DiemThi,float DiemTrungBinh){
        this.MaHocSinh=MaHocSinh;
        this.MaMonHoc=MaMonHoc;
        this.MaHocKy=MaHocKy;
        this.DiemMiengCot1=DiemMiengCot1;
        this.DiemMiengCot2=DiemMiengCot2;
        this.Diem15pcot1=Diem15pcot1;
        this.Diem15pcot2=Diem15pcot2;
        this.Diem1t=Diem1t;
        this.DiemThi=DiemThi;
        this.DiemTrungBinh=DiemTrungBinh;
    }

    public String getMaHocSinh() {
        return MaHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        MaHocSinh = maHocSinh;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        MaMonHoc = maMonHoc;
    }

    public String getMaHocKy() {
        return MaHocKy;
    }

    public void setMaHocKy(String maHocKy) {
        MaHocKy = maHocKy;
    }

    public int getDiemMiengCot1() {
        return DiemMiengCot1;
    }

    public void setDiemMiengCot1(int diemMiengCot1) {
        DiemMiengCot1 = diemMiengCot1;
    }

    public int getDiemMiengCot2() {
        return DiemMiengCot2;
    }

    public void setDiemMiengCot2(int diemMiengCot2) {
        DiemMiengCot2 = diemMiengCot2;
    }

    public float getDiem15pcot1() {
        return Diem15pcot1;
    }

    public void setDiem15pcot1(float diem15pcot1) {
        Diem15pcot1 = diem15pcot1;
    }

    public float getDiem15pcot2() {
        return Diem15pcot2;
    }

    public void setDiem15pcot2(float diem15pcot2) {
        Diem15pcot2 = diem15pcot2;
    }

    public float getDiem1t() {
        return Diem1t;
    }

    public void setDiem1t(float diem1t) {
        Diem1t = diem1t;
    }

    public float getDiemThi() {
        return DiemThi;
    }

    public void setDiemThi(float diemThi) {
        DiemThi = diemThi;
    }

    public float getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        DiemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "DiemMonHoc{" +
                "MaHocSinh='" + MaHocSinh + '\'' +
                ", MaMonHoc='" + MaMonHoc + '\'' +
                ", MaHocKy='" + MaHocKy + '\'' +
                ", DiemMiengCot1=" + DiemMiengCot1 +
                ", DiemMiengCot2=" + DiemMiengCot2 +
                ", Diem15pcot1=" + Diem15pcot1 +
                ", Diem15pcot2=" + Diem15pcot2 +
                ", Diem1t=" + Diem1t +
                ", DiemThi=" + DiemThi +
                ", DiemTrungBinh=" + DiemTrungBinh +
                '}';
    }
}
