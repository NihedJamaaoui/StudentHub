package tn.isims.studenthubtn.tp.studenthub;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnMatieres = findViewById(R.id.btnMatieres);
        Button btnTaches   = findViewById(R.id.btnTaches);
        Button btnEcheances= findViewById(R.id.btnEcheances);
        Button btnProfil   = findViewById(R.id.btnProfil);

        btnMatieres.setOnClickListener(v -> {});
        btnTaches.setOnClickListener(v -> {});
        btnEcheances.setOnClickListener(v -> {});
        btnProfil.setOnClickListener(v -> {});
    }
}