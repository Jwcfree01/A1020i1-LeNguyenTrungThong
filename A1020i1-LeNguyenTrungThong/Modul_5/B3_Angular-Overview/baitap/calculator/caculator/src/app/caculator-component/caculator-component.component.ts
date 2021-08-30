import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-caculator-component',
  templateUrl: './caculator-component.component.html',
  styleUrls: ['./caculator-component.component.css']
})
export class CaculatorComponentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  a:number =10;

  first: number = 0;
  second: number = 0;
  operator: string = "+";

  onFirstChange(value : number){
    this.first = value;
  }
  onSecondChange(value : number){
    this.second = value;
  }
  onSelectChange(value :string){
    this.operator = value;
  }
  output: number = 0;
  calculate(){
    switch (this.operator) {
      case '+':
        this.output = this.first + this.second;
        break;
      case '-':
        this.output = this.first - this.second;
        break;
      case '*':
        this.output = this.first * this.second;
        break;
      case '/':
        this.output = this.first / this.second;
        break;
    }
  }

}
