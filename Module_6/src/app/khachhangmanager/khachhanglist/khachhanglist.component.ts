import { Component, OnInit } from '@angular/core';
import {Nhanvien} from '../../Nhanvienmaneger/Nhanvien';
import {Khachhang} from '../khachhang';

@Component({
  selector: 'app-khachhanglist',
  templateUrl: './khachhanglist.component.html',
  styleUrls: ['./khachhanglist.component.css']
})
export class KhachhanglistComponent implements OnInit {
  khachhang: Khachhang[] = [
    {MaKhachHang: 'KH01', TenKhachHang: 'Hải', Email: 'halonghaiqa62@gmail.com', SoDienThoai: 39309656, NgaySinh: '21/12/1999', MaLoai: 'Vip'},
    {MaKhachHang: 'KH02', TenKhachHang: 'Hiền', Email: 'hien@gmail.com', SoDienThoai: 3930449656, NgaySinh: '20/12/1999', MaLoai: 'Vip'},
    {MaKhachHang: 'KH03', TenKhachHang: 'Mạnh', Email: 'manh@gmail.com', SoDienThoai: 3934409656, NgaySinh: '23/12/1999', MaLoai: 'Vip'},
    {MaKhachHang: 'KH04', TenKhachHang: 'Thuận', Email: 'thuan.com', SoDienThoai: 3930964556, NgaySinh: '21/02/1999', MaLoai: 'Vip'}
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
