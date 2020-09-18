import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD

import { HomeComponent } from './home/home.component';


import { AppForm1Component } from './app-form1/app-form1.component';


=======
import { HomeComponent } from './home/home.component';

import { AppForm1Component } from './app-form1/app-form1.component';

>>>>>>> 81c68097c520c3d6c9b5f713ddac8d5b677de79c
import { LoginComponent } from './login/login.component';
import { LoginDashboardComponent } from './login-dashboard/login-dashboard.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,

    AppForm1Component,

    LoginComponent,
    LoginDashboardComponent,
    AdminDashboardComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
