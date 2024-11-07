package com.example.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityOutput extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        final EditText firstNum = (EditText)findViewById(R.id.angkaSatu);
        final EditText secNum = (EditText)findViewById(R.id.angkaDua);

        Intent intent = getIntent();
        String tipe = (String)intent.getSerializableExtra("tipe");

        if (tipe.equals("tambah")) {
            Button btnHasil = (Button)findViewById(R.id.btnHasil);
            btnHasil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// Memberi nilai ke dua buah variabel yakni num1 dan num2
// Nilai diambil dari nilai yang dimasukkan pengguna di TextField
                    int num1 = Integer.parseInt(firstNum.getText().toString());
                    int num2 = Integer.parseInt(secNum.getText().toString());
// Membuat objek Intent
                    Intent intent = new
                            Intent(ActivityOutput.this,ActivityOutput2.class);
/* Mendeklarasikan atribut Intent yakni jumlah dengan nilai hasil
penjumlahan num1 dan num2 */
                    intent.putExtra("jumlah",num1+" + "+num2+" = "+(num1+num2));
// Menjalankan activity dengan parameter Intent
                            startActivity(intent);
                }
            });
        }


    }
}
