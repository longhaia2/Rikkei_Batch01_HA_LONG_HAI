package task_1;

import java.io.Serializable;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Date;

public class SanPhamSach extends ab_SanPham implements Serializable {
    protected String NhaXuatBan;
    protected Date NamSanXuat;
    protected String TacGia;
    protected Date NgaySX;
    protected int LanTaiBan;

    @Override
    public String toString() {
        return "SanPhamSach{" +
                "NhaXuatBan='" + NhaXuatBan + '\'' +
                ", NamSanXuat=" + NamSanXuat +
                ", TacGia='" + TacGia + '\'' +
                ", NgaySX=" + NgaySX +
                ", LanTaiBan=" + LanTaiBan +
                ", MaSanPham='" + MaSanPham + '\'' +
                ", TenSanPham='" + TenSanPham + '\'' +
                ", Soluong='" + Soluong + '\'' +
                ", Dongia=" + Dongia +
                ", TenDM='" + TenDM + '\'' +
                '}';
    }

    public SanPhamSach(String maSanPham, String tenSanPham, int soluong, int dongia, String tenDM, String nhaXuatBan, Date namSanXuat, String tacGia, Date ngaySX, int lanTaiBan) {
        super(maSanPham, tenSanPham, soluong, dongia, tenDM);
        NhaXuatBan = nhaXuatBan;
        NamSanXuat = namSanXuat;
        TacGia = tacGia;
        NgaySX = ngaySX;
        LanTaiBan = lanTaiBan;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        NhaXuatBan = nhaXuatBan;
    }

    public Date getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(Date namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public Date getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(Date ngaySX) {
        NgaySX = ngaySX;
    }

    public int getLanTaiBan() {
        return LanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        LanTaiBan = lanTaiBan;
    }

    @Override
    public void HienThiSanPham() {
        System.out.println(this.toString());
    }

    @Override
    public void PhanTramGiamGia(String Loaikh) {
        if(Loaikh =="Vip 1") System.out.println("Giảm 5%");
        else if(Loaikh=="Vip 2") System.out.println("Giam 10%");
        else System.out.println("Giam gia 2%");

    }
}
