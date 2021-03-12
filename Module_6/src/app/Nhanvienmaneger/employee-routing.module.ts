import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {Route, RouterModule, Routes} from '@angular/router';
import {NhanvienComponent} from './ListNhanVien/nhanvien.component';
import {Nhanvien} from './Nhanvien';
import {BrowserModule} from '@angular/platform-browser';
import {EditnhanvienComponent} from './editnhanvien/editnhanvien.component';
import {AddnhanvienComponent} from './addnhanvien/addnhanvien.component';


const routes: Routes = [
  {path: 'employee-list' , component: NhanvienComponent},
  {path: 'employee-edit' , component: EditnhanvienComponent},
  {path: 'employee-add' , component: AddnhanvienComponent},

]
@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})

export class EmployeeRoutingModule { }
