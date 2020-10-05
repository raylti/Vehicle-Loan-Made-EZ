import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../loan.model';
import { Login } from '../login.model';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-login-user',
  templateUrl: './login-user.component.html',
  styleUrls: ['./login-user.component.css']
})
export class LoginUserComponent implements OnInit {
  login: Login;
  user: User;

  constructor(private service: UserService, private router: Router) {
    this.login = new Login();
  }

  ngOnInit(): void {
    localStorage.setItem("user", null);
  }

  async loggedIn() {
    await this.service.login(this.login).then(data => this.user = data);

    localStorage.setItem("user", JSON.stringify(this.user));
    localStorage.setItem("uname", this.user.name);
    this.router.navigate(['userDashboard']);
  }

  register() {
    this.router.navigate(['appForm1']);
  }
}
