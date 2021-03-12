import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {KhachhanglistComponent} from '../khachhangmanager/khachhanglist/khachhanglist.component';
import {KhachhangeditComponent} from '../khachhangmanager/khachhangedit/khachhangedit.component';
import {KhachhangaddComponent} from '../khachhangmanager/khachhangadd/khachhangadd.component';
import {DonhanglistComponent} from './donhanglist/donhanglist.component';
import {DonhangaddComponent} from './donhangadd/donhangadd.component';
import {DonhangeditComponent} from './donhangedit/donhangedit.component';



const routes: Routes = [
  {path: 'order-list' , component: DonhanglistComponent},
  {path: 'order-add' , component: DonhangaddComponent},
  {path: 'order-edit' , component: DonhangeditComponent},
]
@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class OrderRoutingModule { }
