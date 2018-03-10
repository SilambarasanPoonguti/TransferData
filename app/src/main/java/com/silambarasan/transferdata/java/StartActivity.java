package com.silambarasan.transferdata.java;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.silambarasan.transferdata.R;

/**
 * Created by SILAMBARASAN on 3/10/2018.
 */

public class StartActivity extends AppCompatActivity{

    private EditText name;
    private EditText pin;
    private EditText email;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.start_activity_main);

        // Initialize
        name = findViewById(R.id.userName);
        pin = findViewById(R.id.email);
        email = findViewById(R.id.pin);

        // Handling button event
        findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), EndActivity.class);
                nextScreen.putExtra("NAME", name.getText().toString());
                nextScreen.putExtra("PIN", pin.getText().toString());
                nextScreen.putExtra("EMAIL", email.getText().toString());

                //Send data to another Activity
                startActivity(nextScreen);
            }
        });
    }
}
