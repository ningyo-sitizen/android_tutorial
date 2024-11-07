package com.example.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityIntentFilter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentfilter);
        Button btnSend = (Button) findViewById(R.id.sendMail);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Membuat objek Intent
                Intent si = new Intent(Intent.ACTION_SEND);
// Mengatur MIME Type
                si.setType("message/rfc822");
// Mengatur data nilai untuk Alamat E-Mail
                si.putExtra(Intent.EXTRA_EMAIL, new String[]{"hulutirta@gmail.com"});
// Mengatur data nilai untuk Subject E-Mail
                si.putExtra(Intent.EXTRA_SUBJECT, "Welcome Wibu PNJ 3se1");
// Mengatur data nilai untuk Badan E-Mail
                si.putExtra(Intent.EXTRA_TEXT, "NAMA: Zuriel Joseph Jowy mone");
/* Menjalankan Activity dengan parameter fungsi createChooser dengan
parameter objek Intent */
                startActivity(Intent.createChooser(si, "Choose Mail App"));
            }
        });
    }
}
