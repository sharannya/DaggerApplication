package com.assignment.daggerapplication.api;

import android.text.TextUtils;

import dagger.Module;

/**
 * Created by sharannya nair on 12/26/16.
 */

@Module
public class NetworkApi {

    public boolean validateUser(String username,String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            return false;
        } else {
            return true;
        }
    }
}
