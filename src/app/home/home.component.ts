import {Component} from '@angular/core';
import {LayoutComponent} from "../shared/layout/layout.component";
import {RouterOutlet} from "@angular/router";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    LayoutComponent,
    RouterOutlet
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

}
