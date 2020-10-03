import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { Identity } from '../loan.model';
import { VehicleLoanService } from '../services/vehicle-loan.service';

@Component({
  selector: 'app-app-form5',
  templateUrl: './app-form5.component.html',
  styleUrls: ['./app-form5.component.css']
})
export class AppForm5Component implements OnInit {
  identity = new Identity;

  constructor(private router : Router, private service : VehicleLoanService) { }

  ngOnInit() {
  }

  selectedFile: null;

  onFileSelected(event) {
    console.log(event);
    this.selectedFile = event.target.files[0];
  }

  onUpload() {
    this.service.saveIdentity(this.identity);
    this.router.navigate(['user']);
  }

}
