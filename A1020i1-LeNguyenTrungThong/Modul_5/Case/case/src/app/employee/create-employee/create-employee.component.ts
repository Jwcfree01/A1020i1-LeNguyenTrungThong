import { Component, OnInit } from '@angular/core';
import {EmployeeService} from "../../employeeService";
import {Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {

  constructor(private employeeService: EmployeeService, private router : Router) { }

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
    this.employeeService.createEmployee(this.createEmployee.value).subscribe()
    alert("add employee " + this.name?.value + " success")
    let ref = document.getElementById("cancel");
    ref?.click();
    this.employeeService.getAllEmployee();
  }

  employee(){
    return this.createEmployee.controls;
  }

}

