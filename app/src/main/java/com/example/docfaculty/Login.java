package com.example.docfaculty;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {
    private EditText facultyIdEditText;
    private EditText facultyPasswordEditText;
    private Button facultyLoginButton;
    private Button facultyRegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        facultyIdEditText = findViewById(R.id.facultyIdEditText);
        facultyPasswordEditText = findViewById(R.id.facultyPasswordEditText);
        facultyLoginButton = findViewById(R.id.facultyLoginButton);
        facultyRegisterButton = findViewById(R.id.facultyRegisterButton);

        facultyLoginButton.setOnClickListener(v -> {
            String facultyId = facultyIdEditText.getText().toString();
            String password = facultyPasswordEditText.getText().toString();

            if (TextUtils.isEmpty(facultyId) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Please enter Faculty ID and Password", Toast.LENGTH_SHORT).show();
            } else {
                // Here you would normally validate the user credentials against a database or API
                // For this example, we'll just simulate a successful login
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish(); // Prevent going back to login screen
            }
        });
        facultyRegisterButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}