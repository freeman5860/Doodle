package com.freemanapp.doodle;

import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by freeman on 2018/3/16.
 */

public class DoodleManager {
    private static final int MAX_DOODLE_NUM = 100;

    private DoodlePath[] mDoodlePath;

    private int mPathCnt = 0;

    public interface DoodleListener{
        void startDraw();
    }

    private DoodleListener mListener;

    private static DoodleManager sInstance;

    private DoodleManager(){
        mDoodlePath = new DoodlePath[MAX_DOODLE_NUM];
        for(int i = 0; i < MAX_DOODLE_NUM; i++){
            mDoodlePath[i] = new DoodlePath();
        }
    }

    public static DoodleManager getInstance(){
        if(sInstance == null){
            sInstance = new DoodleManager();
        }

        return sInstance;
    }

    public void setDoodleListener(DoodleListener listener){
        mListener = listener;
    }

    public void onTouchEvent(MotionEvent event){
        float x = event.getX();
        float y = event.getY();
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                addPoint(x, y, false);
                break;
            case MotionEvent.ACTION_MOVE:
                addPoint(x, y, false);
                break;
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                addPoint(x, y, true);
                break;
        }

        if(mListener != null){
            mListener.startDraw();
        }
    }

    private void addPoint(float x, float y, boolean end){
        mDoodlePath[mPathCnt].Add(x, y);
        if(end) mPathCnt++;
    }
}
