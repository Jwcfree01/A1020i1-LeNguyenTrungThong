import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CreateEmployeeComponent} from "./employee/create-employee/create-employee.component";
import {ListEmployeeComponent} from "./employee/list-employee/list-employee.component";
import {EmployeeDetailsComponent} from "./employee-details/employee-details.component";

const routes: Routes = [
  {path:'employee', component: ListEmployeeComponent},
  {path:'employee/create', component: CreateEmployeeComponent},
  {path:'employee/details/:id', component: EmployeeDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
