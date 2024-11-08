package com.example.tutorial;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class persegi_panjang extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi_panjang);
        final EditText panjang1 = findViewById(R.id.panjang_input);
        final EditText lebar1 = findViewById(R.id.lebar_input);

        Button btn = findViewById(R.id.btnHasil);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int panjang = Integer.parseInt(panjang1.getText().toString());
                int lebar = Integer.parseInt(lebar1.getText().toString());

                Intent intent = new Intent(persegi_panjang.this,bangun_datar_output.class);

                intent.putExtra("keliling","keliling = "+"2"+"X"+"("+panjang+"+"+lebar+")"+"="+(2 * (panjang + lebar)));
                intent.putExtra("luas","luas = " + panjang + "X" + lebar + "=" + (panjang*lebar));

//                intent.putExtra("keliling","keliling = jowy");
//                intent.putExtra("luas","luas = jowy");

                startActivity(intent);

            }
        });
    }
}
