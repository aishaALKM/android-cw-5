package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name=findViewById(R.id.editTextTextPersonName3);
        TextView age=findViewById(R.id.editTextTextPersonName);


        Bundle aisha = getIntent().getExtras();
        String sara = aisha.getString ("info");

        String h = aisha.getString ("inf");
        name.setText(sara);
        age.setText(h);

        Button v = findViewById(R.id.button);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent( MainActivity2.this,MainActivity.class);
                startActivity(p);

            }
        });


    }
}