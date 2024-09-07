package com.example.reg3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reg3.R;

public class MainActivity2 extends AppCompatActivity {

    private TextView firstNameTextView, lastNameTextView, emailTextView, phoneTextView, passwordTextView, dobTextView, genderTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialize views
        firstNameTextView = findViewById(R.id.firstNameTextView);
        lastNameTextView = findViewById(R.id.lastNameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        passwordTextView = findViewById(R.id.passwordTextView);
        dobTextView = findViewById(R.id.dobTextView);
        genderTextView = findViewById(R.id.genderTextView);

        // Load and display user data
        loadData();
    }

    private void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences("UserDetails", MODE_PRIVATE);

        String firstName = sharedPreferences.getString("FirstName", "Not Available");
        String lastName = sharedPreferences.getString("LastName", "Not Available");
        String email = sharedPreferences.getString("Email", "Not Available");
        String phone = sharedPreferences.getString("Phone", "Not Available");
        String password = sharedPreferences.getString("Password", "Not Available");
        String dob = sharedPreferences.getString("DOB", "Not Available");
        String gender = sharedPreferences.getString("Gender", "Not Available");

        firstNameTextView.setText("First Name: " + firstName);
        lastNameTextView.setText("Last Name: " + lastName);
        emailTextView.setText("Email: " + email);
        phoneTextView.setText("Phone: " + phone);
        passwordTextView.setText("Password: " + password);
        dobTextView.setText("Date of Birth: " + dob);
        genderTextView.setText("Gender: " + gender);
    }
}


