import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Vehicle } from '../loan.model';

@Component({
  selector: 'app-app-form3',
  templateUrl: './app-form3.component.html',
  styleUrls: ['./app-form3.component.css']
})
export class AppForm3Component implements OnInit {
  vehicle = new Vehicle;

  constructor(private router : Router) { }

  ngOnInit() {
  }

  save3() {
    this.router.navigate(['appForm4']);
  }
}
