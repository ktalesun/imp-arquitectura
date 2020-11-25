import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {IconsProviderModule} from './icons-provider.module';
import {NzLayoutModule} from 'ng-zorro-antd/layout';
import {NzMenuModule} from 'ng-zorro-antd/menu';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {NZ_I18N} from 'ng-zorro-antd/i18n';
import {es_ES} from 'ng-zorro-antd/i18n';
import {registerLocaleData} from '@angular/common';
import es from '@angular/common/locales/es';
import {RouterModule, Routes} from '@angular/router';
import {SearchPageComponent} from './search-page/search-page.component';
import {NzAutocompleteModule, NzButtonModule, NzGridModule, NzInputModule} from 'ng-zorro-antd';

registerLocaleData(es);

const routes: Routes = [
  {path: '', pathMatch: 'full', redirectTo: '/search-page'},
  {path: 'search-page', component: SearchPageComponent},
  {path: 'auth', loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule)},
  {path: 'dashboard', loadChildren: () => import('./dashboard/dashboard.module').then(m => m.DashboardModule)}
];

@NgModule({
  declarations: [
    AppComponent, SearchPageComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    IconsProviderModule,
    NzLayoutModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    NzInputModule,
    NzAutocompleteModule,
    NzGridModule,
    NzButtonModule
  ],
  providers: [{provide: NZ_I18N, useValue: es_ES}],
  bootstrap: [AppComponent]
})
export class AppModule {
}
