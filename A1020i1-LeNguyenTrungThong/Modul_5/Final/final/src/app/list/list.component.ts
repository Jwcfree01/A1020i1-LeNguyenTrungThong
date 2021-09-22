import { Component, OnInit } from '@angular/core';
import {ServiceSotietkiemService} from "../service-sotietkiem.service";
import {ISoTietKiem} from "../ISoTietKiem";
import {MatDialog} from "@angular/material/dialog";
import {DialogDeleteComponent} from "../dialog-delete/dialog-delete.component";
import {ServiceCustomerService} from "../service-customer.service";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  so1!:ISoTietKiem[];
  maSo1!:number;
  searchName!: String;
  p: number = 1;

  constructor(private serviceSo: ServiceSotietkiemService, public dialog: MatDialog, private serviceCus: ServiceCustomerService) {
    this.getAll();
  }

  ngOnInit(): void {
  }

  getAll(){
    this.serviceSo.getAll().subscribe((data)=>{
      this.so1 = data;
    })
  }

  // getAllMaSo(){
  //   this.serviceSo.get
  // }

  delete(cusId: number): void {
    this.serviceSo.finById(cusId).subscribe(data =>{
      const dialogRef = this.dialog.open(DialogDeleteComponent, {
        width: '500px',
        data: {data1: data}
      });

      dialogRef.afterClosed().subscribe(() => {
        console.log('The dialog was closed');
        this.getAll();
      });
    })
  }

  search() {
    // if (this.searchName == ""){
    //   this.ngOnInit();
    // }else {
    //   this.so1=this.so1.filter(data =>{
    //     return data.customer.name.toLocaleLowerCase().match(this.searchName.toLocaleLowerCase());
    //   })
    // }

    this.serviceSo.search(this.searchName).subscribe(data =>{
      this.so1 = data;
    });
  }

  searchSelect() {
    this.serviceSo.searchSelect(this.maSo1).subscribe(data =>{
      console.log(this.maSo1 + 'b');
      this.so1 = data;
    });
  }
}
