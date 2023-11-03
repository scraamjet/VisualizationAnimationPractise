package com.example.visualizationanimationpractise.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class ControlView extends View {
    private Paint playButtonPaint;  // Кисть для кнопки "Воспроизведение"
    private Rect playButtonRect;    // Прямоугольник для кнопки "Воспроизведение"

    private Paint pauseButtonPaint;  // Кисть для кнопки "Приостановка"
    private Rect pauseButtonRect;    // Прямоугольник для кнопки "Приостановка"

    public ControlView(Context context) {
        super(context);

        // Инициализация кистей и прямоугольников
        playButtonPaint = new Paint();
        playButtonPaint.setColor(Color.GREEN);

        pauseButtonPaint = new Paint();
        pauseButtonPaint.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        // Рисуем кнопку "Воспроизведение"
        int playButtonWidth = width / 3;
        int playButtonHeight = height / 5;
        int playButtonX = width / 6;
        int playButtonY = height / 2 - playButtonHeight / 2;
        playButtonRect = new Rect(playButtonX, playButtonY, playButtonX + playButtonWidth, playButtonY + playButtonHeight);
        canvas.drawRect(playButtonRect, playButtonPaint);

        // Рисуем кнопку "Приостановка"
        int pauseButtonWidth = width / 3;
        int pauseButtonHeight = height / 5;
        int pauseButtonX = 2 * width / 3;
        int pauseButtonY = height / 2 - pauseButtonHeight / 2;
        pauseButtonRect = new Rect(pauseButtonX, pauseButtonY, pauseButtonX + pauseButtonWidth, pauseButtonY + pauseButtonHeight);
        canvas.drawRect(pauseButtonRect, pauseButtonPaint);
    }
}