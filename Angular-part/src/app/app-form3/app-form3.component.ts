import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Vehicle } from '../loan.model';
import { VehicleLoanService } from '../services/vehicle-loan.service';

@Component({
  selector: 'app-app-form3',
  templateUrl: './app-form3.component.html',
  styleUrls: ['./app-form3.component.css']
})
export class AppForm3Component implements OnInit {
  vehicle = new Vehicle;

  constructor(private router: Router,private service : VehicleLoanService) { }

  ngOnInit() {
  }

  save() {
    this.service.saveVehicle(this.vehicle);
    this.router.navigate(['appForm4']);
  }

  vehicleList: Array<any> = [
    { name: 'Hero MotoCorp Ltd', model: ['Hero Splendor Plus','Hero HF Deluxe'] },
    { name: 'Maruti Suzuki', model: ['Maruti Swift','Maruti Baleno'] },
    { name: 'Tata Motors', model: ['Tata Nexon','Tata Altroz'] },
    { name: 'Yamaha', model: ['Yamaha MT 15','Yamaha YZF R15 V3'] },
  ];
  
  model: Array<any>;

  changeModel(count) {
    this.model = this.vehicleList.find(con => con.name == count).model;
  }
}
