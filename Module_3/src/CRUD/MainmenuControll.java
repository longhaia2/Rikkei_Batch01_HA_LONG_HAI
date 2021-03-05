package CRUD;

import task_1.HoaDon;
import task_1.*;
import  CRUD.*;

import java.util.Scanner;

public class MainmenuControll {
    public static Scanner scanner = new Scanner(System.in);
    Sachmanager sachmanager = new Sachmanager();
    DoChoiTreEmmanager doChoiTreEmmanager = new DoChoiTreEmmanager();
    DungCuHocTapManeger dungCuHocTapManeger = new DungCuHocTapManeger();
    HoaDonManeger hoaDonManeger = new HoaDonManeger();

    public void menu() {
        boolean bool = true;
        while (bool) {
            System.out.println("---------------------------------");
            System.out.println("---------------Menu--------------");
            System.out.println("----------------------------------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Thêm Đơn hàng ");
            System.out.println("3. Hiển thị thông tin sản phẩm");
            System.out.println("4. Hiển thị danh sách Đơn Hàng ");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Thoat");
            int index;
            index = scanner.nextInt();
            switch (index) {
                case 1:
                    menuThemSanPham();
                    break;
                case 2:
                    menuThemDonHang();
                    break;
                case 3:
                    menuHienThiThongTinSanPham();
                    break;
                case 4:
                    menuHienThiDanhSachDonHang();
                    break;
                case 5:
                    menuTimKiem();
                    break;
                case 6:
                    return;
            }
        }

    }

    private void menuTimKiem() {

        boolean bool = true;
        while (bool) {
            System.out.println("-------------------------------------");
            System.out.println("-------------Tìm kiếm------------------");
            System.out.println("---------------------------------------------");
            System.out.println("1. Tìm kiếm Sản phẩm theo mã đơn hàng");
            System.out.println("2. Thoat");
            int index = scanner.nextInt();
            switch (index) {
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("---Tìm kiếm Sản phẩm theo mã đơn hàng----");
                    System.out.println("----------------------------------------");
                    System.out.println("Nhap ma đơn hàng: ");
                    String maDH = scanner.nextLine();
                    try {
                        HoaDon hoaDon = hoaDonManeger.TimKiem(maDH);
                        hoaDon.hienThiThongTin();
                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 2:
                    return;
            }
        }
    }

    private void menuHienThiDanhSachDonHang() {
        System.out.println("----------------------------------");
        System.out.println("----Hien thi danh sach hoa don----");
        System.out.println("----------------------------------");
        hoaDonManeger.show();
    }

    private void menuHienThiThongTinSanPham() {
        int index;
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("-----Hiển thị thông tin sản phẩm--------");
            System.out.println("-----------------------------------------");
            System.out.println("1. Hiển thị tất cả các sản phẩm Sách");
            System.out.println("2. Hiển thị tất cả các sản phẩm Đồ dùng học tập");
            System.out.println("3. Hiển thị tất cả các sản phẩm Đồ chơi trẻ em");
            System.out.println("4. Thoat");
            index = scanner.nextInt();
            switch (index) {
                case 1:
                    sachmanager.show();
                    break;
                case 2:
                    dungCuHocTapManeger.show();
                    break;
                case 3:
                    doChoiTreEmmanager.show();
                    break;
                case 4:
                    return;
            }
        }
    }

    private void menuThemDonHang() {
        hoaDonManeger.add();
    }

    private void menuThemSanPham() {
        int index;
        while (true) {
            System.out.println("----------------------------");
            System.out.println("-------Thêm sản phẩm---------");
            System.out.println("----------------------------");
            System.out.println("1. Thêm các sản phẩm Sách");
            System.out.println("2. Thêm các sản phẩm Đồ dùng học tập");
            System.out.println("3. Thêm các sản phẩm Đồ chơi trẻ em");
            System.out.println("4. Thoat");

            index = scanner.nextInt();
            switch (index) {
                case 1:
                    System.out.println("-------Them sach---------");
                    try {
                        sachmanager.add();
                        System.out.println("Them thanh cong!");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("-------Them do dung hoc tap---------");
                    try {
                        dungCuHocTapManeger.add();
                        System.out.println("Them thanh cong!");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.println("-------Them san pham do choi tre em---------");
                    try {
                        doChoiTreEmmanager.add();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}
