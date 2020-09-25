import { Component, OnInit } from '@angular/core';
import { Identity } from '../loan.model';

@Component({
  selector: 'app-app-form5',
  templateUrl: './app-form5.component.html',
  styleUrls: ['./app-form5.component.css']
})
export class AppForm5Component implements OnInit {
  identity = new Identity;

  constructor() { }

  ngOnInit() {
  }
  selectedFile:null;

  onFileSelected(event){
    console.log(event);
    this.selectedFile=event.target.files[0];

  }

}
