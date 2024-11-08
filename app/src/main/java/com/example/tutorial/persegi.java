package com.example.tutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class persegi extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi_process);
        final EditText firstNum = findViewById(R.id.sisi);
        Button btnHasil = findViewById(R.id.btnHasil);
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Memberi nilai ke dua buah variabel yakni num1 dan num2
// Nilai diambil dari nilai yang dimasukkan pengguna di TextField
                int num1 = Integer.parseInt(firstNum.getText().toString());
// Membuat objek Intent
                Intent intent = new
                        Intent(persegi.this,bangun_datar_output.class);
/* Mendeklarasikan atribut Intent yakni jumlah dengan nilai hasil
penjumlahan num1 dan num2 */
                intent.putExtra("keliling","keliling = "+"4"+" X "+num1+" = "+(4 * num1));
                intent.putExtra("luas","luas = "+num1 + "X"+ num1+"="+(num1*num1));
// Menjalankan activity dengan parameter Intent
                startActivity(intent);
            }
        });
    }
}
