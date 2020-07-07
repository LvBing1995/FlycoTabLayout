package com.flyco.tablayoutsamples.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.internet.Bottomicons;
import com.flyco.tablayout.internet.ImageLoader;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayoutsamples.R;
import com.flyco.tablayoutsamples.entity.TabEntity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TuQiTabActivity extends AppCompatActivity {

    CommonTabLayout commonTabLayout;
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private String[] mTitles = {"", "", "", ""};
    private int[] mIconUnselectIds = {
            R.drawable.sign_select, R.mipmap.tab_speech_unselect,
            R.mipmap.tab_contact_unselect, R.mipmap.tab_more_unselect};
    private int[] mIconSelectIds = {
            R.drawable.sign_select, R.mipmap.tab_speech_select,
            R.mipmap.tab_contact_select, R.mipmap.tab_more_select};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuqi_tab);

        commonTabLayout = findViewById(R.id.common_tab_layout);
        String jsonString = getJson("haha",this);
        final List<Bottomicons> list = new Gson().fromJson(jsonString,new TypeToken<List<Bottomicons>>(){}.getType());
        for (int i = 0; i < mTitles.length; i++) {
            if (i == 0){
                mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i],70));
            }else{

                mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
            }
        }
        commonTabLayout.setImageLoaderListener(new ImageLoader()).setTabData(mTabEntities);
        commonTabLayout.setIconMarginByPosition(0,10);
        //commonTabLayout.setTabData(mTabEntities);

    }

    public static String getJson(String fileName, Context context) {
        //将json数据变成字符串
        StringBuilder stringBuilder = new StringBuilder();
        try {
            //获取assets资源管理器
            AssetManager assetManager = context.getAssets();
            //通过管理器打开文件并读取
            BufferedReader bf = new BufferedReader(new InputStreamReader(
                    assetManager.open(fileName)));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
