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
        final EditText firstNum = findViewById(R.id.angkaSatu);
        final EditText secNum = findViewById(R.id.angkaDua);
        Button btnAdd = findViewById(R.id.btnTambah);
        btnAdd.setOnClickListener(v -> {
// Memberi nilai ke dua buah variabel yakni num1 dan num2
// Nilai diambil dari nilai yang dimasukkan pengguna di TextField
            int num1 = Integer.parseInt(firstNum.getText().toString());
            int num2 = Integer.parseInt(secNum.getText().toString());
// Membuat objek Intent
            Intent intent = new Intent(ActivityInput.this,ActivityOutput.class);
/* Mendeklarasikan atribut Intent yakni jumlah dengan nilai hasil
penjumlahan num1 dan num2 */
            intent.putExtra("jumlah",num1+" + "+num2+" = "+(num1+num2));
// Menjalankan activity dengan parameter Intent
                    startActivity(intent);
        });
    }
}