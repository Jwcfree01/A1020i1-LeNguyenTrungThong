import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {ListCusComponent} from "./list-cus/list-cus.component";
import {EditCusComponent} from "./edit-cus/edit-cus.component";
import {CreateCusComponent} from "./create-cus/create-cus.component";
import {RouterModule} from "@angular/router";
import {HttpClientModule} from "@angular/common/http";
import {BrowserModule} from "@angular/platform-browser";
import {AppRoutingModule} from "../app-routing.module";
import {MatDialogModule} from "@angular/material/dialog";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {MatButtonModule} from "@angular/material/button";
import {MatCardModule} from "@angular/material/card";
import {Ng2OrderModule} from "ng2-order-pipe";
import {NgxPaginationModule} from "ngx-pagination";

@NgModule({
  declarations: [
    ListCusComponent,
    EditCusComponent,
    CreateCusComponent
  ],exports:[
    ListCusComponent,
    EditCusComponent,
    CreateCusComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    RouterModule,
    HttpClientModule,
    BrowserModule,
    FormsModule,
    AppRoutingModule,

    MatDialogModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    Ng2OrderModule,
    NgxPaginationModule
  ]
})
export class CustomerModule { }
