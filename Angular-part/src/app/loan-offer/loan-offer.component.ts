import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-loan-offer',
  templateUrl: './loan-offer.component.html',
  styleUrls: ['./loan-offer.component.css']
})
export class LoanOfferComponent implements OnInit {
  loanAmount : number;
  interestRate : number = 8.5;
  time : any;
  emi : number;
  constructor() { }

  ngOnInit() {
  }

  calculateEMI() {
    this.emi = this.loanAmount * this.interestRate * this.time;

  }
}
