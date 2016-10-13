package com.alamkanak.weekview;

import android.support.annotation.IntDef;

import static com.alamkanak.weekview.GravityPaddingType.BOTTOM;
import static com.alamkanak.weekview.GravityPaddingType.TOP;

/**
 * Define gravity padding top or bottom for custom color
 */
@IntDef(value = {BOTTOM, TOP})
@interface GravityPaddingType {
    int BOTTOM = 10;
    int TOP = 20;
}
