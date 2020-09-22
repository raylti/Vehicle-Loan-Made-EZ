import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutUsComponent } from './about-us/about-us.component';
import { AppForm1Component } from './app-form1/app-form1.component';
import { AppForm2Component } from './app-form2/app-form2.component';
import { AppForm3Component } from './app-form3/app-form3.component';
import { AppForm4Component } from './app-form4/app-form4.component';
import { AppForm5Component } from './app-form5/app-form5.component';
import { EmiCalcComponent } from './emi-calc/emi-calc.component';
import { GetEligibilityComponent } from './get-eligibility/get-eligibility.component';
import { HomeComponent } from './home/home.component';
import { LoanOfferComponent } from './loan-offer/loan-offer.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  {path: '', redirectTo: '/home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'aboutUs', component: AboutUsComponent},
  {path: 'emiCalculator', component: EmiCalcComponent},
  {path: 'applyLoan', component: GetEligibilityComponent},
  {path: 'loanOffer', component: LoanOfferComponent},
  {path: 'login', component: LoginComponent, pathMatch: 'full'},
  {path: 'appForm1', component: AppForm1Component},
  {path: 'appForm2', component: AppForm2Component},
  {path: 'appForm3', component: AppForm3Component},
  {path: 'appForm4', component: AppForm4Component},
  {path: 'appForm5', component: AppForm5Component},
  {path: '**', redirectTo: '/home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
