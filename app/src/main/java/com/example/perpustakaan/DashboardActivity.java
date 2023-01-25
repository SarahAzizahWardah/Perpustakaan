package com.example.perpustakaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    ImageView imageview_20;
    ImageView imageview_21;
    ImageView image_view1;
    ImageView image_view22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        imageview_20 = findViewById(R.id.image_view20);

        imageview_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Data = new Intent(DashboardActivity.this,DataActivity.class);
                startActivity(Data);
            }
        });

        imageview_21 = findViewById(R.id.image_view21);
        imageview_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Maps = new Intent(DashboardActivity.this,MapsActivity.class);
                startActivity(Maps);
            }
        });

        image_view1 = findViewById(R.id.image_view1);
        image_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Listbuku = new Intent(DashboardActivity.this,RecyclerActivity.class);
                startActivity(Listbuku);
            }
        });
    }
}
