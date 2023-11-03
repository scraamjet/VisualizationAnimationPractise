package com.example.visualizationanimationpractise.animationLogic;

import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.visualizationanimationpractise.R;

public class AnimationControl {
    Animation animation = AnimationUtils.loadAnimation(this, R.anim.your_animation);
    View view = findViewById(androidx.constraintlayout.widget.R.id.anticipate);
view.startAnimation(animation);

view.clearAnimation();

view.clearAnimation();
view.setAnimation(null);

animation.setDuration(newDurationInMilliseconds);

    long currentTime = SystemClock.uptimeMillis();
animation.setStartTime(currentTime - elapsedTime);

}
