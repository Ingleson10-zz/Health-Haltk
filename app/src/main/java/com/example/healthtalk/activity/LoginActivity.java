package com.example.healthtalk.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.healthtalk.R;

public class LoginActivity extends AppCompatActivity {

    EditText txtcpf, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtcpf = findViewById(R.id.txtCPF);
        txtPassword = findViewById(R.id.txtPassword);
    }

    public void Login() {
        String cpf = txtcpf.getText().toString();
        String password = txtPassword.getText().toString();
        if (cpf.equals("") || cpf == null) {
            Toast.makeText(getApplicationContext(), "Preencher o campos CPF", Toast.LENGTH_LONG).show();
        } else if (password.equals("") || password == null) {
            Toast.makeText(getApplicationContext(), "Preencher o campos Senha", Toast.LENGTH_LONG).show();
        }
    }
}
