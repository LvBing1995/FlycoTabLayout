package com.flyco.tablayout.internet;

import android.content.Context;
import android.widget.ImageView;

public interface ImageLoaderListener {

    void loadSelectImage(ImageView imageView, String selectedUrl,int placeholderId);
    void loadUnSelectImage(ImageView imageView, String unSelectedUrl,int placeholderId);
}
