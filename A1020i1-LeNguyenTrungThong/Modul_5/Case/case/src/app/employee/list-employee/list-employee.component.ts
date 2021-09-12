import {Component, OnInit} from '@angular/core';
import {IEmployee} from "../../IEmployee";
import {EmployeeService} from "../../employeeService";

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {

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


  deleteEmployee(id: number) {
    alert(id);
    this.employeeService.deleteEmployee(id).subscribe();
    this.employeeService.getAllEmployee();
  }

  details(id: number) {
    this.employeeService.findByIdEmployee(id).subscribe();
  }

}

