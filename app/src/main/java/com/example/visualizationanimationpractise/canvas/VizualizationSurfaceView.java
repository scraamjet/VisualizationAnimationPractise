package com.example.visualizationanimationpractise.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class VizializationSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder surfaceHolder;
    private Paint paint;
    private boolean isPlaying = false;

    public CustomSurfaceView(Context context) {
        super(context);
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
        paint = new Paint();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        // Остановка и очистка потока рендеринга
    }

    public void drawControls() {
        Canvas canvas = surfaceHolder.lockCanvas();
        if (canvas != null) {
            // Пример рисования кнопок:
            canvas.drawRect(playButtonRect, paint);
            canvas.drawRect(pauseButtonRect, paint);

            // Пример отображения текущего состояния
            String stateText = isPlaying ? "Play" : "Pause";
            canvas.drawText("State: " + stateText, x, y, paint);

            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }
}