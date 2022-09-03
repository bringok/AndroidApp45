package com.example.androidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginEmpleado extends AppCompatActivity {

    private EditText TextBoxEmail;
    private EditText TextBoxPassword;
    private TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_empleado);

        TextBoxEmail = findViewById(R.id.TextBoxEmail);
        TextBoxPassword = findViewById(R.id.TextBoxPassword);
        error = findViewById(R.id.error);
    }

    public void login(View view) {

        String email = TextBoxEmail.getText().toString();
        String password = TextBoxPassword.getText().toString();

        if (email.equals("juan.velasquez.lopez@pi.edu.co") && password.equals("1234")) {
            Intent i = new Intent(this, Empleado.class);
            startActivity(i);
        } else {
            error.setText("ERROR!, E-mail o Contrasena incorrectas");
        }
    }

    public void back(View v) {
        finish();
    }
}