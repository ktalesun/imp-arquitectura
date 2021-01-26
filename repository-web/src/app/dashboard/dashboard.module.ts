import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Route, RouterModule} from '@angular/router';
import {DashboardComponent} from './dashboard.component';
import {NzIconModule, NzLayoutModule, NzMenuModule} from 'ng-zorro-antd';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

const routes: Route[] = [
  {
    path: '',
    component: DashboardComponent
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
    FormsModule,
    ReactiveFormsModule
  ]
})
export class DashboardModule {
}
