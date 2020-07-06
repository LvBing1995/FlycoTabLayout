package com.flyco.tablayoutsamples.entity;

import com.flyco.tablayout.internet.Bottomicons;
import com.flyco.tablayout.listener.CustomTabEntity;

import java.util.List;

public class TabEntity implements CustomTabEntity {
    public String title;
    public int selectedIcon;
    public int unSelectedIcon;
    public Bottomicons bottomicons;
    private int erectHeight = -1;//特殊TabView需要超出原来父容器高度
    public TabEntity(String title, int selectedIcon, int unSelectedIcon) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }
    public TabEntity(String title, int selectedIcon, int unSelectedIcon,int erectHeight) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
        this.erectHeight = erectHeight;
    }
    public TabEntity(String title, int selectedIcon, int unSelectedIcon,int erectHeight, Bottomicons bottomicons) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
        this.erectHeight = erectHeight;
        this.bottomicons = bottomicons;
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

    public int getErectHeight() {
        return erectHeight;
    }

    @Override
    public Bottomicons getBottom() {
        return bottomicons;
    }


}
