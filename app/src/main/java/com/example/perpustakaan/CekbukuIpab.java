package com.example.perpustakaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CekbukuIpab extends AppCompatActivity {
    ImageView imageView14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cekbukuipab);

        imageView14 = findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pinjam = new Intent(CekbukuIpab.this,InputActivity.class);
                startActivity(pinjam);
            }
        });
    }
}
