import { Employment, Identity, Loan, Vehicle } from './../loan.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../loan.model';

@Injectable({
  providedIn: 'root'
})
export class VehicleLoanService {

  private baseUrl: string = "http://localhost:8080/ride-along-spring-rest1/rest";

  constructor(private router: Router, private http: HttpClient) { }

  saveUser(user: User) {
    this.http.post(this.baseUrl + "/add_user_detail", user).subscribe(
      data => data = user);
  }

  saveEmployment(employ: Employment) {
    this.http.post(this.baseUrl + "/add_employment_detail", employ).subscribe(
      data => data = employ);
  }

  saveVehicle(vehicle: Vehicle) {
    this.http.post(this.baseUrl + "/add_vehicle_detail", vehicle).subscribe(
      data => data = vehicle);
  }

  saveLoan(loan: Loan) {
    this.http.post(this.baseUrl + "/add_loan_detail", loan).subscribe(
      data => data = loan);
  }

  saveIdentity(identity: Identity) {
    this.http.post(this.baseUrl + "/add_identity_detail", identity).subscribe(
      data => data = identity);
  }

  fetchUser(id : number) {
    return this.http.get<User>(this.baseUrl + "/fetch/"+id);
  }

  fetchPending() {
    return this.http.get<Loan[]>(this.baseUrl + "/fetch_by_loan_status/Pending");
  }

  fetchApproved() {
    return this.http.get<Loan[]>(this.baseUrl + "/fetch_by_loan_status/Approved");
  }

  fetchRejected() {
    return this.http.get<Loan[]>(this.baseUrl + "/fetch_by_loan_status/Rejected");
  }

  approve(id : number) {
    return this.http.get(this.baseUrl + "/change_loan_status/" + id + "/Approved").subscribe();
  }

  reject(id : number) {
    return this.http.get(this.baseUrl + "/change_loan_status/" + id + "/Rejected").subscribe();
  }
}
