import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {LoginPageComponent} from './login-page/login-page.component';
import {Route, RouterModule} from '@angular/router';
import {
  NzButtonModule,
  NzCheckboxModule,
  NzFormModule,
  NzGridModule,
  NzInputModule,
  NzLayoutModule
} from 'ng-zorro-antd';
import {ReactiveFormsModule} from '@angular/forms';

const routes: Route[] = [
  {path: '', pathMatch: 'full', redirectTo: '/auth/login'},
  {
    path: 'login',
    component: LoginPageComponent
  }
];

@NgModule({
  declarations: [LoginPageComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    NzGridModule,
    ReactiveFormsModule,
    NzFormModule,
    NzInputModule,
    NzButtonModule,
    NzCheckboxModule,
    NzLayoutModule
  ]
})
export class AuthModule {
}
