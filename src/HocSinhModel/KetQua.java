package QuanLyHocSinh_Java.src.HocSinhModel;

public class KetQua {
    private String MaHocSinh;
    private String MaHocKy;
    private String TenHocSinh;
    private float DiemTrungBinhHK1;
    private float DiemTrungBinhHK2;
    private float DiemCaNam;
    private int Hang;
    private String Hanhkiem;
    private String XepLoai;
    private int NghiCoPhep;
    private int NghiKhongPhep;
    public KetQua(){

    }
    public KetQua(String MaHocSinh,String MaHocKy,String TenHocSinh,float DiemTrungBinhHK1,float DiemTrungBinhHK2,float DiemCaNam,int Hang,String Hanhkiem,String XepLoai,int NghiCoPhep,int NghiKhongPhep){
        this.MaHocSinh=MaHocSinh;
        this.MaHocKy=MaHocKy;
        this.TenHocSinh=TenHocSinh;
        this.DiemTrungBinhHK1=DiemTrungBinhHK1;
        this.DiemTrungBinhHK2=DiemTrungBinhHK2;
        this.DiemCaNam=DiemCaNam;
        this.Hang=Hang;
        this.Hanhkiem=Hanhkiem;
        this.XepLoai=XepLoai;
        this.NghiKhongPhep=NghiKhongPhep;
        this.NghiCoPhep=NghiCoPhep;
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

    public String getTenHocSinh() {
        return TenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        TenHocSinh = tenHocSinh;
    }

    public float getDiemTrungBinhHK1() {
        return DiemTrungBinhHK1;
    }

    public void setDiemTrungBinhHK1(float diemTrungBinhHK1) {
        DiemTrungBinhHK1 = diemTrungBinhHK1;
    }

    public float getDiemTrungBinhHK2() {
        return DiemTrungBinhHK2;
    }

    public void setDiemTrungBinhHK2(float diemTrungBinhHK2) {
        DiemTrungBinhHK2 = diemTrungBinhHK2;
    }

    public float getDiemCaNam() {
        return DiemCaNam;
    }

    public void setDiemCaNam(float diemCaNam) {
        DiemCaNam = diemCaNam;
    }

    public int getHang() {
        return Hang;
    }

    public void setHang(int hang) {
        Hang = hang;
    }

    public String getHanhkiem() {
        return Hanhkiem;
    }

    public void setHanhkiem(String hanhkiem) {
        Hanhkiem = hanhkiem;
    }

    public String getXepLoai() {
        return XepLoai;
    }

    public void setXepLoai(String xepLoai) {
        XepLoai = xepLoai;
    }

    public int getNghiCoPhep() {
        return NghiCoPhep;
    }

    public void setNghiCoPhep(int nghiCoPhep) {
        NghiCoPhep = nghiCoPhep;
    }

    public int getNghiKhongPhep() {
        return NghiKhongPhep;
    }

    public void setNghiKhongPhep(int nghiKhongPhep) {
        NghiKhongPhep = nghiKhongPhep;
    }

    @Override
    public String toString() {
        return "KetQua{" +
                "MaHocSinh='" + MaHocSinh + '\'' +
                ", MaHocKy='" + MaHocKy + '\'' +
                ", TenHocSinh='" + TenHocSinh + '\'' +
                ", DiemTrungBinhHK1=" + DiemTrungBinhHK1 +
                ", DiemTrungBinhHK2=" + DiemTrungBinhHK2 +
                ", DiemCaNam=" + DiemCaNam +
                ", Hang=" + Hang +
                ", Hanhkiem='" + Hanhkiem + '\'' +
                ", XepLoai='" + XepLoai + '\'' +
                ", NghiCoPhep=" + NghiCoPhep +
                ", NghiKhongPhep=" + NghiKhongPhep +
                '}';
    }
}
