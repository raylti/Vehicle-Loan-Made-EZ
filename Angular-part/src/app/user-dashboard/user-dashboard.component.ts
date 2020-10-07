import { VehicleLoanService } from './../services/vehicle-loan.service';
import { Loan, User } from './../loan.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css']
})
export class UserDashboardComponent implements OnInit {
  user: User;
  uname: string;
  loan = new Loan;
  emi : number;
  interest : number;
  full : number;

  constructor(private service : VehicleLoanService) { }

  ngOnInit() {
    this.uname = localStorage.getItem("uname");
    this.user = JSON.parse(localStorage.getItem("user"));
    this.service.fetchLoanByUserId(this.user.userId).subscribe(data => this.loan = data);
  }

  result = {
    emi: "",
    interest: "",
    total: "",
    amount: "",
  }

  calculateEMI() {
    var noOfMonth = 12 * this.loan.tenure;
    var monthlyRate = this.loan.interestRate / 100 / 12;
    var top = Math.pow((1 + monthlyRate), noOfMonth);
    var bottom = top - 1;
    var sp = top / bottom;
    this.emi = ((this.loan.loanAmount * monthlyRate) * sp);
    var full = noOfMonth * this.emi;
    this.interest = full - this.loan.loanAmount;

    this.result.emi = this.emi.toFixed(0).toString().replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    var loanAmount_str = this.loan.loanAmount.toString().replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    this.result.total = full.toFixed(0).toString().replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    this.result.interest = this.interest.toFixed(0).toString().replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    this.result.amount = this.loan.loanAmount.toFixed(0).toString().replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");
  }
}
