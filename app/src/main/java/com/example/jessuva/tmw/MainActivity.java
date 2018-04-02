package com.example.jessuva.tmw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText a;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        a = (EditText) findViewById(R.id.txt);
    }

    public void func(View v){

        String tes=a.getText().toString();

        Toast.makeText(v.getContext(),tes,Toast.LENGTH_LONG).show();

        Intent dav = new Intent(v.getContext(),New.class);

        dav.putExtra("user",tes);

        startActivity(dav);


    }
}
