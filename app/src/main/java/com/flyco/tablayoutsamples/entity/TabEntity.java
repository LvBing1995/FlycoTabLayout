package com.flyco.tablayoutsamples.entity;

import com.flyco.tablayout.internet.Bottomicons;
import com.flyco.tablayout.listener.CustomTabEntity;

import java.util.List;

public class TabEntity implements CustomTabEntity {
    public String title;
    public int selectedIcon;
    public int unSelectedIcon;
    public Bottomicons bottomicons;
    public TabEntity(String title, int selectedIcon, int unSelectedIcon) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }
    public TabEntity(String title, int selectedIcon, int unSelectedIcon, Bottomicons bottomicons) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
        this.bottomicons = bottomicons;
    }
    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return selectedIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unSelectedIcon;
    }

    @Override
    public Bottomicons getBottom() {
        return bottomicons;
    }


}
