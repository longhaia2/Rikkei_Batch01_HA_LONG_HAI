import { Component, OnInit } from '@angular/core';
import {Nhanvien} from '../Nhanvien';

@Component({
  selector: 'app-nhanvien',
  templateUrl: './nhanvien.component.html',
  styleUrls: ['./nhanvien.component.css']
})
export class NhanvienComponent implements OnInit {
 nhanvien: Nhanvien[] = [
   {MaNhanVien: 'NV01', TenNhanVien: 'Hai', NgaySinh: '21/11/1999', SoDienThoai: 39309656, Email : 'halonghaiqa62@gmail.com', DiaChi: 'Da Nang'},
   {MaNhanVien: 'NV02', TenNhanVien: 'Hien', NgaySinh: '21/12/1999', SoDienThoai: 39309656, Email : 'halonghaiqa62@gmail.com', DiaChi: 'Quang Nam'},
   {MaNhanVien: 'NV03', TenNhanVien: 'Thuan', NgaySinh: '21/11/1999', SoDienThoai: 39309656 , Email : 'halonghaiqa62@gmail.com', DiaChi: 'Da Nang'},
   {MaNhanVien: 'NV04', TenNhanVien: 'Manh', NgaySinh: '21/11/1999', SoDienThoai: 39309656, Email : 'halonghaiqa62@gmail.com', DiaChi: 'Nghe An'}
 ];
  constructor() { }

  ngOnInit(): void {
  }

}
