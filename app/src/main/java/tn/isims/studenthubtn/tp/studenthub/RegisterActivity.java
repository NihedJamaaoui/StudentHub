package tn.isims.studenthubtn.tp.studenthub;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText nom = findViewById(R.id.etNom);
        EditText prenom = findViewById(R.id.etPrenom);
        EditText email = findViewById(R.id.etRegEmail);
        EditText password = findViewById(R.id.etRegPassword);
        Button createBtn = findViewById(R.id.btnCreateAccount);

        createBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
    }
}