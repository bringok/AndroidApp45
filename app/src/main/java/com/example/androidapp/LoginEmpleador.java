package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginEmpleador extends AppCompatActivity {

    private EditText TextBoxEmailEmpleador;
    private EditText TextBoxPasswordEmpleador;
    private TextView errorEmpleador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_empleador);

        TextBoxEmailEmpleador = findViewById(R.id.TextBoxEmailEmpleador);
        TextBoxPasswordEmpleador = findViewById(R.id.TextBoxPasswordEmpleador);
        errorEmpleador = findViewById(R.id.errorEmpleador);
    }

    public void login(View view) {

        String email = TextBoxEmailEmpleador.getText().toString();
        String password = TextBoxPasswordEmpleador.getText().toString();

        if (email.equals("juan.velasquez.lopez@pi.edu.co") && password.equals("1234")) {
            Intent i = new Intent(this, Empleado.class);
            startActivity(i);
        } else {
            errorEmpleador.setText("ERROR!, E-mail o Contrasena incorrectas");
        }
    }

    public void back(View v) {
        finish();
    }
}