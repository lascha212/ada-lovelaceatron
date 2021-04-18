package com.example.myathenaapphack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpPageActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        button = (Button) findViewById(R.id.buttonWannaBuy);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBuyerSignUp();
            }
        });

        button2 = (Button) findViewById(R.id.buttonSignUpVerify);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSellerSignUp();
            }
        });

    }

    public void openBuyerSignUp(){
        Intent intent = new Intent(this, SignUpPageBuyerActivity.class);
        startActivity(intent);
    }

    public void openSellerSignUp(){
        Intent intent2 = new Intent(this, ActivitySignUpPageSeller.class);
        startActivity(intent2);
    }
}