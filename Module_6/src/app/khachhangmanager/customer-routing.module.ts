import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {NhanvienComponent} from '../Nhanvienmaneger/ListNhanVien/nhanvien.component';
import {EditnhanvienComponent} from '../Nhanvienmaneger/editnhanvien/editnhanvien.component';
import {AddnhanvienComponent} from '../Nhanvienmaneger/addnhanvien/addnhanvien.component';
import {KhachhanglistComponent} from './khachhanglist/khachhanglist.component';
import {KhachhangeditComponent} from './khachhangedit/khachhangedit.component';
import {KhachhangaddComponent} from './khachhangadd/khachhangadd.component';


const routes: Routes = [
  {path: 'customer-list' , component: KhachhanglistComponent},
  {path: 'customer-edit' , component: KhachhangeditComponent},
  {path: 'customer-add' , component: KhachhangaddComponent},
]
@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class CustomerRoutingModule { }
