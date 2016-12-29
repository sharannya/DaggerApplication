package com.assignment.daggerapplication.api;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sharannya nair on 12/26/16.
 */

@Module
public class NetworkApiModule {

    @Provides
    @Singleton
    NetworkApi setServiceApi() {
        return  new NetworkApi();

    }

}
