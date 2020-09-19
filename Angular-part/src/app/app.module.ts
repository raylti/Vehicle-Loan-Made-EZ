import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';

import { AppForm1Component } from './app-form1/app-form1.component';

import { LoginComponent } from './login/login.component';
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


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,

    AppForm1Component,

    LoginComponent,
    AdminDashboardComponent,
    AppForm2Component,
    AppForm3Component,
    AppForm4Component,
    AppForm5Component,
    UserDashboardComponent,
    AboutUsComponent,
    EmiCalcComponent,
    GetEligibilityComponent,
    LoanOfferComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }