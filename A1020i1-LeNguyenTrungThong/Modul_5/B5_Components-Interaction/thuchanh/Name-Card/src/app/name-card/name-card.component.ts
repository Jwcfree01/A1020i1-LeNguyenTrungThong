import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-name-card',
  templateUrl: './name-card.component.html',
  styleUrls: ['./name-card.component.css']
})
export class NameCardComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  @Input() cardName: string | undefined;
  @Input() email: string | undefined;
  @Input() phone: string | undefined;

}
