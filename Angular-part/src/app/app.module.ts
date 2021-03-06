import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule } from '@angular/forms';
import { Ng5SliderModule } from 'ng5-slider';
import { HttpClientModule } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';

import { AppForm1Component } from './app-form1/app-form1.component';

import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { AppForm2Component } from './app-form2/app-form2.component';
import { AppForm3Component } from './app-form3/app-form3.component';
import { AppForm4Component } from './app-form4/app-form4.component';
import { AppForm5Component } from './app-form5/app-form5.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { EmiCalcComponent } from './emi-calc/emi-calc.component';
import { GetEligibilityComponent } from './get-eligibility/get-eligibility.component';
import { LoanOfferComponent } from './loan-offer/loan-offer.component';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { LoginUserComponent } from './login-user/login-user.component';




@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,

    AppForm1Component,
    AdminDashboardComponent,
    AppForm2Component,
    AppForm3Component,
    AppForm4Component,
    AppForm5Component,
    UserDashboardComponent,
    AboutUsComponent,
    EmiCalcComponent,
    GetEligibilityComponent,
    LoanOfferComponent,
    LoginAdminComponent,
    LoginUserComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    Ng5SliderModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }