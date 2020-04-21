package com.flyco.tablayout.listener;

import android.support.annotation.DrawableRes;

import com.flyco.tablayout.internet.Bottomicons;

public interface CustomTabEntity {
    String getTabTitle();

    @DrawableRes
    int getTabSelectedIcon();

    @DrawableRes
    int getTabUnselectedIcon();

    Bottomicons getBottom();

}