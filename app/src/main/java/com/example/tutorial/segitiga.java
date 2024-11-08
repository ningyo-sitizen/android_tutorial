package com.example.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class segitiga extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);
        final EditText sisi_in = findViewById(R.id.sisi_input);
        final EditText tinggi_in = findViewById(R.id.tinggi_input);

        Button btnhasil = findViewById(R.id.btnHasil);
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sisi = Integer.parseInt(sisi_in.getText().toString());
                int tinggi = Integer.parseInt(tinggi_in.getText().toString());

                Intent intent = new Intent(segitiga.this,bangun_datar_output.class);

                intent.putExtra("keliling", "keliling = " + sisi + " + " + sisi + " + " + sisi + " = " + (sisi * 3));
                intent.putExtra("luas", "luas = 1/2 X " + sisi + " X " + tinggi + " = " + (0.5 * sisi * tinggi));

                startActivity(intent);

            }
        });
    }
}
