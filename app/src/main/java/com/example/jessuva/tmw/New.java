package com.example.jessuva.tmw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class New extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent bs = getIntent();

        String g = bs.getStringExtra("user");

        TextView aaa = findViewById(R.id.textView);

        aaa.setText(g);

    }
}
