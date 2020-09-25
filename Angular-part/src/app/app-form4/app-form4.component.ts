import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Loan } from '../loan.model';

@Component({
  selector: 'app-app-form4',
  templateUrl: './app-form4.component.html',
  styleUrls: ['./app-form4.component.css']
})
export class AppForm4Component implements OnInit {
  loan = new Loan;

  constructor(private router : Router) { }

  ngOnInit() {
  }

  save4() {
    this.router.navigate(['appForm5']);
  }
}
