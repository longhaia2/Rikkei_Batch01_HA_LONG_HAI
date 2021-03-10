package rikkeisoft.com.module_5.demo.Entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
@Table(name="nhanvien")
@Entity
@Component
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int MaNhanVien;
    private String TenNhanVien;
    private Date NgaySinh;
    private String SoDienThoai;
    private String Gmail;
    private String DiaChi;

    public Employee(){
    }
    public Employee(int maNhanVien, String tenNhanVien, Date ngaySinh, String soDienThoai, String gmail, String diaChi) {
        MaNhanVien = maNhanVien;
        TenNhanVien = tenNhanVien;
        NgaySinh = ngaySinh;
        SoDienThoai = soDienThoai;
        Gmail = gmail;
        DiaChi = diaChi;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        MaNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        TenNhanVien = tenNhanVien;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
}
