package com.example.myathenaapphack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySignUpPageSeller extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page_seller);
        button = (Button) findViewById(R.id.buttonSignUpVerify);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUpPC();
            }
        });

    }

    public void openSignUpPC(){
        Intent intent = new Intent(this, ProfileCompanyActivity.class);
        startActivity(intent);
    }

}