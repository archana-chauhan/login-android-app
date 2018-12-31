package com.example.glitzstar.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        ImageButton btn;
//        final TextView textView;
       btn =  findViewById(R.id.submit);
//       textView = findViewById(R.id.ontime_textview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), NewActivity.class);
                startActivity(i);


//                Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();
            }
        });




    }
}
