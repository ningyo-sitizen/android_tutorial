package com.example.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class lingkaran extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);

        final EditText radius_in = findViewById(R.id.radius);
        Button btnhasil = findViewById(R.id.btnHasil);
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final double pi = 3.14;
                int radius = Integer.parseInt(radius_in.getText().toString());
                Intent intent = new Intent(lingkaran.this,bangun_datar_output.class);

                intent.putExtra("keliling","keliling =" +"2" + "X" + pi + radius + "=" +(2*pi*radius));
                intent.putExtra("luas","luas = " + "2" + "X" + pi +radius+"^"+"2"+"="+(pi*(radius*radius)));
            startActivity(intent);
            }
        });
    }
}
