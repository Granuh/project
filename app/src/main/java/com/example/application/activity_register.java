package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_register extends AppCompatActivity {

    Button bBack, bReg;
    EditText etLogin, etPassword, etEmail;
    TextView tvStatus;
    String login, password, email;
    UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        bBack = findViewById(R.id.bBack);
        bReg = findViewById(R.id.bReg);

        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);
        etEmail = findViewById(R.id.etEmailAddress);

        tvStatus = findViewById(R.id.tvStatus);

        bReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegistUser();
            }
        });

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu();
            }
        });
    }

    public void RegistUser(){
        login = etLogin.getText().toString().trim();
        password = etPassword.getText().toString().trim();
        email = etEmail.getText().toString().trim();

        userModel = new UserModel(this);

        if(login.equals("") || password.equals("") || email.equals("")) {
            Toast toast = Toast.makeText(activity_register.this, "Поля пустые", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            User user = new User();
            user.SetLogin(login);
            user.SetPassword(password);
            user.SetEmail(email);

            userModel.CreateUser(user);

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("login", login);
            intent.putExtra("password", password);
            intent.putExtra("email", email);
            Toast toast = Toast.makeText(activity_register.this, "Регистрация успешно", Toast.LENGTH_SHORT);
            toast.show();
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }

    public void menu(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}