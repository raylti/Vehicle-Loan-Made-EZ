import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-eligibility',
  templateUrl: './get-eligibility.component.html',
  styleUrls: ['./get-eligibility.component.css']
})
export class GetEligibilityComponent implements OnInit {

  constructor(private router : Router) { }

  ngOnInit() {
  }

  checkEligibility() {
    this.router.navigate(['loanOffer']);
  }
}
