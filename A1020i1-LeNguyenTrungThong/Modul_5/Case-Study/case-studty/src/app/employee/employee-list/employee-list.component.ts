import {Component, OnInit} from '@angular/core';

import {EmployeeService} from "../../employeeService";
import {IEmployee} from "../../IEmployee";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employee1: IEmployee[] = [];

  constructor(private employeeService: EmployeeService) {

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
}

