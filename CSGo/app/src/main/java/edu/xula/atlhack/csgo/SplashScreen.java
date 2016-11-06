package edu.xula.atlhack.csgo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Almighty on 11/6/2016.
 */

public class SplashScreen extends Activity {

    private LinearLayout mSplashScreen;
    private TextView mAppSlogan;

    private CharSequence mText;
    private int mIndex;
    private long mDelay = 500; //Default 500ms delay

    private Handler mHandler = new Handler();
    private Runnable characterAdder = new Runnable() {
        @Override
        public void run() {
            mAppSlogan.setText(mText.subSequence(0, mIndex++));
            if(mIndex <= mText.length()) {
                mHandler.postDelayed(characterAdder, mDelay);
            }
        }
    };

    private final int SPLASH_DISPLAY_LENGTH = 3500;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash_screen);

        mSplashScreen = (LinearLayout) findViewById(R.id.ll_splash_screen);
        mSplashScreen.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in));

        mAppSlogan = (TextView) findViewById(R.id.tv_app_slogan);

        //Add a character every 150ms
        setCharacterDelay(150);
        animateText("Gotta Get A Job!");



        /* New Handler to launch the Sign Up Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this, SignUp.class));
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }


    public void animateText(CharSequence text) {
        mText = text;
        mIndex = 0;

        mAppSlogan.setText("");
        mHandler.removeCallbacks(characterAdder);
        mHandler.postDelayed(characterAdder, mDelay);
    }

    public void setCharacterDelay(long millis) {
        mDelay = millis;
    }

}
