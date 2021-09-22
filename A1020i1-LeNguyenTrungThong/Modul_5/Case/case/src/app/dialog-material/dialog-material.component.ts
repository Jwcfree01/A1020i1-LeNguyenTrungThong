import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {EmployeeService} from "../employeeService";

@Component({
  selector: 'app-dialog-material',
  templateUrl: './dialog-material.component.html',
  styleUrls: ['./dialog-material.component.css']
})
export class DialogMaterialComponent implements OnInit {

  public nameEmpDialog!: String;
  public idEmployee!:number
  constructor(
    public dialogRef: MatDialogRef<DialogMaterialComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any, public service: EmployeeService) {}


  ngOnInit(): void {
    this.nameEmpDialog = this.data.data1.name;
    this.idEmployee = this.data.data1.id;
  }

  deleteEmployee() {
    this.service.deleteEmployee(this.idEmployee).subscribe(data =>{
      this.dialogRef.close();
    })
  }
}
