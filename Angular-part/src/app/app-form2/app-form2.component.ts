import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-app-form2',
  templateUrl: './app-form2.component.html',
  styleUrls: ['./app-form2.component.css']
})
export class AppForm2Component implements OnInit {

  constructor(private router : Router) { }

  ngOnInit() {
  }
  salary:number =1;

  isCollapsed = false;

  setSalary(value){
    this.salary = value;
    console.log(this.salary);
  }

  save2() {
    this.router.navigate(['appForm3']);
  }

}
  
    
    

