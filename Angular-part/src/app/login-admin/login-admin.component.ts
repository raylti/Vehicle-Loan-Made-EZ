import { Admin } from './../login.model';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-admin',
  templateUrl: './login-admin.component.html',
  styleUrls: ['./login-admin.component.css']
})
export class LoginAdminComponent implements OnInit {
  admin = new Admin;

  constructor(private router : Router) { }

  ngOnInit() {
  }

  adminDashboard() {
    if(this.admin.email == "ray123@gmail.com" && this.admin.password == "gladiator")
      this.router.navigate(['adminDashboard']);
    else
      alert("Invalid Email or Password");
  }
}
