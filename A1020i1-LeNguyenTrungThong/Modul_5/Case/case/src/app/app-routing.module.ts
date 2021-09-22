import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CreateEmployeeComponent} from "./employee/create-employee/create-employee.component";
import {ListEmployeeComponent} from "./employee/list-employee/list-employee.component";
import {EmployeeDetailsComponent} from "./employee-details/employee-details.component";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {FormsModule} from "@angular/forms";
import {NgxPaginateModule} from "ngx-paginate";
import {MatDialog, MatDialogModule} from "@angular/material/dialog";
import {MaterialModule} from "./material.module";
import {EditEmployeeComponent} from "./employee/edit-employee/edit-employee.component";

const routes: Routes = [
  {path:'employee', component: ListEmployeeComponent},
  {path:'employee/create', component: CreateEmployeeComponent},
  {path:'employee/details/:id', component: EmployeeDetailsComponent},
  {path:'employee-edit/:id', component:EditEmployeeComponent},

  {path:'**', component:ListEmployeeComponent}
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes),
    Ng2SearchPipeModule,
    FormsModule,
    NgxPaginateModule,
    MatDialogModule,
    MaterialModule
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
