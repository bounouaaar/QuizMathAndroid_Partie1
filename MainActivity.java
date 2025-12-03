package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber1, txtNumber2, txtResult;
    Button btnAdd, btnSub, btnMul, btnGenerate;

    int n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupération des vues
        txtNumber1 = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);
        txtResult = findViewById(R.id.txtResult);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnGenerate = findViewById(R.id.btnGenerate);

        // Génération initiale
        generateNumbers();

        // Addition
        btnAdd.setOnClickListener(v -> {
            int result = n1 + n2;
            txtResult.setText("Résultat : " + result);
        });

        // Soustraction
        btnSub.setOnClickListener(v -> {
            int result = n1 - n2;
            txtResult.setText("Résultat : " + result);
        });

        // Multiplication
        btnMul.setOnClickListener(v -> {
            int result = n1 * n2;
            txtResult.setText("Résultat : " + result);
        });

        // Nouveau tirage
        btnGenerate.setOnClickListener(v -> generateNumbers());
    }

    // Fonction de génération
    private void generateNumbers() {
        Random rand = new Random();
        n1 = 111 + rand.nextInt(889); // 111 → 999
        n2 = 111 + rand.nextInt(889);

        txtNumber1.setText(String.valueOf(n1));
        txtNumber2.setText(String.valueOf(n2));
        txtResult.setText("Résultat : ");
    }
}
