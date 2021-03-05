package CRUD;

import org.omg.PortableInterceptor.HOLDING;
import task_1.DoChoiTreEm;
import task_1.HoaDon;
import task_1.SanPhamSach;

import java.text.SimpleDateFormat;
import java.util.*;

public class HoaDonManeger {
    public static Scanner scanner = new Scanner(System.in);
    private List<HoaDon> hoaDonList;
    private HoaDonDAO hoaDonDAO;
    public HoaDonManeger(){
        hoaDonDAO = new HoaDonDAO();
        hoaDonList = hoaDonDAO.read();
    }
    public void add(){
        String MaHD =inputMaHD();
        String MaKh=inputMaKH();
        String MaSp = inputMaSP();
        Integer SoLuong = inputSoLuong();
        Date NgayMua = inputNgayMua();
        Integer DonGia = inputDonGia();
        Integer TongTien = SoLuong*DonGia;
        HoaDon hoadon = new HoaDon(MaHD,MaKh,MaSp,SoLuong,NgayMua,DonGia,TongTien);
        hoaDonList.add(hoadon);
        hoaDonDAO.wirte(hoaDonList);

    }
    private String inputMaHD() {
        System.out.print("Input MAHD: ");
        return scanner.nextLine();
    }
    private String inputMaKH() {
        System.out.print("Input MaKH: ");
        return scanner.nextLine();
    }
    private String inputMaSP() {
        System.out.print("Input MaSP: ");
        return scanner.nextLine();
    }
    private int inputSoLuong() {
        System.out.print("Input So Luong: ");
         return Integer.parseInt((scanner.nextLine()));

    }
    private Date inputNgayMua() {
        System.out.print("Input Ngay Xuat Ban: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        try {
            date = formatter.parse(scanner.nextLine());
        } catch (Exception e){}
        return date;
    }
    private int inputDonGia( ) {
        System.out.print("Input Don Gia: ");
         return  Integer.parseInt((scanner.nextLine()));
    }
    public void show() {
//        System.out.println("MaSP   "+"TenSP   "+"SoLuong   "+"DonGia   "+"TenDM   "+"NhaXuatBan   "+"NamXB   "+"TacGia  "+"NgaySX   "+"LanTaiBan   ");

        for (HoaDon hoaDon : hoaDonList) {
            System.out.format("%s |", hoaDon.getMaHD());
            System.out.format("%5s |", hoaDon.getMaKH());
            System.out.format("%5s |", hoaDon.getMaSP());
            System.out.format("%5d |", hoaDon.getSoLuong());
            System.out.format("%5s |", hoaDon.getNgayMua());
            System.out.format("%5d |", hoaDon.getDonGia());
            System.out.format("%5d \n", hoaDon.getTongTien());
        }
    }
    public HoaDon TimKiem(String MaHD) {
        Iterator<HoaDon> iterator = getHoaDonList().iterator();
        HoaDon hoaDon;
        while (iterator.hasNext()){
            hoaDon = iterator.next();
            if (hoaDon.getMaHD() == MaHD){
                return hoaDon;
            }
        }
        return null;
    }

    public List<HoaDon> getHoaDonList(){
        return hoaDonList;
    }
    public void setHoaDonList(List<HoaDon> SachList){
        this.hoaDonList = hoaDonList;
    }


}
