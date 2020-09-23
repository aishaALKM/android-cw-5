package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a=findViewById(R.id.nextPage);
        final EditText b=findViewById(R.id.name);
        final EditText c=findViewById(R.id.age);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f= b.getText().toString();
                String l= c.getText().toString();
                Intent o = new Intent( MainActivity.this,MainActivity2.class);
                o.putExtra("info",f);
                o.putExtra("inf",l);
                startActivity(o);


            }
        });




    }
}