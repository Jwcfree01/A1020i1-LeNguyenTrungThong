import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Route} from "@angular/router";
import {EmployeeService} from "../../employeeService";

@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit {

  constructor(public activaterouter:ActivatedRoute, public employeeService:EmployeeService) { }

  empId!:number;

  ngOnInit(): void {
    this.activaterouter.params.subscribe(data =>{
      this.empId = data.id;
      this.employeeService.findByIdEmployee(this.empId).subscribe(data =>{
      this.EditEmployee.patchValue(data);
      })
    })
  }

  EditEmployee = new FormGroup({
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
    return this.EditEmployee.get('name');
  }

  onSubmit() {
    console.log(this.EditEmployee.value)
    this.employeeService.updateEmployee(this.empId, this.EditEmployee.value).subscribe(data =>{
    })
    alert("edit employee " + this.name?.value + " success")
  }
}
