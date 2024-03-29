import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {ListComponent} from "./list/list.component";
import {EditComponent} from "./edit/edit.component";

const routes: Routes = [
  {path:'', component: ListComponent},
  {path: 'list', component: ListComponent},
  {path:'edit/:id', component:EditComponent},
  {path:'**', component: HomeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
