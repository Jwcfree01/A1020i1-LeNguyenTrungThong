import { Component, OnInit } from '@angular/core';
import {ServiceSotietkiemService} from "../service-sotietkiem.service";
import {ActivatedRoute, Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  idSo!:number;
  public editSo!: FormGroup;

  constructor(private serviceSo: ServiceSotietkiemService, public activatedRoute: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.params.subscribe(data =>{
      this.idSo = data.id;
      this.serviceSo.finById(this.idSo).subscribe(data =>{
        this.editSo.patchValue(data);
      })
    });

    this.editSo = new FormGroup({
      id: new FormControl({ value: '', disabled : true }),
      ngayMoSo: new FormControl('', [Validators.required]),
      thoiGianBatDau: new FormControl('', [Validators.required]),
      kyHan: new FormControl('', [Validators.required]),
      soTienGoi: new FormControl('', [Validators.min(10000000), Validators.required]),
      laiSuat: new FormControl('', [Validators.required]),
      uuDai: new FormControl('', [Validators.required]),
      customer: new FormControl('', [Validators.required])
    })
  }

  EditForm() {
    this.serviceSo.update(this.idSo, this.editSo.value).subscribe(data =>{
      this.router.navigateByUrl("");
    })
  }
}
