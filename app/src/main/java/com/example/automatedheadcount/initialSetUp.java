package com.example.automatedheadcount;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;

public class initialSetUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_set_up);
        SharedPreferences app_data = PreferenceManager.getDefaultSharedPreferences(this);
        String id = app_data.getString("NETID", "");
        String email = app_data.getString("EMAIL", "");
        Intent intent;
        if(!email.equals("")){
            intent = new Intent(this, MainAdmin.class);
            startActivity(intent);
        }
        else if(!id.equals("")){
            intent = new Intent(this, MainStudent.class);
            startActivity(intent);
        }
    }
    public void sign_up_button(android.view.View view){ //for student NET ID
        Intent intent = new Intent(this, StudentSignUp.class);
        startActivity(intent);
    }
    public void sign_up_adminButton(android.view.View view){ //for admin athenticating
        Intent intent = new Intent(this, AdminSignUp.class);
        startActivity(intent);
    }
}
