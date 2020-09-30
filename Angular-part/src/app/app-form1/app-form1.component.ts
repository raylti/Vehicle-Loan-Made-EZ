import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../loan.model';

@Component({
  selector: 'app-app-form1',
  templateUrl: './app-form1.component.html',
  styleUrls: ['./app-form1.component.css']
})
export class AppForm1Component implements OnInit {
  user = new User;

  constructor(private router: Router) { }

  ngOnInit() {
  }

  save1() {
    this.router.navigate(['appForm2']);
  }
}
