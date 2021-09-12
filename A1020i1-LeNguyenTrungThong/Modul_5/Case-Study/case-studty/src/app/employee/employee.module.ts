import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmployeeListComponent} from './employee-list/employee-list.component';
import {AppModule} from "../app.module";
import {ReactiveFormsModule} from "@angular/forms";
import {EmployeeCreateComponent} from "./employee-create/employee-create.component";
import {BrowserModule} from "@angular/platform-browser";



@NgModule({
  declarations: [
    EmployeeListComponent,
    EmployeeCreateComponent
  ],
  exports: [
    EmployeeListComponent,
    EmployeeCreateComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    AppModule,
    BrowserModule
  ]
})
export class EmployeeModule { }
