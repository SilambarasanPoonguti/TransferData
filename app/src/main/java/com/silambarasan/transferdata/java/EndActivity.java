package com.silambarasan.transferdata.java;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.silambarasan.transferdata.R;

/**
 * Created by SILAMBARASAN on 3/10/2018.
 */

public class EndActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.end_activity_main);

        TextView txtName = (TextView) findViewById(R.id.name);
        TextView txtPin = (TextView) findViewById(R.id.pin);
        TextView txtEmail = (TextView) findViewById(R.id.email);

        Intent i = getIntent();
        // Get all the Data from start activity
        String name = i.getStringExtra("NAME");
        String email = i.getStringExtra("EMAIL");
        String pin = i.getStringExtra("PIN");

        // Displaying Received data
        txtName.setText(name);
        txtPin.setText(pin);
        txtEmail.setText(email);

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
