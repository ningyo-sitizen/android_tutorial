package com.example.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bangun_datar_output extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangun_datar_output);
//        Button btn = findViewById(R.id.btnkembali);
        TextView keliling_hasil = findViewById(R.id.vHasilKeliling);
        TextView luas_hasil = findViewById(R.id.vHasilLuas);
        Intent intent = getIntent();
        String keliling = (String) intent.getSerializableExtra("keliling");
        String luas = (String) intent.getSerializableExtra("luas");

        keliling_hasil.setText(keliling);
        luas_hasil.setText(luas);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(bangun_datar_output.this, bangundatar_input.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
//                finish();
//            }
//        });

    }
}
