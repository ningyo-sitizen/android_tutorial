package com.example.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Bangun_datar_process extends AppCompatActivity {
    EditText panjanginput;
    ImageView image;
    EditText lebarinput;
    TextView txt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi_panjang);
        panjanginput = findViewById(R.id.panjang_input);
        lebarinput = findViewById(R.id.lebar_input);
        image = findViewById(R.id.imageViewpersegipanajng);
        txt = findViewById(R.id.persegipanjang);
        Intent intent = getIntent();
        String tipe = (String)intent.getSerializableExtra("tipe");

        if (tipe.equals("persegi")){
            lebarinput.setVisibility(View.GONE);
            image.setImageResource(R.drawable.persegi);
            txt.setText("persegi");

            Button btnhasil = findViewById(R.id.btnHasil);
            btnhasil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Bangun_datar_process.this,bangun_datar_output.class);
                     int num1 = Integer.parseInt(panjanginput.getText().toString());
                     intent.putExtra("keliling","keliling = "+"4"+" X "+num1+" = "+(4 * num1));
                     intent.putExtra("luas","luas = "+num1 + "X"+ num1+"="+(num1*num1));
                    startActivity(intent);
                }
            });
        } else if (tipe.equals("persegipanjang")) {
            Button btnhasil = findViewById(R.id.btnHasil);
            btnhasil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Bangun_datar_process.this,bangun_datar_output.class);
                    int panjang = Integer.parseInt(panjanginput.getText().toString());
                    int lebar = Integer.parseInt(lebarinput.getText().toString());
                    intent.putExtra("keliling","keliling = "+"2"+"X"+"("+panjang+"+"+lebar+")"+"="+(2 * (panjang + lebar)));
                    intent.putExtra("luas","luas = " + panjang + "X" + lebar + "=" + (panjang*lebar));
                    startActivity(intent);
                }
            });
        }else if (tipe.equals("segitiga")) {
            image.setImageResource(R.drawable.segitiga);
            txt.setText("segitiga");
            Button btnhasil = findViewById(R.id.btnHasil);
            btnhasil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Bangun_datar_process.this,bangun_datar_output.class);
                    int sisi = Integer.parseInt(panjanginput.getText().toString());
                    int tinggi = Integer.parseInt(lebarinput.getText().toString());
                    intent.putExtra("keliling", "keliling = " + sisi + " + " + sisi + " + " + sisi + " = " + (sisi * 3));
                    intent.putExtra("luas", "luas = 1/2 X " + sisi + " X " + tinggi + " = " + (0.5 * sisi * tinggi));
                    startActivity(intent);
                }
            });
        }else if (tipe.equals("lingkaran")) {
            image.setImageResource(R.drawable.lingkaran);
            lebarinput.setVisibility(View.GONE);
            txt.setText("lingkaran");
            Button btnhasil = findViewById(R.id.btnHasil);
            btnhasil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final double pi = 3.14;
                    Intent intent = new Intent(Bangun_datar_process.this,bangun_datar_output.class);
                    int radius = Integer.parseInt(panjanginput.getText().toString());
                    intent.putExtra("keliling","keliling =" +"2" + "X" + pi + radius + "=" +(2*pi*radius));
                    intent.putExtra("luas","luas = " + "2" + "X" + pi +radius+"^"+"2"+"="+(pi*(radius*radius)));
                    startActivity(intent);
                }
            });
        }


    }
}
