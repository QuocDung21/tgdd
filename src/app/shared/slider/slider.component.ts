import {Component, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import {PromoComponent} from "../promo/promo.component";
import {CampainComponent} from "../campain/campain.component";

@Component({
  selector: 'app-slider',
  standalone: true,
  imports: [
    PromoComponent,
    CampainComponent
  ],
  templateUrl: './slider.component.html',
  styleUrl: './slider.component.css',
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SliderComponent {

}
