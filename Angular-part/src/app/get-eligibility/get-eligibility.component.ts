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
    if(this.eligible.age <22 || this.eligible.age>65) {
      alert("Sorry you are not eligible for Loan. Age should be between 22-59");
      this.router.navigate(['home']);
    }
    else if (this.eligible.annualIncome<300000) {
      alert("Sorry you are not eligible for Loan. Annual Income should more than ₹ 3 lakhs");
      this.router.navigate(['home']);
    }
    else if (this.eligible.emi > ((this.eligible.annualIncome/12)*0.5)) {
      alert("Sorry you are not eligible for Loan. Your existing EMI is not compliance with our terms and conditions.");
      this.router.navigate(['home']);
    }
    else {
      var ans = confirm("Congratulations you are eligible for a loan of ₹ " + this.eligible.annualIncome/2 + ". Do you want to check our loan offers now!");
      if (ans) 
        this.router.navigate(['loanOffer']);
      else
        this.router.navigate(['home']);
      }
  }

  vehicleList: Array<any> = [
    { name: 'Bike', make: ['-- Select Bike Make --','Hero MotoCorp Ltd','Yamaha'] },
    { name: 'Car', make: ['-- Select Car Make --','Maruti Suzuki','Tata Motors'] },
  ];
  
  make: Array<any>;

  changeMake(count) {
    this.make = this.vehicleList.find(con => con.name == count).make;
  }

  makeList: Array<any> = [
    { name: 'Hero MotoCorp Ltd', model: ['-- Select Bike Model --','Hero Splendor Plus','Hero HF Deluxe'] },
    { name: 'Maruti Suzuki', model: ['-- Select Car Model --','Maruti Swift','Maruti Baleno'] },
    { name: 'Tata Motors', model: ['-- Select Car Model --','Tata Nexon','Tata Altroz'] },
    { name: 'Yamaha', model: ['-- Select Bike Model --','Yamaha MT 15','Yamaha YZF R15 V3'] },
  ];
  
  model: Array<any>;

  changeModel(count) {
    this.model = this.makeList.find(con => con.name == count).model;
  }

  priceList: Array<any> = [
    { name: 'Hero Splendor Plus', exPrice: ['₹ 40,000'], onRoadPrice:['₹ 50,000'] },
    { name: 'Hero Hero HF Deluxe', exPrice: ['₹ 50,000'], onRoadPrice:['₹ 60,000'] },
    { name: 'Maruti Swift', exPrice: ['₹ 6,00,000'], onRoadPrice:['₹ 6,50,000'] },
    { name: 'Maruti Baleno', exPrice: ['₹ 8,00,000'], onRoadPrice:['₹ 9,00,000'] },
    { name: 'Tata Nexon', exPrice: ['₹ 7,00,000'], onRoadPrice:['₹ 7,50,000'] },
    { name: 'Tata Altroz', exPrice: ['₹ 7,50,000'], onRoadPrice:['₹ 8,00,000'] },
    { name: 'Yamaha MT 15', exPrice: ['₹ 80,000'], onRoadPrice:['₹ 1,00,000'] },
    { name: 'Yamaha YZF R15 V3', exPrice: ['₹ 90,000'], onRoadPrice:['₹ 1,00,000'] },
  ];
  
  exPrice: Array<any>;
  onRoadPrice: Array<any>;

  changePrice(count) {
    this.exPrice = this.priceList.find(con => con.name == count).exPrice;
    this.onRoadPrice = this.priceList.find(con => con.name == count).onRoadPrice;
  }
}
