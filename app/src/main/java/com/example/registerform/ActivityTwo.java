package com.example.registerform;

import android.icu.text.StringPrepParseException;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class ActivityTwo extends AppCompatActivity {
    private String name;
    EditText email_input;
    EditText usernamee;
    EditText password_input;
    MaterialButton materialButton;

    private final TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

        }

        @Override
        public void  onTextChanged(CharSequence charSequence, int start, int before, int count) {
            String email = email_input.getText().toString().trim();
            String password = password_input.getText().toString().trim();
            String username = usernamee.getText().toString().trim();

            if (email.isEmpty() || password.isEmpty() || username.isEmpty()) {
                materialButton.setBackgroundColor(getColor(R.color.gray));
            } else {
                materialButton.setBackgroundColor(getColor(R.color.purple_200));
            }
            if(email.toString().equals("admin@gmail.com") && password.toString().equals("admin") && username.toString().equals("admin")){
                    EditText editText = findViewById(R.id.email_input);
                    String text = editText.getText().toString();
                    Toast.makeText(ActivityTwo.this, text, Toast.LENGTH_SHORT).show();
                }
            }



        @Override
        public void afterTextChanged(Editable editable) {

        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




    }

}
