package com.freemanapp.doodle;

import java.util.ArrayList;

/**
 * Created by alberthe on 2018/3/16.
 */

public class DoodlePath {

    public static final int MAX_POINT_CNT = 1000;

    private Point[] mPath;
    private int mPointCnt;

    public DoodlePath(){
        mPath = new Point[MAX_POINT_CNT];
        for(int i = 0; i < MAX_POINT_CNT; i++){
            mPath[i] = new Point();
        }
        mPointCnt = 0;
    }

    public void Add(float x, float y){
        mPath[mPointCnt].x = x;
        mPath[mPointCnt].y = y;
        mPointCnt++;
    }

    private static class Point{
        float x;
        float y;
    }
}
