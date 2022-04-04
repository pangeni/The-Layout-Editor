package com.example.thelayouteditors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3 ;
    private TextView text;
    private int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button_count);
        button2 = findViewById(R.id.button_toast);
        button3 = findViewById(R.id.zero);

        text = findViewById(R.id.show_count);

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
                text.setText(""+ count);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0 ;
                text.setText(""+ count);
            }
        });
    }
}




