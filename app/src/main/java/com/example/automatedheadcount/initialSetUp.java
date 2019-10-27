package com.example.automatedheadcount;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class initialSetUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_set_up);
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
