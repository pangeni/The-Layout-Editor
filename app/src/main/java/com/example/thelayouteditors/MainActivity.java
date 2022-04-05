package com.example.thelayouteditors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private int count;
    private Button btn1, btn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.show_count);
        btn1 = findViewById(R.id.button_count);
        btn2 = findViewById(R.id.zero);


    }

    public void Toast(View view) {
        Toast.makeText(MainActivity.this, "Hello Toast", Toast.LENGTH_LONG).show();
        text.setText(""+ count);
    }

    public void Count(View view) {
        btn1.setBackgroundResource(R.color.green);
        btn2.setBackgroundResource(R.color.red);
        count++ ;
        text.setText(""+ count);

    }

    public void Zero(View view) {
        btn1.setBackgroundResource(R.color.teal_200);
        btn2.setBackgroundResource(R.color.grey);
        count = 0 ;
        text.setText(""+ count);
    }
}




