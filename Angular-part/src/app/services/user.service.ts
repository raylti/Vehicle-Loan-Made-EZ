import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../loan.model';
import { Login } from '../login.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private baseUrl : string = "http://localhost:8080/ride-along-spring-rest1/rest";
 
  constructor(private router : Router, private http : HttpClient) { }

  register(user : User) {
    this.http.post(this.baseUrl +"/add_user_detail",user).subscribe(
      data => data = user);
    }

    login(login : Login) : Promise<User> {
      const params = new HttpParams().append('email', login.email)
            .append('password', login.password);
            let result = this.http.get<User>(this.baseUrl+"/login", {params : params}).toPromise();
      return result;
    }
  }
