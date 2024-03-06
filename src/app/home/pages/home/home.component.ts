import { Component } from '@angular/core';
import {SliderComponent} from "../../../shared/slider/slider.component";
import {BannerComponent} from "../../../shared/banner/banner.component";
import {PromoComponent} from "../../../shared/promo/promo.component";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    SliderComponent,
    BannerComponent,
    PromoComponent
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

}
