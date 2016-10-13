package com.alamkanak.weekview;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.alamkanak.weekview.PositionType.BOTTOM;
import static com.alamkanak.weekview.PositionType.LEFT;
import static com.alamkanak.weekview.PositionType.RIGHT;
import static com.alamkanak.weekview.PositionType.TOP;

/**
 * Define gravity padding top or bottom for custom color
 */
@IntDef(value = {BOTTOM, TOP, LEFT, RIGHT})
@Retention(RetentionPolicy.SOURCE)
@interface PositionType {
    int BOTTOM = 10;
    int TOP = 20;
    int LEFT = 40;
    int RIGHT = 80;
}
