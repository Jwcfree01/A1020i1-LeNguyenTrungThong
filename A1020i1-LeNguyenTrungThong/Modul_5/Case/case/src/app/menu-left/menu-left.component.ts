import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-menu-left',
  templateUrl: './menu-left.component.html',
  styleUrls: ['./menu-left.component.css']
})
export class MenuLeftComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  // showComponent: number | any;
  //
  // @Output() showComponentChange: EventEmitter<number> = new EventEmitter();
  //
  // ChangeComponent(value: number) {
  //   this.showComponent = value;
  //   this.showComponentChange.emit(this.showComponent);
  // }
}
