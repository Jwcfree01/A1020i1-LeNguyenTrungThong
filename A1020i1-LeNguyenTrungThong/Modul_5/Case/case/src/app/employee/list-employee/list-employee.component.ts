import {Component, OnInit} from '@angular/core';
import {IEmployee} from "../../IEmployee";
import {EmployeeService} from "../../employeeService";
import {DialogMaterialComponent} from "../../dialog-material/dialog-material.component";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {

  employee1: IEmployee[] = [];

  constructor(private employeeService: EmployeeService, public dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.employeeService.getAllEmployee().subscribe(
      (data) => {
        this.employee1 = data;
      },
      () => {
        console.log("error")
      },
      () => {
        console.log("complete")
      }
    );
  }

  openDialog(empId: number): void {
    this.employeeService.findByIdEmployee(empId).subscribe(data =>{
      const dialogRef = this.dialog.open(DialogMaterialComponent, {
        width: '500px',
        data: {data1: data}
      });

      dialogRef.afterClosed().subscribe(() => {
        console.log('The dialog was closed');
        this.ngOnInit()
      });
    })

  }

  details(id: number) {
    this.employeeService.findByIdEmployee(id).subscribe();
  }

}

