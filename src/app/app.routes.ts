import {Routes} from '@angular/router';
import {LayoutComponent} from "./shared/layout/layout.component";
import {HomeComponent} from "./home/pages/home/home.component";

export const routes: Routes = [
  {path: "", component: HomeComponent}
];
