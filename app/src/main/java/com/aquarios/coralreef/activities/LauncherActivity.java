package com.aquarios.coralreef.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent launch = new Intent(this, com.aquarios.coralreef.activities.CoralReef.class);
        startActivity(launch);
        finish();
    }
}
