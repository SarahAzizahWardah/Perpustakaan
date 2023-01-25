package com.example.perpustakaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {

    String Buku,Tanggal_Pinjam,Tanggal_kembalian;
    EditText Inputbuku,Inputpinjam,Inputkembalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_data);

        Inputbuku = (EditText) findViewById(R.id.buku);
        Inputpinjam = (EditText) findViewById(R.id.pinjam);
        Inputkembalian = (EditText) findViewById(R.id.kembali);

        Button submit = (Button)findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buku = Inputbuku.getText().toString();
                Tanggal_Pinjam = Inputpinjam.getText().toString();
                Tanggal_kembalian = Inputkembalian.getText().toString();
                Intent i = null;
                i = new Intent(InputActivity.this,TampilActivity.class);
                Bundle b = new Bundle();
                b.putString("parse_buku",Buku);
                b.putString("parse_pinjam",Tanggal_Pinjam);
                b.putString("parse_kembalian",Tanggal_kembalian);

                i.putExtras(b);
                startActivity(i);
            }
        });


    }
}
