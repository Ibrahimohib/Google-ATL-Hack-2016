package edu.xula.atlhack.csgo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Brianna on 11/5/2016.
 */

public class Profile extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.profileres);
        super.onCreate(savedInstanceState);
    }

    public void startGame(View v) {
        startActivity(new Intent(Profile.this, Profile.class));
    }
}
