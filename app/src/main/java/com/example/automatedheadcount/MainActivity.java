package com.example.automatedheadcount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences app_data = PreferenceManager.getDefaultSharedPreferences(this);
        String id = app_data.getString("NETID", "");
        String email = app_data.getString("EMAIL", "");
        Intent intent;
        if(!email.equals(""))
            intent = new Intent(this, MainAdmin.class);
        else if(!id.equals(""))
            intent = new Intent(this, MainStudent.class);
        else
        intent = new Intent(this, initialSetUp.class);
        startActivity(intent);
    }
}
