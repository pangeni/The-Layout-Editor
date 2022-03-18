package com.example.thelayouteditors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2 ;
    private TextView text;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.Count);
        button2 = findViewById(R.id.toast);

        text = findViewById(R.id.score);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++ ;
                text.setText(""+ count);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Toast", Toast.LENGTH_LONG).show();
                count = 0 ;
                text.setText(""+ count);
            }
        });

    }
}