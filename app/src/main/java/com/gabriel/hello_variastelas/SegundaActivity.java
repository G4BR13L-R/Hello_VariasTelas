package com.gabriel.hello_variastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textView = findViewById(R.id.textView);

        textView.setText("Olá " + getIntent().getStringExtra("Nome"));
    }
}