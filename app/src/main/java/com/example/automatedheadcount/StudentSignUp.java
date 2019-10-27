package com.example.automatedheadcount;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class StudentSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_sign_up);
    }


    @SuppressWarnings("ApplySharedPref")
    public void go_back(android.view.View view) {
        EditText net_id = this.findViewById(R.id.net_idEditText);
        String id = net_id.getText().toString();
        //check for valid input:
        if(!(id.matches("^[a-zA-Z]{2}[0-9]{4}$"))) {
            net_id.setText("");
            net_id.setError("Enter a valid netID");
        }else{
            //if valid, save the text:
            SharedPreferences app_data = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor data = app_data.edit();
            data.putString("NETID", id);
            data.commit();
            //and go back:
            Intent intent = new Intent(this, MainStudent.class);
            startActivity(intent);
        }
    }
}
