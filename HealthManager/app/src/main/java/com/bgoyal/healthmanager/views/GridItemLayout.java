package com.bgoyal.healthmanager.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by bittu_goyal on 11/9/17.
 */

public class GridItemLayout extends LinearLayout {

    public GridItemLayout(Context context) {
        super(context);
    }

    public GridItemLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
