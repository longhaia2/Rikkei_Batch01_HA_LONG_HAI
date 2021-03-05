package task_1;

import java.io.Serializable;

public  abstract class ab_SanPham implements Serializable {
    protected String MaSanPham;
    protected String TenSanPham;
    protected int Soluong;
    protected int Dongia;
    protected String TenDM;
    public abstract void HienThiSanPham();
    public abstract void PhanTramGiamGia(String LoaKh);

    public ab_SanPham(String maSanPham, String tenSanPham, int soluong, int dongia, String tenDM) {
        MaSanPham = maSanPham;
        TenSanPham = tenSanPham;
        Soluong = soluong;
        Dongia = dongia;
        TenDM = tenDM;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String mabaSanPham) {
        MaSanPham = mabaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int dongia) {
        Dongia = dongia;
    }

    public String getTenDM() {
        return TenDM;
    }

    public void setTenDM(String tenDM) {
        TenDM = tenDM;
    }
}
