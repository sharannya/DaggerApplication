package com.assignment.daggerapplication;

import android.app.Application;

import com.assignment.daggerapplication.ui.MainActivity;


/**
 * Created by sharannya nair on 12/26/16.
 */

public class DaggerApplication extends Application {
    NetworkComponent networkComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        networkComponent=DaggerNetworkComponent.builder().build();
    }
    public NetworkComponent getComponent(){
        return new NetworkComponent() {
            @Override
            public void inject(MainActivity activity) {

            }
        };
    }
}
