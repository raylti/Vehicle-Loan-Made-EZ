import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Loan } from '../loan.model';
import { VehicleLoanService } from '../services/vehicle-loan.service';

@Component({
  selector: 'app-app-form4',
  templateUrl: './app-form4.component.html',
  styleUrls: ['./app-form4.component.css']
})
export class AppForm4Component implements OnInit {
  loan = new Loan;

  constructor(private router : Router, private service : VehicleLoanService) { }

  ngOnInit() {
  }

  save() {
    this.loan.interestRate = 8.5;
    this.loan.loanStatus = "Pending";
    this.service.saveLoan(this.loan);
    this.router.navigate(['appForm5']);
  }
}
