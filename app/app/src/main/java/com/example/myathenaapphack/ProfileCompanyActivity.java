package com.example.myathenaapphack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileCompanyActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_company);
        button = (Button) findViewById(R.id.buttonSettings);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUpPCA();
            }
        });

    }

    public void openSignUpPCA(){
        Intent intent = new Intent(this, SettingsSellerActivity.class);
        startActivity(intent);
    }
}