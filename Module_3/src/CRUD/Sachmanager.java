package CRUD;
import task_1.SanPhamSach;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Sachmanager {
    public static Scanner scanner = new Scanner(System.in);
    private List<SanPhamSach> SachList;
    private SanPhamSachDAO sachDAO;
    public Sachmanager(){
        sachDAO = new SanPhamSachDAO();
        SachList = sachDAO.read();
    }
    public void add(){
        String MaSp =inputMaSP();
        String TenSp=inputTenSP();
        Integer SoLuong = inputSoLuong();
        Integer DonGia = inputDonGia();
        String DanhMuc = inputDanhMuc();
        String NhaSX = inputNhaSX();
        Date NamSX = inputNamSX();
        String TacGia = inputTacGia();
        Date NgaySB = inputNgayXB();
        Integer TaiBan = inputLanTaiBan();
        SanPhamSach sanPhamSach = new SanPhamSach(MaSp,TenSp,SoLuong,DonGia,DanhMuc,NhaSX,NamSX,TacGia,NgaySB,TaiBan);
        SachList.add(sanPhamSach);
        sachDAO.wirte(SachList);

    }
    public void edit(){


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
    private String inputNhaSX() {
        System.out.print("Input Nha San Xuat: ");
        return scanner.nextLine();
    }
    private Date inputNamSX() {
        System.out.print("Input Nam SX: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        try {
            date = formatter.parse(scanner.nextLine());
        } catch (Exception e){}
        return date;
    }
    private String inputTacGia() {
        System.out.print("Input Tac Gia: ");
        return scanner.nextLine();
    }
    private Date inputNgayXB() {
        System.out.print("Input Ngay Xuat Ban: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        try {
            date = formatter.parse(scanner.nextLine());
        } catch (Exception e){}
        return date;
    }
    private int inputLanTaiBan() {
        System.out.print("Input Lan Tai Ban: ");
        return  Integer.parseInt((scanner.nextLine()));
    }
    public void show() {
//        System.out.println("MaSP   "+"TenSP   "+"SoLuong   "+"DonGia   "+"TenDM   "+"NhaXuatBan   "+"NamXB   "+"TacGia  "+"NgaySX   "+"LanTaiBan   ");

        for (SanPhamSach sach : SachList) {
            System.out.format("%s |", sach.getMaSanPham());
            System.out.format("%5s |", sach.getTenSanPham());
            System.out.format("%5d |", sach.getSoluong());
            System.out.format("%5d |", sach.getDongia());
            System.out.format("%5s |", sach.getTenDM());
            System.out.format("%5s |", sach.getNhaXuatBan());
            System.out.format("%15s |", sach.getNamSanXuat());
            System.out.format("%5s |", sach.getTacGia());
            System.out.format("%15s |", sach.getNgaySX());
            System.out.format("%5d\n", sach.getLanTaiBan());
        }
    }
    public List<SanPhamSach> getSachList(){
        return SachList;
    }
    public void setSachList(List<SanPhamSach> SachList){
        this.SachList = SachList;
    }


}
