package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pindah extends AppCompatActivity implements View.OnClickListener {

        private Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah);

        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent kembali = new Intent(Pindah.this, Isi.class);
        startActivity(kembali);
        finish();
    }
}
