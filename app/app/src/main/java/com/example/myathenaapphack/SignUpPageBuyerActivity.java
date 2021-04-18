package com.example.myathenaapphack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpPageBuyerActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page_buyer);

        button = (Button) findViewById(R.id.buttonSignUpVerify);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openVerify();
        }
    });

}

    public void openVerify(){
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
    }
}