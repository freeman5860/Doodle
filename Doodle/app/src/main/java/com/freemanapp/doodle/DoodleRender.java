package com.freemanapp.doodle;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

/**
 * Created by alberthe on 2018/3/16.
 */

public class DoodleRender implements DoodleManager.DoodleListener {

    private GLSurfaceView mGLView;

    public DoodleRender(GLSurfaceView glView){
        mGLView = glView;
    }

    public void clearScreen(){
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public void startDraw() {
        mGLView.requestRender();
    }
}
