package tn.isims.studenthubtn.tp.studenthub;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText email = findViewById(R.id.etEmail);
        EditText password = findViewById(R.id.etPassword);
        Button loginBtn = findViewById(R.id.btnLogin);
        TextView registerLink = findViewById(R.id.tvRegisterLink);

        loginBtn.setOnClickListener(v -> {

        });

        registerLink.setOnClickListener(v -> {

        });
    }
}