package CRUD;

import task_1.DoChoiTreEm;

import java.util.List;
import java.util.Scanner;

public class DoChoiTreEmmanager {
    public static Scanner scanner = new Scanner(System.in);
    private List<DoChoiTreEm> doChoiTreEmList;
    private DoChoiTreEmDAO doChoiTreEmDAO;

    public DoChoiTreEmmanager() {
        doChoiTreEmDAO = new DoChoiTreEmDAO();
        doChoiTreEmList = doChoiTreEmDAO.read();
    }
    public void add(){
        String MaSp =inputMaSP();
        String TenSp=inputTenSP();
        Integer SoLuong = inputSoLuong();
        Integer DonGia = inputDonGia();
        String DanhMuc = inputDanhMuc();
        String XuatXu = inputXuatXu();
        String ThuongHieu = inputThuongHieu();
        String NhaCC = inputNhaCC();
        String HDSD = inputHuongDSD();
        DoChoiTreEm doChoiTreEm = new DoChoiTreEm(MaSp,TenSp,SoLuong,DonGia,DanhMuc,XuatXu,ThuongHieu,NhaCC,HDSD);
        doChoiTreEmList.add(doChoiTreEm);
        doChoiTreEmDAO.wirte(doChoiTreEmList);

    }
    private String inputMaSP() {
        System.out.print("Input MASP: ");
        return scanner.nextLine();
    }
    private String inputTenSP() {
        System.out.print("Input TenSP: ");
        return scanner.nextLine();
    }
    private int inputSoLuong() {
        System.out.print("Input So Luong: ");
        return Integer.parseInt((scanner.nextLine()));
    }
    private int inputDonGia() {
        System.out.print("Input Don Gia: ");
        return  Integer.parseInt((scanner.nextLine()));
    }
    private String inputDanhMuc() {
        System.out.print("Input Danh Muc: ");
        return scanner.nextLine();
    }
    private String inputXuatXu() {
        System.out.print("Input Xuat Xu: ");
        return scanner.nextLine();
    }
    private String inputThuongHieu() {
        System.out.print("Input Thuong Hieu: ");
        return scanner.nextLine();
    }
    private String inputNhaCC() {
        System.out.print("Input Nha Cung Cap: ");
        return scanner.nextLine();
    }
    private String inputHuongDSD() {
        System.out.print("Input Huong Dan Su Dung: ");
        return scanner.nextLine();
    }
    public List<DoChoiTreEm> getDoChoiTreEmList(){
        return doChoiTreEmList;
    }
    public void setDoChoiTreEmList(List<DoChoiTreEm> SachList){
        this.doChoiTreEmList = doChoiTreEmList;
    }
    public void show() {
        for (DoChoiTreEm doChoiTreEm : doChoiTreEmList) {
            System.out.format("%s |", doChoiTreEm.getMaSanPham());
            System.out.format("%5s |", doChoiTreEm.getTenSanPham());
            System.out.format("%5d |", doChoiTreEm.getSoluong());
            System.out.format("%5d |", doChoiTreEm.getDongia());
            System.out.format("%5s |", doChoiTreEm.getTenDM());
            System.out.format("%5s |", doChoiTreEm.getXuatXu());
            System.out.format("%5s |", doChoiTreEm.getThuongHieu());
            System.out.format("%5s |", doChoiTreEm.getNhaCC());
            System.out.format("%5s \n", doChoiTreEm.getHuongDanSD());

        }
    }

}
