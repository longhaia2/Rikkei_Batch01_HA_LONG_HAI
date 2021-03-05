package task_1;

import java.io.Serializable;
import java.util.Date;

public class HoaDon implements Serializable {
    protected String MaHD;
    protected String MaKH;
    protected String MaSP;
    protected int SoLuong;
    protected Date NgayMua;
    protected int DonGia;
    protected int TongTien;

    @Override
    public String toString() {
        return "HoaDon{" +
                "MaHD='" + MaHD + '\'' +
                ", MaKH='" + MaKH + '\'' +
                ", MaSP='" + MaSP + '\'' +
                ", SoLuong=" + SoLuong +
                ", NgayMua=" + NgayMua +
                ", DonGia=" + DonGia +
                ", TongTien=" + TongTien +
                '}';
    }
    public void hienThiThongTin(){
        System.out.println(this.toString());
    }



    public HoaDon(String maHD, String maKH, String maSP, int soLuong, Date ngayMua, int donGia, int tongTien) {
        MaHD = maHD;
        MaKH = maKH;
        MaSP = maSP;
        SoLuong = soLuong;
        NgayMua = ngayMua;
        DonGia = donGia;
        TongTien = tongTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String maHD) {
        MaHD = maHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public Date getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(Date ngayMua) {
        NgayMua = ngayMua;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int donGia) {
        DonGia = donGia;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }

}
