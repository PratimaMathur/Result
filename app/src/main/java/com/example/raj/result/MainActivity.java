package com.example.raj.result;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView lView;
    TextView txt;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        lView= findViewById( R.id.lview );
        txt= findViewById( R.id.txt );
        lView.addAnimatorListener( new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart (Animator animator) {

            }

            @Override
            public void onAnimationEnd (Animator animator) {
                lView.setAnimation(R.raw.trophy);
                lView.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {;

            }
        } );
    }
}
