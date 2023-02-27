package QuanLyHocSinh_Java.src.HocSinhModel;

public class TaiKhoan {
    private int sdt;
    private String manguoidung;
    private String matkhau;
    private int status;
    public TaiKhoan(){

    }
    public TaiKhoan(int sdt,String manguoidung,String matkhau,int status){
        this.sdt=sdt;
        this.manguoidung=manguoidung;
        this.matkhau=matkhau;
        this.status=status;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getManguoidung() {
        return manguoidung;
    }

    public void setManguoidung(String manguoidung) {
        this.manguoidung = manguoidung;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
