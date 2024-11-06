package com.example.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;


import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    EditText eText;
    Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_2);
        eText = (EditText) findViewById(R.id.textId);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            // RESPON UNTUK AKSI KLIK PADA TOMBOL
            public void onClick(View v) {
// MENYIMPAN NILAI TEXT DARI UI KOMPONEN KE VARIABEL
                String str = eText.getText().toString();
// MENAMPILKAN PESAN TOAST
                Toast msg = Toast.makeText(getBaseContext(), str,
                        Toast.LENGTH_LONG);
                msg.show();
            }
        });
    }
}
