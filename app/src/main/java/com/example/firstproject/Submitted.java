package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Submitted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submitted);

        TextView nama1 = findViewById(R.id.tw_name1);
        TextView alamat1 = findViewById(R.id.tw_alamat1);
        TextView TTL1 = findViewById(R.id.tw_born1);
        TextView email1 = findViewById(R.id.tw_Mail1);
        TextView Hp1 = findViewById(R.id.tw_HP);

        nama1.setText("hai");
        Bundle take = getIntent().getExtras();
        if (take == null){
            return;
        }

        String cname = take.getString("name_key");
        if (cname != null){
            nama1.setText(cname);
        }

        String calamat = take.getString("address_key");
        if (calamat != null){
            alamat1.setText(calamat);
        }
        String cttl = take.getString("TTL_key");
        if (cttl != null){
            TTL1.setText(cttl);
        }
        String cemail = take.getString("email_key");
        if (cemail != null){
            email1.setText(cemail);
        }
        String chp = take.getString("phone_key");
        if (chp != null){
            Hp1.setText(chp);
        }

        }
    }
