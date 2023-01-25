package com.example.perpustakaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class DataActivity extends AppCompatActivity{
    ImageView image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        image2 = findViewById(R.id.image2);

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bukua = new Intent(DataActivity.this,CekbukuActivity.class);
                startActivity(Bukua);
            }
        });
    }
}

