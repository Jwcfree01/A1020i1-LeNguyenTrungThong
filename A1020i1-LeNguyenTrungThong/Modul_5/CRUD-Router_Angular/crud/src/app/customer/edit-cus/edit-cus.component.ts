import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {CusServiceService} from "../../cus-service.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-edit-cus',
  templateUrl: './edit-cus.component.html',
  styleUrls: ['./edit-cus.component.css']
})
export class EditCusComponent implements OnInit {
  public editCustomer!: FormGroup;
  idCus!:number;
  constructor(private service: CusServiceService, public activaterouter:ActivatedRoute, private router:Router) { }

  ngOnInit(): void {
    this.activaterouter.params.subscribe(data =>{
      this.idCus = data.id;
      this.service.finById(this.idCus).subscribe(data =>{
      this.editCustomer.patchValue(data);
      })
    });

    this.editCustomer = new FormGroup({
    name: new FormControl(''),
    birthday: new FormControl(''),
    address: new FormControl('')
    })
  }

  EditForm() {
    this.service.update(this.idCus, this.editCustomer.value).subscribe(data =>{
      this.router.navigateByUrl("");
    })
  }
}
