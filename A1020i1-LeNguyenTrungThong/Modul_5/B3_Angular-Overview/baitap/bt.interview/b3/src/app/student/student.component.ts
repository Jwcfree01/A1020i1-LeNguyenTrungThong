import { Component, OnInit } from '@angular/core';
import {studentIn} from "../IStudent";

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  constructor() { }

  student1 : studentIn = {
    name : "Thông",
    age : 22,
    address : "Đà Nẵng",
    avatar : "https://upload.wikimedia.org/wikipedia/commons/a/a0/Arh-avatar.jpg",
    mark : 0,
  }

  ngOnInit(): void {
  }

  ChangeMark (value : number) {
    this.student1.mark = value;
  }
}
