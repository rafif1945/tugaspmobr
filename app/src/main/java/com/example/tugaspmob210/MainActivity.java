package com.example.tugaspmob210;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String DUMMY_USERNAME = "dtsawardee";
    private static final String DUMMY_PASSWORD = "dtsrocks";

    // Komponen
    private EditText edtUsername;
    private EditText edtPassword;
    Button login;

    // SharedPreferences yang akan digunakan untuk menulis dan membaca data
    private SharedPreferences sharedPrefs;

    // Key-key untuk data yang disimpan di SharedPrefernces
    private static final String USERNAME_KEY = "key_username";
    private static final String KEEP_LOGIN_KEY = "key_keep_login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inisialisasi SharedPreferences
        this.sharedPrefs = this.getSharedPreferences("dtsapp_sharedprefs", Context.MODE_PRIVATE);
        this.initComponents();

    }

    private void initComponents()
    {
        // Init components
        this.edtUsername = this.findViewById(R.id.edt_username);
        this.edtPassword = this.findViewById(R.id.edt_password);
        this.login=this.findViewById(R.id.btn_login);

    }

    // Click Actions



    public void onBtnLogin_Click(View view)
    {
        Intent i = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(i);

        Toast.makeText(this, "Invalid username and/or password!", Toast.LENGTH_LONG).show();
    }

    public void onBtnRegister_Click(View view)
    {
        Intent i = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(i);
    }

    // End of Click Actions


}