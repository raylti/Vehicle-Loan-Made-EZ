import { VehicleLoanService } from './../services/vehicle-loan.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../loan.model';

@Component({
  selector: 'app-app-form1',
  templateUrl: './app-form1.component.html',
  styleUrls: ['./app-form1.component.css']
})
export class AppForm1Component implements OnInit {
  user = new User;
  stateList: Array<any> = [
    { name: 'Assam', cities: ['-- Select your city --','Dispur','Tezpur','Silchar'] },
    { name: 'Bihar', cities: ['-- Select your city --','Gaya','Patna'] },
    { name: 'Karnataka', cities: ['-- Select your city --','Bangalore','Mysore'] },
    { name: 'Maharashtra', cities: ['-- Select your city --','Mumbai','Thane'] },
    { name: 'Telangana', cities: ['-- Select your city --','Hyderabad','Warangal'] },
    { name: 'WestBengal', cities: ['-- Select your city --','Kolkata','Durgapur'] },
    { name: 'Tamil Nadu', cities: ['-- Select your city --','Chennai','Vellore'] },
  ];
  
  cities: Array<any>;

  changeState(count) {
    this.cities = this.stateList.find(con => con.name == count).cities;
  }

  constructor(private router: Router, private service : VehicleLoanService) { }

  ngOnInit() {
  }

  saveUser() {
    this.service.saveUser(this.user);
    this.user = new User();
    this.router.navigate(['appForm2']);
  }
}
