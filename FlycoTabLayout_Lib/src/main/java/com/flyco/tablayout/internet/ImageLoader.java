package com.flyco.tablayout.internet;

import android.widget.ImageView;

import me.bzcoder.easyglide.EasyGlide;
import me.bzcoder.easyglide.config.GlideConfigImpl;

public class ImageLoader implements ImageLoaderListener {

    @Override
    public void loadSelectImage(ImageView imageView, String selectedUrl, int placeholderId) {
        EasyGlide.loadImage(imageView.getContext(),getImageConfig(imageView,selectedUrl,placeholderId));
    }

    @Override
    public void loadUnSelectImage(ImageView imageView, String unSelectedUrl, int placeholderId) {
        EasyGlide.loadImage(imageView.getContext(),getImageConfig(imageView,unSelectedUrl,placeholderId));
    }

    public GlideConfigImpl getImageConfig(ImageView imageView,String url,int placeholderId){
        GlideConfigImpl glideConfig = GlideConfigImpl.builder()
                .errorPic(placeholderId)
                .placeholder(placeholderId)
                .url(url)
                .imageView(imageView)
                .build();

        return glideConfig;
    }
}
