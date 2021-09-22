import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {ReactiveFormsModule} from "@angular/forms";
import {EmployeeModule} from "./employee/employee.module";
import {MenuTopComponent} from "./menu-top/menu-top.component";
import {MenuLeftComponent} from "./menu-left/menu-left.component";
import {HttpClientModule} from "@angular/common/http";
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { DialogMaterialComponent } from './dialog-material/dialog-material.component';
import { MatDialogModule} from "@angular/material/dialog";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    MenuTopComponent,
    MenuLeftComponent,
    EmployeeDetailsComponent,
    DialogMaterialComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    EmployeeModule,
    HttpClientModule,
    MatDialogModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
