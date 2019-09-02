package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Isi extends AppCompatActivity implements View.OnClickListener{

        private Button sms,pindah,dial,google,kamera,lokasi,instagram;
        private ImageView rpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi);

        pindah = findViewById(R.id.pindah);
        dial = findViewById(R.id.dial);
        google = findViewById(R.id.google);
        kamera = findViewById(R.id.kamera);
        lokasi = findViewById(R.id.lokasi);
        sms = findViewById(R.id.sms);
        instagram = findViewById(R.id.instagram);
        rpl = findViewById(R.id.rpl);

        rpl.setOnClickListener(this);
        instagram.setOnClickListener(this);
        sms.setOnClickListener(this);
        lokasi.setOnClickListener(this);
        kamera.setOnClickListener(this);
        pindah.setOnClickListener(this);
        google.setOnClickListener(this);
        dial.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pindah:
            Intent pindah = new Intent(Isi.this, Pindah.class);
            startActivity(pindah);
                break;

            case R.id.dial:
                String nomor = "0895330893499";
                Intent dial = new Intent(Intent.ACTION_DIAL);
                dial.setData(Uri.fromParts("tel",nomor,null));
                startActivity(dial);
                break;

            case R.id.google:
                String url = "https://google.com";
                Intent google = new Intent(Intent.ACTION_VIEW);
                google.setData(Uri.parse(url));
                startActivity(google);

                break;

            case R.id.kamera:
                Intent kamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(kamera);

                break;

            case R.id.lokasi:
                Intent lokasi = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-6.851758,107.550654"));
                startActivity(lokasi);
                break;

            case R.id.sms:
                Intent sms = new Intent(Intent.ACTION_SENDTO);
                sms.setData(Uri.parse("smsto:08574048244"));
                sms.putExtra("sms_body","Assalamualikum");
                startActivity(sms);
                break;

            case R.id.instagram:
                String ardi = "https://instagram.com/ardiansyahd__";
                Intent ig = new Intent(Intent.ACTION_VIEW);
                ig.setData(Uri.parse(ardi));
                startActivity(ig);
                break;

            case R.id.rpl:
                Intent i = new Intent(Isi.this, Rpl.class);
                startActivity(i);
                break;


        }
    }
}


