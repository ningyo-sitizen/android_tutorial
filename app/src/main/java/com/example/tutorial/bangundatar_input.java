package com.example.tutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class bangundatar_input extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangundatar_input);
        ImageButton persegi_image= findViewById(R.id.persegi_btn);//memberikan nilai variable
        persegi_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bangundatar_input.this, Bangun_datar_process.class);
                intent.putExtra("tipe","persegi");
                startActivity(intent);
            }
        });
        ImageButton persegiPanjang_image= findViewById(R.id.persegiPanjang_btn);
        persegiPanjang_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bangundatar_input.this, Bangun_datar_process.class);
                intent.putExtra("tipe","persegipanjang");
                startActivity(intent);
            }
        });
        ImageButton segitiga= findViewById(R.id.segitia_btn);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bangundatar_input.this, Bangun_datar_process.class);
                intent.putExtra("tipe","segitiga");
                startActivity(intent);
            }
        });
        ImageButton lingkaran= findViewById(R.id.lingkaran_btn);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bangundatar_input.this, Bangun_datar_process.class);
                intent.putExtra("tipe","lingkaran");
                startActivity(intent);
            }
        });
    }
}
