package com.rrr.swift.SplashActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.rrr.swift.HomeActivity;
import com.rrr.swift.LocationActivities.AddEditLocationActivity;
import com.rrr.swift.Main2Activity;
import com.rrr.swift.R;
import com.rrr.swift.RegActivity.RegActivity;
import com.rrr.swift.temp.Main4Activity;


public class SplashActivity extends Activity
{

        ImageView splashLogo;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
            splashLogo = findViewById(R.id.logo);

            Thread splashThread = new Thread()
            {
                @Override
                public void run()
                {
                    try
                    {
                        Animation rotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splashanimation);
                        splashLogo.startAnimation(rotateAnimation);
                        splashLogo.setVisibility(View.INVISIBLE);
                        sleep(4000);
                       startActivity (new Intent(SplashActivity.this, Main4Activity.class));
                        finish();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }


                }
            };
            splashThread.start();
        }
    }