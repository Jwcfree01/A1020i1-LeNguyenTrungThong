import { Component, OnInit, DoCheck } from '@angular/core';
import {ICustomer} from "../../Interface/ICustomer";
import {CusServiceService} from "../../cus-service.service";
import {MatDialog} from "@angular/material/dialog";
import {DialogDeleteComponent} from "../dialog-delete/dialog-delete.component";

@Component({
  selector: 'app-list-cus',
  templateUrl: './list-cus.component.html',
  styleUrls: ['./list-cus.component.css']
})
export class ListCusComponent implements OnInit,DoCheck{
  cus1!:ICustomer[];
  searchName!:String;

  constructor(private service:CusServiceService, public dialog: MatDialog) {
    this.getAll();
  }

  ngDoCheck(): void {
    // this.getAll();
  }

  ngOnInit(): void {
  }

  abc:boolean = false;

  getCheckSubmit(check:boolean){
    if (check == true){
      this.getAll();
      this.abc=true;
      setTimeout(() => {
        this.abc = false;
      },5000)
    }
  }

  getAll(){
    this.service.getAll().subscribe((data)=>{
      console.log(2)
      this.cus1 = data;
    })
  }

  delete(cusId: number): void {
    this.service.finById(cusId).subscribe(data =>{
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
    //   this.cus1=this.cus1.filter(data =>{
    //     return data.name.toLocaleLowerCase().match(this.searchName.toLocaleLowerCase());
    //   })
    // }

    this.service.search(this.searchName).subscribe(data =>{
      console.log(data);
      this.cus1 = data;
    });
  }

  key:String = 'id'
  reverse:boolean = false;

  sort(key:String) {
    this.key = key;
    this.reverse = !this.reverse;
  }
  p: number =1;

}
