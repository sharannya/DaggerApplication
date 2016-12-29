package com.assignment.daggerapplication;

import com.assignment.daggerapplication.api.NetworkApiModule;
import com.assignment.daggerapplication.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sharannya nair on 12/26/16.
 */
@Singleton
@Component(modules = {NetworkApiModule.class})

public interface NetworkComponent {

    void inject(MainActivity activity);


}
