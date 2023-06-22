package com.example.arabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox rememberCheckBox;
    private Button loginButton;
    private TextView usernameEditText;
    private TextView passwordEditText;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rememberCheckBox = findViewById(R.id.remember_checkbox);
        loginButton = findViewById(R.id.login_button);
        usernameEditText = findViewById(R.id.username_edittext);
        passwordEditText = findViewById(R.id.password_edittext);
        sharedPreferences = getSharedPreferences("com.example.arabic", MODE_PRIVATE);

        // Load saved credentials if "Remember Me" is checked
        boolean rememberMe = sharedPreferences.getBoolean("rememberMe", false);
        if (rememberMe) {
            String savedUsername = sharedPreferences.getString("username", "");
            String savedPassword = sharedPreferences.getString("password", "");
            usernameEditText.setText(savedUsername);
            passwordEditText.setText(savedPassword);
            rememberCheckBox.setChecked(true);
        }

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Simulate login process
                // Replace with your actual login logic
                boolean loginSuccessful = performLogin(username, password);

                if (loginSuccessful) {
                    if (rememberCheckBox.isChecked()) {
                        // Save credentials if "Remember Me" is checked
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putBoolean("rememberMe", true);
                        editor.putString("username", username);
                        editor.putString("password", password);
                        editor.apply();
                    } else {
                        // Clear saved credentials if "Remember Me" is unchecked
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putBoolean("rememberMe", false);
                        editor.remove("username");
                        editor.remove("password");
                        editor.apply();
                    }

                    // Navigate to the next activity
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean performLogin(String username, String password) {
        // Implement your actual login logic here
        // This is just a dummy implementation for demonstration purposes
        return username.equals("Aya") && password.equals("123a");
    }
}
