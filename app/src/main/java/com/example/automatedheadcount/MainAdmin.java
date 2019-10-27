package com.example.automatedheadcount;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin);
    }
    public void scan_for_students(android.view.View view){
        Intent intent = new Intent(this, AttendenceScanner.class);
        startActivity(intent);
    }

}
