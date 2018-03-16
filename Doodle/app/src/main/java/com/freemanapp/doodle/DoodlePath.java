package com.freemanapp.doodle;

import java.util.ArrayList;

/**
 * Created by alberthe on 2018/3/16.
 */

public class DoodlePath {

    private Point[] mPath;
    private int mPointCnt;

    public DoodlePath(){
        mPath = new Point[1000];
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
