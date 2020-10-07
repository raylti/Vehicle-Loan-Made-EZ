import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

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
  interest : number;
  full : number;

  constructor(private router : Router) { 
  }

  ngOnInit() {
  }

  result = {
    emi: "",
    interest: "",
    total: ""
  }

  calculateEMI() {
    var noOfMonth = 12 * this.time;
    var monthlyRate = this.interestRate / 100 / 12;
    var top = Math.pow((1 + monthlyRate), noOfMonth);
    var bottom = top - 1;
    var sp = top / bottom;
    this.emi = ((this.loanAmount * monthlyRate) * sp);
    var full = noOfMonth * this.emi;
    this.interest = full - this.loanAmount;

    this.result.emi = this.emi.toFixed(0).toString().replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    var loanAmount_str = this.loanAmount.toString().replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    this.result.total = full.toFixed(0).toString().replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    this.result.interest = this.interest.toFixed(0).toString().replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
  }

  applyLoan() {
    this.router.navigate(['appForm1']);
  }
}
