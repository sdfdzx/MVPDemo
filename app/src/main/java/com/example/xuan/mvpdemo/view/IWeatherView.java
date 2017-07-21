package com.example.xuan.mvpdemo.view;

import com.example.xuan.mvpdemo.bean.City;
import com.example.xuan.mvpdemo.bean.WeatherInfo;

/**
 * Author : xuan.
 * Data : 2017/7/20.
 * Description :input the description of this file.
 */

public interface IWeatherView {
    String getCityName();

    void showWeatherInfo(WeatherInfo info);

    void showCityName(City city);

    void showLoading();

    void hideLoading();
}