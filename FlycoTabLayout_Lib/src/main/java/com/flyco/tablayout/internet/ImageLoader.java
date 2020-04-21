package com.flyco.tablayout.internet;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ImageLoader implements ImageLoaderListener {

    @Override
    public void loadSelectImage(ImageView imageView, String selectedUrl, int placeholderId) {

        Glide.with(imageView.getContext())
                .load(selectedUrl)
                .apply(new RequestOptions().placeholder(placeholderId).error(placeholderId))
                .into(imageView);
    }

    @Override
    public void loadUnSelectImage(ImageView imageView, String unSelectedUrl, int placeholderId) {
        Glide.with(imageView.getContext())
                .load(unSelectedUrl)
                .apply(new RequestOptions().placeholder(placeholderId).error(placeholderId))
                .into(imageView);
    }

}
