package com.example.esoftwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etuserName, etpassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hide Title Bar
        getSupportActionBar().hide();

        etuserName = findViewById(R.id.userName);
        etpassword = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String userName = etuserName.getText().toString();
        String password = etpassword.getText().toString();

        if(userName.equals("softwarica") && password.equals("coventry"))
        {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "SORRY INVALID USER ID OR PASSWORD",Toast.LENGTH_LONG).show();
        }
    }
}
