package QuanLyHocSinh_Java.src.HocSinhModel;

public class ThanNhan {
    private String MaHocSinh;
    private String TenCha;
    private int TuoiCha;
    private int SdtCha;
    private String TenMe;
    private int TuoiMe;
    private int SdtMe;

    public ThanNhan() {
    }

    public ThanNhan(String maHocSinh, String tenCha, int tuoiCha, int sdtCha, String tenMe, int tuoiMe, int sdtMe) {
        MaHocSinh = maHocSinh;
        TenCha = tenCha;
        TuoiCha = tuoiCha;
        SdtCha = sdtCha;
        TenMe = tenMe;
        TuoiMe = tuoiMe;
        SdtMe = sdtMe;
    }

    public String getMaHocSinh() {
        return MaHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        MaHocSinh = maHocSinh;
    }

    public String getTenCha() {
        return TenCha;
    }

    public void setTenCha(String tenCha) {
        TenCha = tenCha;
    }

    public int getTuoiCha() {
        return TuoiCha;
    }

    public void setTuoiCha(int tuoiCha) {
        TuoiCha = tuoiCha;
    }

    public int getSdtCha() {
        return SdtCha;
    }

    public void setSdtCha(int sdtCha) {
        SdtCha = sdtCha;
    }

    public String getTenMe() {
        return TenMe;
    }

    public void setTenMe(String tenMe) {
        TenMe = tenMe;
    }

    public int getTuoiMe() {
        return TuoiMe;
    }

    public void setTuoiMe(int tuoiMe) {
        TuoiMe = tuoiMe;
    }

    public int getSdtMe() {
        return SdtMe;
    }

    public void setSdtMe(int sdtMe) {
        SdtMe = sdtMe;
    }

    @Override
    public String toString() {
        return "ThanNhan [MaHocSinh=" + MaHocSinh + ", TenCha=" + TenCha + ", TuoiCha=" + TuoiCha + ", SdtCha=" + SdtCha
                + ", TenMe=" + TenMe + ", TuoiMe=" + TuoiMe + ", SdtMe=" + SdtMe + "]";
    }
}
