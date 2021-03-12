import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {DonhanglistComponent} from '../donhangmanager/donhanglist/donhanglist.component';
import {HomePageComponent} from './home-page.component';


const routes: Routes = [
  {path: '' , component: HomePageComponent},
  {path: 'home' , component: HomePageComponent},
]
@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class HomeRoutingModule { }
