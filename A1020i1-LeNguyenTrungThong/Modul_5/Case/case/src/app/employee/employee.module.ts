import { NgModule } from '@angular/core';
import { ListEmployeeComponent } from './list-employee/list-employee.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {BrowserModule} from "@angular/platform-browser";
import { EditEmployeeComponent } from './edit-employee/edit-employee.component';
import {RouterModule} from "@angular/router";
import {CommonModule} from "@angular/common";
import {MatButtonModule} from "@angular/material/button";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {MatCardModule} from "@angular/material/card";
import {MatDialogModule} from "@angular/material/dialog";

@NgModule({
  declarations: [
    ListEmployeeComponent,
    CreateEmployeeComponent,
    EditEmployeeComponent
  ],
  exports: [
    ListEmployeeComponent,
    CreateEmployeeComponent,
    EditEmployeeComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserModule,
    ReactiveFormsModule,
    FormsModule,

    MatButtonModule,
    BrowserAnimationsModule,
    // MatCardModule,
    MatDialogModule
  ]
})
export class EmployeeModule { }
