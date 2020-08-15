import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Route, RouterModule} from '@angular/router';
import {LoginPageComponent} from '../auth/login-page/login-page.component';
import { DashboardComponent } from './dashboard.component';
import {NzIconModule, NzLayoutModule, NzMenuModule} from "ng-zorro-antd";

const routes: Route[] = [
  {
    path: '',
    redirectTo: 'login'
  },
  {
    path: 'login',
    component: LoginPageComponent
  }
];

@NgModule({
  declarations: [DashboardComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    NzLayoutModule,
    NzIconModule,
    NzMenuModule,
  ]
})
export class DashboardModule {
}
