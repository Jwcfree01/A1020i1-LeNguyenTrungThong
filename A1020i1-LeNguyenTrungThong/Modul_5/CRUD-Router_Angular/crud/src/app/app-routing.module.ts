import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ListCusComponent} from "./customer/list-cus/list-cus.component";
import {EditCusComponent} from "./customer/edit-cus/edit-cus.component";
import {CreateCusComponent} from "./customer/create-cus/create-cus.component";

const routes: Routes = [
  {path:'', component: ListCusComponent},
  {path:'customer', component:ListCusComponent},
  {path:'customer/edit/:id', component:EditCusComponent},
  {path:'create', component: CreateCusComponent},

  {path:'**', component: ListCusComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
