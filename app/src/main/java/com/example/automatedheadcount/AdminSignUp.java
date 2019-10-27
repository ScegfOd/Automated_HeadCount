package com.example.automatedheadcount;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.EditText;

public class AdminSignUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_sign_up);
    }
    @SuppressWarnings("ApplySharedPref")
    public void go_back_adminButton(android.view.View view) {
        //edit this:
        EditText email = this.findViewById(R.id.emailEditText);
        String email_string = email.getText().toString();

        EditText authentication = this.findViewById(R.id.authenticationEditText);
        String authentication_code = authentication.getText().toString();

        EditText password = this.findViewById(R.id.personalPasswordEditText);
        String password_string = password.getText().toString();

        if(!authentication_code.equals("0")){
            authentication.setError("Incorrect authentication password");
        }
        else{
            SharedPreferences app_data = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor data = app_data.edit();
            data.putString("EMAIL", email_string);
            data.putString("PASSWORD", password_string);
            data.commit();
            //and go back:
            Intent intent = new Intent(this, MainAdmin.class);
            startActivity(intent);
        }


    }
}
