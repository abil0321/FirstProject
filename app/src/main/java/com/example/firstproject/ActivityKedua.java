package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        EditText name = (EditText) findViewById(R.id.tw_nama); // -----------------------------------------------------
        EditText address = findViewById(R.id.tw_alamat);
        EditText TTL = findViewById(R.id.tw_lahir);
        EditText email = findViewById(R.id.tw_Mail);
        EditText phone = findViewById(R.id.tw_HP);
        Button submit = findViewById(R.id.btn_submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityKedua.this, Submitted.class);
                intent.putExtra("name_key",name.getText().toString()); // ---------------------------------------------
                intent.putExtra("address_key", address.getText().toString());
                intent.putExtra("TTL_key", TTL.getText().toString());
                intent.putExtra("email_key", email.getText().toString());
                intent.putExtra("phone_key", phone.getText().toString());

                startActivity(intent);
            }
        });

//        Bundle ambil = getIntent().getExtras();
//        if (ambil == null){
//            return;
//        }

//        String alamat = ambil.getString("alamat_key");
//        if (alamat != null){
//            address.setText(alamat);
//        }
    }
}