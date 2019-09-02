package br.senac.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Exercicio03Detalhe extends AppCompatActivity {

    private EditText editTextResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio03_detalhe);

        editTextResul = findViewById(R.id.txtResultado);
        Intent inite = getIntent();
        String aux =  inite.getStringExtra("Nome");
        editTextResul.setText(aux);

    }
}
