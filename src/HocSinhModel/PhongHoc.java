package QuanLyHocSinh_Java.src.HocSinhModel;

public class PhongHoc {
    private String Maphonghoc;
    private String Malophoc;
    private String TenLopHoc;
    private String Tenphonghoc;
    private String Dayphonghoc;
    private int tang;
    public PhongHoc(){

    }
    public PhongHoc(String Maphonghoc,String Malophoc,String Tenlophoc,String Tenphonghoc,String Dayphonghoc,int tang){
        this.Maphonghoc=Maphonghoc;
        this.Malophoc=Malophoc;
        this.TenLopHoc=Tenlophoc;
        this.Tenphonghoc=Tenphonghoc;
        this.Dayphonghoc=Dayphonghoc;
        this.tang=tang;
    }

    public String getMaphonghoc() {
        return Maphonghoc;
    }

    public void setMaphonghoc(String maphonghoc) {
        Maphonghoc = maphonghoc;
    }

    public String getMalophoc() {
        return Malophoc;
    }

    public void setMalophoc(String malophoc) {
        Malophoc = malophoc;
    }

    public String getTenLopHoc() {
        return TenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        TenLopHoc = tenLopHoc;
    }

    public String getTenphonghoc() {
        return Tenphonghoc;
    }

    public void setTenphonghoc(String tenphonghoc) {
        Tenphonghoc = tenphonghoc;
    }

    public String getDayphonghoc() {
        return Dayphonghoc;
    }

    public void setDayphonghoc(String dayphonghoc) {
        Dayphonghoc = dayphonghoc;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    @Override
    public String toString() {
        return "PhongHoc{" +
                "Maphonghoc='" + Maphonghoc + '\'' +
                ", Malophoc='" + Malophoc + '\'' +
                ", TenLopHoc='" + TenLopHoc + '\'' +
                ", Tenphonghoc='" + Tenphonghoc + '\'' +
                ", Dayphonghoc='" + Dayphonghoc + '\'' +
                ", tang=" + tang +
                '}';
    }
}
