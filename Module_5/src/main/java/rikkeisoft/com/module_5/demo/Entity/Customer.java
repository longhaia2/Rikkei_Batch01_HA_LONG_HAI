package rikkeisoft.com.module_5.demo.Entity;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Table(name = "khachhang")
@Entity
@Component
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int MaKhachHang;
    private String TenKhachHang;
    private Date NgaySinh;
    private int SoDienThoai;
    private String Gmail;
    private String MaLoai;

    public Customer(){
    }

    public Customer(int maKhachHang, String tenKhachHang, Date ngaySinh, int soDienThoai, String gmail, String maLoai) {
        MaKhachHang = maKhachHang;
        TenKhachHang = tenKhachHang;
        NgaySinh = ngaySinh;
        SoDienThoai = soDienThoai;
        Gmail = gmail;
        MaLoai = maLoai;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public int getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String maLoai) {
        MaLoai = maLoai;
    }
}
