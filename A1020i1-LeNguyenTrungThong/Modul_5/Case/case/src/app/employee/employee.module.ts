import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListEmployeeComponent } from './list-employee/list-employee.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {BrowserModule} from "@angular/platform-browser";



@NgModule({
  declarations: [
    ListEmployeeComponent,
    CreateEmployeeComponent
  ],
  exports: [
    ListEmployeeComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserModule,
    ReactiveFormsModule,
    FormsModule
  ]
})
export class EmployeeModule { }
