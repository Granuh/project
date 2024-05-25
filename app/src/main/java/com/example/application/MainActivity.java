package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button bLog, bReg;
    EditText etLogin, etPassword;
    TextView tvStatus;
    String login, password, email;
    UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bLog = findViewById(R.id.bLog);
        bReg = findViewById(R.id.bReg);

        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);

        tvStatus = findViewById(R.id.tvStatus);

        Bundle arg = getIntent().getExtras();
        if (arg != null) {
            login = arg.getString("login").toString();
            password = arg.getString("password").toString();
            email = arg.getString("email").toString();

            etLogin.setText(login);
            etPassword.setText(password);
        }
    }

    public void onClickAcc(View view) {
        login = etLogin.getText().toString().trim();
        password = etPassword.getText().toString().trim();

        boolean IsVis = false;

        userModel = new UserModel(this);

        List<User> users = userModel.GetAllUsers();

        if(login.equals("") || password.equals("")) {
            Toast toast = Toast.makeText(MainActivity.this, "Поля пустые", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            for (User user : users){
                if (user.GetLogin().equals(login) && user.GetPassword().equals(password)){
                    IsVis = true;
                }
            }
            if (IsVis){
                Intent intent = new Intent(this, activity_menu.class);
                intent.putExtra("login", login);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                startActivity(intent);
                Toast toast = Toast.makeText(MainActivity.this, "Вы вошли!", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Неверный логин или пароль!", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }

    public void onClickReg(View view){
        Intent intent = new Intent(this, activity_register.class);
        startActivity(intent);
    }
}