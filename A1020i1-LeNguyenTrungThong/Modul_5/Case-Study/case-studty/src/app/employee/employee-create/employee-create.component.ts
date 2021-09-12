import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../employeeService";
import {Router} from "@angular/router";

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {

  constructor(private employeeService : EmployeeService, private router : Router) { }

  ngOnInit(): void {
  }

  createEmployee = new FormGroup({
    name: new FormControl('',[Validators.required]),
    position: new FormControl('',[Validators.required]),
    education: new FormControl('',[Validators.required]),
    division: new FormControl(),
    dOB: new FormControl(),
    cmnd: new FormControl(),
    salary: new FormControl(),
    phone: new FormControl(),
    email: new FormControl(),
    address: new FormControl()
  })

  get name() {
    return this.createEmployee.get('name');
  }

  get position() {
    return this.createEmployee.get('position');
  }

  get education() {
    return this.createEmployee.get('education');
  }

  onSubmit(){
    console.log(this.createEmployee.value);
    this.employeeService.createEmployee(this.createEmployee.value).subscribe();
    this.router.navigateByUrl("employee"); // dung de chuyen trang
  }
}
