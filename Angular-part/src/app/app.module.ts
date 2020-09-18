import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { AppForm1Component } from './app-form1/app-form1.component';
=======
import { LoginComponent } from './login/login.component';
import { LoginDashboardComponent } from './login-dashboard/login-dashboard.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
>>>>>>> e2e689da5da1fc43b97220b825800a6aeceae11b

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    AppForm1Component
=======
    LoginComponent,
    LoginDashboardComponent,
    AdminDashboardComponent
>>>>>>> e2e689da5da1fc43b97220b825800a6aeceae11b
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
