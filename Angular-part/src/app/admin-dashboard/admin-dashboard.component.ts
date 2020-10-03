import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Loan } from '../loan.model';
import { VehicleLoanService } from '../services/vehicle-loan.service';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {
  list : Loan[] = [];
 
  constructor(private service : VehicleLoanService, private router : Router) { }

  ngOnInit() {
    this.service.fetchPending().subscribe(data => this.list = data);
  }


}
