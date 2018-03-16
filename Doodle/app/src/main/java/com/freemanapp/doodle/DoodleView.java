package com.freemanapp.doodle;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by freeman on 2018/3/16.
 */

public class DoodleView extends GLSurfaceView implements GLSurfaceView.Renderer {

    private DoodleRender mDoodleRender;

    public DoodleView(Context context) {
        super(context);
        init();
    }

    public DoodleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        setEGLContextClientVersion(2);
        setRenderer(this);
        setRenderMode(RENDERMODE_WHEN_DIRTY);

        mDoodleRender = new DoodleRender(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        DoodleManager.getInstance().onTouchEvent(event);

        return true;
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i1) {

    }

    @Override
    public void onDrawFrame(GL10 gl10) {
    }
}
