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

  constructor(private service : VehicleLoanService) { }

  ngOnInit() {
    this.uname = localStorage.getItem("uname");
    this.user = JSON.parse(localStorage.getItem("user"));
    this.service.fetchLoanByUserId(this.user.userId).subscribe(data => this.loan = data);
  }
}
