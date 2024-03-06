import { Component } from '@angular/core';
import {RouterOutlet} from "@angular/router";
import {AdsComponent} from "../ads/ads.component";
import {HeaderComponent} from "./header/header.component";
import {BannerComponent} from "../banner/banner.component";
import {FooterComponent} from "./footer/footer.component";

@Component({
  selector: 'app-layout',
  standalone: true,
  imports: [
    HeaderComponent,
    BannerComponent,
    RouterOutlet,
    AdsComponent,
    FooterComponent
  ],
  templateUrl: './layout.component.html',
  styleUrl: './layout.component.css'
})
export class LayoutComponent {

}
