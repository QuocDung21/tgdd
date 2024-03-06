import {CommonModule} from '@angular/common';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HeaderComponent} from "./layout/header/header.component";
import {AdsComponent} from "./ads/ads.component";
import {BannerComponent} from "./banner/banner.component";
import {SliderComponent} from "./slider/slider.component";
import {PromoComponent} from "./promo/promo.component";
import {CampainComponent} from "./campain/campain.component";

@NgModule({
  imports: [CommonModule, HeaderComponent, AdsComponent, SliderComponent, PromoComponent, CampainComponent, BannerComponent, BannerComponent],
  declarations: [],
  exports: [HeaderComponent, AdsComponent, BannerComponent, CommonModule, SliderComponent, FormsModule, BannerComponent, PromoComponent, CampainComponent]

})
export class SharedModule {
}
