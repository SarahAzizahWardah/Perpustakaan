package com.example.perpustakaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TampilActivity extends AppCompatActivity {

    TextView Tbuku, Tpinjam, Tkembalian;
    String tampil_buku, tampil_pinjam, tampil_kembalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil_data);
        Tbuku = (TextView)findViewById(R.id.tampilbuku);
        Tpinjam = (TextView)findViewById(R.id.tampilpinjam);
        Tkembalian = (TextView)findViewById(R.id.tampilkembali);

        Bundle b = getIntent().getExtras();

        tampil_buku = b.getString("parse_buku");
        tampil_pinjam = b.getString("parse_pinjam");
        tampil_kembalian = b.getString("parse_kembalian");

        Tbuku.setText(""+tampil_buku);
        Tpinjam.setText(""+tampil_pinjam);
        Tkembalian.setText(""+tampil_kembalian);

        Button kembali = (Button) findViewById(R.id.button);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                i = new Intent(TampilActivity.this, InputActivity.class);
                startActivity(i);
            }
        });
    }
}
