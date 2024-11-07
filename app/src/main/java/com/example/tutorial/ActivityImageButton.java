package com.example.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityImageButton extends Activity {
    ImageButton imgButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_imagebutton);
        imgButton =(ImageButton)findViewById(R.id.imageButton);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Toast adalah pop up info yang yang muncul hanya sesaat
// Toast tidak memerlukan aksi pengguna (akan hilang sendiri)
                Toast.makeText(getApplicationContext(),"You click the IMAGE", Toast.LENGTH_LONG).show();
            }
        });
    }
}
