package QuanLyHocSinh_Java.src.HocSinhModel;

public class HocSinh {
    private String MaHocSinh;
    private String MaLopHoc;
    private String Ten;
    private String Tuoi;
    private String GioiTinh;
    private String TinhTrang;
    private String TenLop;
    private int Sdt;
    private String Email;
    public HocSinh() {
    }
    public HocSinh(String maHocSinh, String maLopHoc, String ten, String tuoi, String gioiTinh, String tinhTrang,
                   String tenLop, int sdt, String email) {
        MaHocSinh = maHocSinh;
        MaLopHoc = maLopHoc;
        Ten = ten;
        Tuoi = tuoi;
        GioiTinh = gioiTinh;
        TinhTrang = tinhTrang;
        TenLop = tenLop;
        Sdt = sdt;
        Email = email;
    }
    public String getMaHocSinh() {
        return MaHocSinh;
    }
    public void setMaHocSinh(String maHocSinh) {
        MaHocSinh = maHocSinh;
    }
    public String getMaLopHoc() {
        return MaLopHoc;
    }
    public void setMaLopHoc(String maLopHoc) {
        MaLopHoc = maLopHoc;
    }
    public String getTen() {
        return Ten;
    }
    public void setTen(String ten) {
        Ten = ten;
    }
    public String getTuoi() {
        return Tuoi;
    }
    public void setTuoi(String tuoi) {
        Tuoi = tuoi;
    }
    public String getGioiTinh() {
        return GioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }
    public String getTinhTrang() {
        return TinhTrang;
    }
    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }
    public String getTenLop() {
        return TenLop;
    }
    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }
    public int getSdt() {
        return Sdt;
    }
    public void setSdt(int sdt) {
        Sdt = sdt;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    @Override
    public String toString() {
        return "HocSinh [MaHocSinh=" + MaHocSinh + ", MaLopHoc=" + MaLopHoc + ", Ten=" + Ten + ", Tuoi=" + Tuoi
                + ", GioiTinh=" + GioiTinh + ", TinhTrang=" + TinhTrang + ", TenLop=" + TenLop + ", Sdt=" + Sdt + ", Email="
                + Email + "]";
    }
}
