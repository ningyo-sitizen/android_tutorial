package com.example.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bangun_datar_output extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangun_datar_output);
        TextView keliling_hasil = findViewById(R.id.vHasilKeliling);
        TextView luas_hasil = findViewById(R.id.vHasilLuas);
        Intent intent = getIntent();
        String keliling = (String) intent.getSerializableExtra("keliling");
        String luas = (String) intent.getSerializableExtra("luas");

        keliling_hasil.setText(keliling);
        luas_hasil.setText(luas);
    }
}
