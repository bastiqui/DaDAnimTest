package com.example.bastiqui.draganddrop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        findViewById(R.id.blink_anim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.blink_anim);
            }
        });

        findViewById(R.id.bounce).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.bounce);
            }
        });

        findViewById(R.id.fadein).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.fadein);
            }
        });

        findViewById(R.id.fadeout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.fadeout);
            }
        });

        findViewById(R.id.lefttoright).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.lefttoright);
            }
        });

        findViewById(R.id.mixed_anim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.mixed_anim);
            }
        });

        findViewById(R.id.righttoleft).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.righttoleft);
            }
        });

        findViewById(R.id.rotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.rotate);
            }
        });

        findViewById(R.id.sample_anim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.sample_anim);
            }
        });

        findViewById(R.id.zoomin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.zoomin);
            }
        });

        findViewById(R.id.zoomout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnim(v, R.anim.zoomout);
            }
        });
    }

    private void startAnim (View v, int id) {
        Animation animation = AnimationUtils.loadAnimation(AnimationActivity.this, id);
        v.startAnimation(animation);
    }
}
