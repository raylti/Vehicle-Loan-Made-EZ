import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Loan, User } from '../loan.model';
import { VehicleLoanService } from '../services/vehicle-loan.service';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {
  listPending: Loan[] = [];
  listApproved: Loan[] = [];
  listRejected: Loan[] = [];

  constructor(private service: VehicleLoanService, private router: Router) { }

  ngOnInit() {
    this.service.fetchPending().subscribe(data => this.listPending = data);
    this.service.fetchApproved().subscribe(data => this.listApproved = data);
    this.service.fetchRejected().subscribe(data => this.listRejected = data);
  }

  async approve(id: number, name:string) {
    var ans = confirm("Do you want to Approve the Loan Application for " + name+ " ?");
    if (ans)
      await this.service.approve(id);
  }

  async reject(id: number, name:string) {
    var ans = confirm("Do you want to Reject the Loan Application for " + name+ " ?");
    if (ans)
      await this.service.reject(id);
  }
}
