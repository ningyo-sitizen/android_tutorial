package com.example.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityInput extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        Button btnAdd = findViewById(R.id.btnTambah);
        btnAdd.setOnClickListener(v -> {
// Memberi nilai ke dua buah variabel yakni num1 dan num2
// Nilai diambil dari nilai yang dimasukkan pengguna di TextField

// Membuat objek Intent
            Intent intent = new Intent(ActivityInput.this,ActivityOutput.class);
/* Mendeklarasikan atribut Intent yakni jumlah dengan nilai hasil
penjumlahan num1 dan num2 */
            intent.putExtra("tipe","tambah");
// Menjalankan activity dengan parameter Intent
                    startActivity(intent);
        });
        Button btnKali = findViewById(R.id.btnKali);
        btnKali.setOnClickListener(v -> {
// Memberi nilai ke dua buah variabel yakni num1 dan num2
// Nilai diambil dari nilai yang dimasukkan pengguna di TextField

// Membuat objek Intent
            Intent intent = new Intent(ActivityInput.this,ActivityOutput.class);
/* Mendeklarasikan atribut Intent yakni jumlah dengan nilai hasil
penjumlahan num1 dan num2 */
            intent.putExtra("tipe","kali");
// Menjalankan activity dengan parameter Intent
            startActivity(intent);
        });

        Button btnKurang = findViewById(R.id.btnKurang);
        btnKurang.setOnClickListener(v -> {
// Memberi nilai ke dua buah variabel yakni num1 dan num2
// Nilai diambil dari nilai yang dimasukkan pengguna di TextField

// Membuat objek Intent
            Intent intent = new Intent(ActivityInput.this,ActivityOutput.class);
/* Mendeklarasikan atribut Intent yakni jumlah dengan nilai hasil
penjumlahan num1 dan num2 */
            intent.putExtra("tipe","kurang");
// Menjalankan activity dengan parameter Intent
            startActivity(intent);
        });
        Button btnBagi = findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(v -> {
// Memberi nilai ke dua buah variabel yakni num1 dan num2
// Nilai diambil dari nilai yang dimasukkan pengguna di TextField

// Membuat objek Intent
            Intent intent = new Intent(ActivityInput.this,ActivityOutput.class);
/* Mendeklarasikan atribut Intent yakni jumlah dengan nilai hasil
penjumlahan num1 dan num2 */
            intent.putExtra("tipe","bagi");
// Menjalankan activity dengan parameter Intent
            startActivity(intent);
        });

        Button modulo = findViewById(R.id.btnModulo);
        modulo.setOnClickListener(v -> {
// Memberi nilai ke dua buah variabel yakni num1 dan num2
// Nilai diambil dari nilai yang dimasukkan pengguna di TextField

// Membuat objek Intent
            Intent intent = new Intent(ActivityInput.this,ActivityOutput.class);
/* Mendeklarasikan atribut Intent yakni jumlah dengan nilai hasil
penjumlahan num1 dan num2 */
            intent.putExtra("tipe","modulo");
// Menjalankan activity dengan parameter Intent
            startActivity(intent);
        });
    }
}