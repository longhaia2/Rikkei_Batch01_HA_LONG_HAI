import { Component, OnInit } from '@angular/core';
import {Khachhang} from '../../khachhangmanager/khachhang';
import {Donhang} from '../Donhang';

@Component({
  selector: 'app-donhanglist',
  templateUrl: './donhanglist.component.html',
  styleUrls: ['./donhanglist.component.css']
})
export class DonhanglistComponent implements OnInit {
  donhang: Donhang[] = [
    {MaDonHang: 1, MaKhachHang: 'Kh01', MaNhanVien: 'NV02', NgayMuaHang: '21/11/2020', TongTien: 1000000},
    {MaDonHang: 2, MaKhachHang: 'Kh02', MaNhanVien: 'NV02', NgayMuaHang: '21/11/2020', TongTien: 2000000},
    {MaDonHang: 3, MaKhachHang: 'Kh03', MaNhanVien: 'NV03', NgayMuaHang: '21/11/2020', TongTien: 3000000},
    {MaDonHang: 4, MaKhachHang: 'Kh04', MaNhanVien: 'NV04', NgayMuaHang: '21/11/2020', TongTien: 4000000},
    {MaDonHang: 5, MaKhachHang: 'Kh05', MaNhanVien: 'NV02', NgayMuaHang: '21/11/2020', TongTien: 5000000}
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
