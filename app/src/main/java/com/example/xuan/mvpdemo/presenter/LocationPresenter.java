package com.example.xuan.mvpdemo.presenter;

import com.example.xuan.mvpdemo.bean.City;
import com.example.xuan.mvpdemo.biz.Listener.OnRequestListener;
import com.example.xuan.mvpdemo.biz.location.ILocationBiz;
import com.example.xuan.mvpdemo.biz.location.LocationBiz;
import com.example.xuan.mvpdemo.view.IWeatherView;

/**
 * Author : xuan.
 * Data : 2017/7/21.
 * Description :get the location info from baidu sdk by ip
 */

public class LocationPresenter {
    private ILocationBiz mILoactionBiz;
    private IWeatherView mIWeatherView;

    public LocationPresenter(IWeatherView weatherView) {
        this.mIWeatherView = weatherView;
        this.mILoactionBiz = new LocationBiz();
    }

    public void getLocationInfo() {
        mILoactionBiz.getLocationByIp(new OnRequestListener<City>() {
            @Override
            public void onRequestSuccess(City city) {
                mIWeatherView.showCityName(city);
                mIWeatherView.showWeather();
            }

            @Override
            public void onRequestFailed() {

            }
        });
    }
}
