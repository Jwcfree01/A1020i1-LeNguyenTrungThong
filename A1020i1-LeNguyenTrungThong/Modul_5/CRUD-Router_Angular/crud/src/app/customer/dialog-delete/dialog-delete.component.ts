import {Component, Inject, OnInit} from '@angular/core';
import {CusServiceService} from "../../cus-service.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-dialog-delete',
  templateUrl: './dialog-delete.component.html',
  styleUrls: ['./dialog-delete.component.css']
})
export class DialogDeleteComponent implements OnInit {
  nameCus!: String;
  idCus!: number;

  constructor(private service:CusServiceService, public dialogRef: MatDialogRef<DialogDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    this.idCus = this.data.data1.id;
    this.nameCus = this.data.data1.name;
  }

  deleteEmployee() {
    this.service.delete(this.idCus).subscribe(data =>{
      this.dialogRef.close();
    })
  }
}
