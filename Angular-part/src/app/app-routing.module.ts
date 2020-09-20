import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutUsComponent } from './about-us/about-us.component';
import { AppForm1Component } from './app-form1/app-form1.component';
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
  {path: '**', redirectTo: '/home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
