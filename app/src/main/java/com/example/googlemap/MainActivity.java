package com.example.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.view);
        btn.setOnClickListener(view -> {
            Intent intent= new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:20.5937, 78.9629"));
            Intent chooser= Intent.createChooser(intent,"LAUNCH_MAPS");
            startActivity(chooser);
        });
    }
}