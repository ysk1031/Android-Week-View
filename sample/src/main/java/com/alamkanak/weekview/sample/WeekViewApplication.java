package com.alamkanak.weekview.sample;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Kevin Ménager on 10/13/16.
 */

public class WeekViewApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Orkney-Regular.otf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
