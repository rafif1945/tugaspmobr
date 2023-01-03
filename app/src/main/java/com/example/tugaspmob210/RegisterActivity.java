package com.example.tugaspmob210;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText edtUsername;
    private EditText edtPassword;
    private EditText nim;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        this.initComponents();

    }



    private void initComponents()
    {
        this.edtUsername = this.findViewById(R.id.edt_username);
        this.edtPassword = this.findViewById(R.id.edt_password);
        this.nim = this.findViewById(R.id.edt_nim);
        this.register=this.findViewById(R.id.btn_register);
    }
    public void onBtnRegister_Click(View view)
    {
        // Tampilkan pesan konfirmasi
        Toast.makeText(this, "Register Success!", Toast.LENGTH_SHORT).show();

        // Kembali ke halaman login
        this.finish();
    }

}