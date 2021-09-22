import {Component, Inject, OnInit} from '@angular/core';
import {ServiceSotietkiemService} from "../service-sotietkiem.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-dialog-delete',
  templateUrl: './dialog-delete.component.html',
  styleUrls: ['./dialog-delete.component.css']
})
export class DialogDeleteComponent implements OnInit {

  nameCus!: String;
  idSo!: number;

  constructor(private serviceSo : ServiceSotietkiemService, public dialogRef: MatDialogRef<DialogDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
    this.idSo = this.data.data1.id;
    this.nameCus = this.data.data1.customer.name;
  }

  delete() {
    this.serviceSo.delete(this.idSo).subscribe(data =>{
      this.dialogRef.close();
    })
  }
}
