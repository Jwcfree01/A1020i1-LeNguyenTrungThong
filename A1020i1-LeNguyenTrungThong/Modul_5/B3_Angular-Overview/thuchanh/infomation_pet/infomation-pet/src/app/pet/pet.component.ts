import { Component, OnInit } from '@angular/core';
import {Pet} from "../pet";

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  pet1: Pet = {
    name: "thong",
    image: "https://kienthucbonphuong.com/images/202006/pet-la-gi/pet-la-gi.jpg"
  }

  ChangeName(value: string){
    this.pet1.name = value;
  }

  ChangeImg(value: string){
    this.pet1.image = value;
  }
}
