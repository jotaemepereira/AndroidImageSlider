package com.daimajia.slider.library.Tricks;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class InfiniteViewPagerFix extends InfiniteViewPager {
    public InfiniteViewPagerFix(Context context) {
        super(context);
    }

    public InfiniteViewPagerFix(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        try {
            return super.onTouchEvent(ev);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        try {
            return super.onInterceptTouchEvent(ev);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
