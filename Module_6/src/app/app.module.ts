import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NhanvienComponent } from './Nhanvienmaneger/ListNhanVien/nhanvien.component';
import { AddnhanvienComponent } from './Nhanvienmaneger/addnhanvien/addnhanvien.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { EditnhanvienComponent } from './Nhanvienmaneger/editnhanvien/editnhanvien.component';
import { KhachhangmanagerComponent } from './khachhangmanager/khachhangmanager.component';
import { KhachhanglistComponent } from './khachhangmanager/khachhanglist/khachhanglist.component';
import { KhachhangeditComponent } from './khachhangmanager/khachhangedit/khachhangedit.component';
import { KhachhangaddComponent } from './khachhangmanager/khachhangadd/khachhangadd.component';
import { DonhangmanagerComponent } from './donhangmanager/donhangmanager.component';
import { DonhanglistComponent } from './donhangmanager/donhanglist/donhanglist.component';
import {RouterModule} from '@angular/router';
import {EmployeeRoutingModule} from './Nhanvienmaneger/employee-routing.module';
import {CustomerRoutingModule} from './khachhangmanager/customer-routing.module';
import {OrderRoutingModule} from './donhangmanager/order-routing.module';
import { HomePageComponent } from './home-page/home-page.component';
import {HomeRoutingModule} from './home-page/home-routing.module';
import { DonhangeditComponent } from './donhangmanager/donhangedit/donhangedit.component';
import { DonhangaddComponent } from './donhangmanager/donhangadd/donhangadd.component';

@NgModule({
  declarations: [
    AppComponent,
    NhanvienComponent,
    AddnhanvienComponent,
    HeaderComponent,
    FooterComponent,
    EditnhanvienComponent,
    KhachhangmanagerComponent,
    KhachhanglistComponent,
    KhachhangeditComponent,
    KhachhangaddComponent,
    DonhangmanagerComponent,
    DonhanglistComponent,
    HomePageComponent,
    DonhangeditComponent,
    DonhangaddComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule,
    EmployeeRoutingModule,
    CustomerRoutingModule,
    OrderRoutingModule,
    HomeRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
