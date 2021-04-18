package com.example.myathenaapphack;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttonTest;

    public static final String EXTRA_MESSAGE = "com.example.myathenaapphack.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.myathenaapphack.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUp();
            }
        });

    }

    public void openSignUp(){
        Intent intent = new Intent(this, SignUpPageActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);


    }

    public void sendMessage2(View view) {

        Intent intent2 = new Intent(this, DisplayMessageActivity.class);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String message2 = editText2.getText().toString();
        intent2.putExtra(EXTRA_MESSAGE2, message2);
        startActivity(intent2);
    }
}
