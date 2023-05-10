package com.example.smartkartapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class About extends AppCompatActivity {
    Button fb,tw,wa,ld,gt,ig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        fb=findViewById(R.id.fb);
        gt=findViewById(R.id.gt);
        wa=findViewById(R.id.wa);
        tw=findViewById(R.id.tw);
        ig=findViewById(R.id.ig);
        ld=findViewById(R.id.ld);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/hacktiv8id/?hl=en"));
                startActivity(intent);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://web.facebook.com/hacktiv8id/?_rdc=1&_rdr"));
                startActivity(intent);
            }
        });

        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/KadekAgga"));
                startActivity(intent);
            }
        });

        ld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("hhttps://www.linkedin.com/in/i-kadek-agga-sugitha-3087bb211/"));
                startActivity(intent);
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/hacktiv8id?lang=en"));
                startActivity(intent);
            }
        });

        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://chat.whatsapp.com/J1xhF5p9TX311aWLoHJLc7"));
                startActivity(intent);
            }
        });
    }
}