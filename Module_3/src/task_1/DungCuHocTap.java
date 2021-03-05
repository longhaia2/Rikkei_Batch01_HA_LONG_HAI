package task_1;

import java.io.Serializable;

public class DungCuHocTap extends  ab_SanPham implements Serializable {
    protected String XuatXu;
    protected String ThuongHieu;
    protected String NhaCC;
    protected String HuongDanSD;
    protected String MauSac;
    protected String ChatLieu;
    protected String KichThuoc;

    @Override
    public String toString() {
        return "DungCuHocTap{" +
                "XuatXu='" + XuatXu + '\'' +
                ", ThuongHieu='" + ThuongHieu + '\'' +
                ", NhaCC='" + NhaCC + '\'' +
                ", HuongDanSD='" + HuongDanSD + '\'' +
                ", MauSac='" + MauSac + '\'' +
                ", ChatLieu='" + ChatLieu + '\'' +
                ", KichThuoc='" + KichThuoc + '\'' +
                ", MaSanPham='" + MaSanPham + '\'' +
                ", TenSanPham='" + TenSanPham + '\'' +
                ", Soluong='" + Soluong + '\'' +
                ", Dongia=" + Dongia +
                ", TenDM='" + TenDM + '\'' +
                '}';
    }

    @Override
    public void HienThiSanPham() {
        System.out.println(this.toString());
    }

    @Override
    public void PhanTramGiamGia(String Loaikh) {
        if(Loaikh =="Vip 1") System.out.println("Giảm 3%");
        else if(Loaikh=="Vip 2") System.out.println("Giam 7%");
        else System.out.println("Giam gia 1%");
    }

    public DungCuHocTap(String maSanPham, String tenSanPham, int soluong, int dongia, String tenDM, String xuatXu, String thuongHieu, String nhaCC, String huongDanSD, String mauSac, String chatLieu, String kichThuoc) {
        super(maSanPham, tenSanPham, soluong, dongia, tenDM);
        XuatXu = xuatXu;
        ThuongHieu = thuongHieu;
        NhaCC = nhaCC;
        HuongDanSD = huongDanSD;
        MauSac = mauSac;
        ChatLieu = chatLieu;
        KichThuoc = kichThuoc;
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

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String mauSac) {
        MauSac = mauSac;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String chatLieu) {
        ChatLieu = chatLieu;
    }

    public String getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        KichThuoc = kichThuoc;
    }
}
