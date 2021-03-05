package task_1;

import java.io.Serializable;

public class DoChoiTreEm extends  ab_SanPham implements Serializable {
    protected String XuatXu;
    protected String ThuongHieu;
    protected String NhaCC;
    protected String HuongDanSD;

    @Override
    public String toString() {
        return "DoChoiTreEm{" +
                "XuatXu='" + XuatXu + '\'' +
                ", ThuongHieu='" + ThuongHieu + '\'' +
                ", NhaCC='" + NhaCC + '\'' +
                ", HuongDanSD='" + HuongDanSD + '\'' +
                ", MaSanPham='" + MaSanPham + '\'' +
                ", TenSanPham='" + TenSanPham + '\'' +
                ", Soluong='" + Soluong + '\'' +
                ", Dongia=" + Dongia +
                ", TenDM='" + TenDM + '\'' +
                '}';
    }

    public DoChoiTreEm(String maSanPham, String tenSanPham, int soluong, int dongia, String tenDM, String xuatXu, String thuongHieu, String nhaCC, String huongDanSD) {
        super(maSanPham, tenSanPham, soluong, dongia, tenDM);
        XuatXu = xuatXu;
        ThuongHieu = thuongHieu;
        NhaCC = nhaCC;
        HuongDanSD = huongDanSD;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String xuatXu) {
        XuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        ThuongHieu = thuongHieu;
    }

    public String getNhaCC() {
        return NhaCC;
    }

    public void setNhaCC(String nhaCC) {
        NhaCC = nhaCC;
    }

    public String getHuongDanSD() {
        return HuongDanSD;
    }

    public void setHuongDanSD(String huongDanSD) {
        HuongDanSD = huongDanSD;
    }

    @Override
    public void HienThiSanPham() {
        System.out.println(this.toString());
    }

    @Override
    public void PhanTramGiamGia(String Loaikh) {
    if(Loaikh =="Vip 1") System.out.println("Giảm 5%");
    else if(Loaikh=="Vip 2") System.out.println("Giam 7%");
    else System.out.println("Giam gia 2%");
    }
}
