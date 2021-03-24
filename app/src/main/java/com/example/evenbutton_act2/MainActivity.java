package com.example.evenbutton_act2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edEmail, edPassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);
        edEmail=findViewById(R.id.edEmail);
        edPassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = edEmail.getText().toString();
                password = edPassword.getText().toString();

                //mengeset email yang benar

                if (edEmail.getText().toString().equals("admin") && edPassword.getText().toString().equals("123"))

                    Toast.makeText(getApplicationContext(),"Login Sukses", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(getApplicationContext(),"Username atau Password Anda Salah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}

