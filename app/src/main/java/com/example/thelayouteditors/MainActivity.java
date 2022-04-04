package com.example.thelayouteditors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.show_count);

    }

    public void Toast(View view) {
        Toast.makeText(MainActivity.this, "Hello Toast", Toast.LENGTH_LONG).show();
        text.setText(""+ count);
    }

    public void Count(View view) {
        count++ ;
        text.setText(""+ count);
    }

    public void Zero(View view) {
        count = 0 ;
        text.setText(""+ count);
    }
}




