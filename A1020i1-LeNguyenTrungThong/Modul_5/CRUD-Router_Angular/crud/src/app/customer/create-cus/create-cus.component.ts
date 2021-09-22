import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, ValidationErrors, ValidatorFn, Validators} from "@angular/forms";
import {CusServiceService} from "../../cus-service.service";
import {Router} from "@angular/router";
import validate = WebAssembly.validate;

@Component({
  selector: 'app-create-cus',
  templateUrl: './create-cus.component.html',
  styleUrls: ['./create-cus.component.css']
})
export class CreateCusComponent implements OnInit {
  public createCus!: FormGroup;
  @Output() checkSubmit: EventEmitter<boolean> = new EventEmitter<boolean>();

  constructor(private service:CusServiceService,
              private router:Router) { }

  ngOnInit(): void {
    this.createCus = new FormGroup({
      name: new FormControl('', [Validators.required]),
      birthday: new FormControl(''),
      address: new FormControl('', [Validators.pattern("(?:^|\\s)[\\w!#$%&'*+/=?^`{|}~-](\\.?[\\w!#$%&'*+/=?^`{|}~-]+)*@\\w+[.-]?\\w*\\.[a-zA-Z]{2,3}\\b")])
    },{validators: [this.checkAge('birthday')]})
  }

  CreateForm() {
    this.service.createCus(this.createCus.value).subscribe(() =>{
      this.checkSubmit.emit(true);
    });
  }

  checkAge(name:string):ValidatorFn{
    return (control:AbstractControl): ValidationErrors=>{
      let check = new Date(control.get(name)?.value).getTime();
      let age = (Date.now() - check) / 31536000000;
      console.log(age);
      if (age<18){
        return {'error': true};
      //  ảo vãi ê 1 mình t mò chắc cũng tuần nữa :)
      }
      //@ts-ignore
      return null;
    }
  }

  // get birthDay(){
  //   return this.createCus.get('birthday');
  // }


}
