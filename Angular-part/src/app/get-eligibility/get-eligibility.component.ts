import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Eligibility } from '../loan.model';

@Component({
  selector: 'app-get-eligibility',
  templateUrl: './get-eligibility.component.html',
  styleUrls: ['./get-eligibility.component.css']
})
export class GetEligibilityComponent implements OnInit {
  eligible = new Eligibility;

  constructor(private router : Router) { }

  ngOnInit() {
  }

  checkEligibility() {
    this.router.navigate(['loanOffer']);
  }
}
