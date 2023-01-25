package com.example.perpustakaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MatematikaActivity extends AppCompatActivity {

    ImageView image2;
    ImageView imageb;
    ImageView imagec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matematika);

        image2 = findViewById(R.id.image2);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MatematikaActivity.this,CekbukuActivity.class);
                startActivity(a);
            }
        });
        imageb = findViewById(R.id.imageb);
        imageb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MatematikaActivity.this,CekbukuMtkb.class);
                startActivity(b);
            }
        });
        imagec = findViewById(R.id.imagec);
        imagec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MatematikaActivity.this,CekbukuMtkc.class);
                startActivity(c);
            }
        });
    }
}
