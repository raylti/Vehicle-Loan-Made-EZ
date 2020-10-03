import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employment } from '../loan.model';
import { VehicleLoanService } from '../services/vehicle-loan.service';


@Component({
  selector: 'app-app-form2',
  templateUrl: './app-form2.component.html',
  styleUrls: ['./app-form2.component.css']
})
export class AppForm2Component implements OnInit {
  employ = new Employment;

  constructor(private router: Router,private service : VehicleLoanService) { }

  ngOnInit() {
  }

  save() {
    this.service.saveEmployment(this.employ);
    this.router.navigate(['appForm3']);
  }
}




