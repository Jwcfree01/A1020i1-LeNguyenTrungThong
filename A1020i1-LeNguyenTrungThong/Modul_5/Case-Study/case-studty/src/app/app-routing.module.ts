import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {EmployeeListComponent} from "./employee/employee-list/employee-list.component";
import {AppComponent} from "./app.component";
import {EmployeeCreateComponent} from "./employee/employee-create/employee-create.component";

const routers: Routes = [
  // {path:'', component:AppComponent},
  {path:'employee', component: EmployeeListComponent},
  {path:'employee/create', component: EmployeeCreateComponent},
  {path:'employee/delete/:id', component: EmployeeCreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routers)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
// sao k lấy luôn thằng employee create của t test cho nhanh á, nó vẫn hoạt động bt mà
