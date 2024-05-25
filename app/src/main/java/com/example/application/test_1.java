package com.example.application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class test_1 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    Button bTest_1, bTest_2, bTest_3, bTest_4, bTest_5;
    String login = "", email = "";
    TextView tvLogin, tvEmail;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        bTest_1 = findViewById(R.id.bTest_1);
        bTest_2 = findViewById(R.id.bTest_2);
        bTest_3 = findViewById(R.id.bTest_3);
        bTest_4 = findViewById(R.id.bTest_4);
        bTest_5 = findViewById(R.id.bTest_5);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TestOneFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_main);
        }
    }

    public void onClickMenu(View view){
        if (view.getId() == R.id.bLesson_1) {
            Intent intent = new Intent(this, lesson_1.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        } else if (view.getId() == R.id.bLesson_2){
            Intent intent = new Intent(this, lesson_2.class);
            intent.putExtra("login", login);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        } else if (view.getId() == R.id.bLesson_3) {
            Intent intent = new Intent(this, lesson_3.class);
            intent.putExtra("login", login);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        } else if (view.getId() == R.id.bLesson_4) {
            Intent intent = new Intent(this, lesson_4.class);
            intent.putExtra("login", login);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
        else if (view.getId() == R.id.bLesson_5) {
            Intent intent = new Intent(this, lesson_5.class);
            intent.putExtra("login", login);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        } else if (view.getId() == R.id.bTest_1){
            Intent intent = new Intent(this, test_1.class);
            intent.putExtra("login", login);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        } else if (view.getId() == R.id.bTest_2){
            Intent intent = new Intent(this, test_2.class);
            intent.putExtra("login", login);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        } else if (view.getId() == R.id.bTest_3){
            Intent intent = new Intent(this, test_3.class);
            intent.putExtra("login", login);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        } else if (view.getId() == R.id.bTest_4){
            Intent intent = new Intent(this, test_4.class);
            intent.putExtra("login", login);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        } else if (view.getId() == R.id.bTest_5){
            Intent intent = new Intent(this, test_5.class);
            intent.putExtra("login", login);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nav_main) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MainFragment()).commit();
        } else if (item.getItemId() == R.id.nav_vocabulary) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VocabularyFragment()).commit();
        } else if (item.getItemId() == R.id.nav_settings) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SettingsFragment()).commit();
        } else if (item.getItemId() == R.id.nav_about) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AboutFragment()).commit();
        } else if (item.getItemId() == R.id.nav_tests) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TestsFragment()).commit();
        } else if (item.getItemId() == R.id.nav_exit) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}