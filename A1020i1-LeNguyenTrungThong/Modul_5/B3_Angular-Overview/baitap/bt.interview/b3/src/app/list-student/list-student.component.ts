import {Component, OnInit} from '@angular/core';
import {studentIn} from "../IStudent";
import {studentDao} from "../studentDao";

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {

  constructor() {
  }

  ngOnInit(): void {
  }

  students: studentIn[] = studentDao;

}
