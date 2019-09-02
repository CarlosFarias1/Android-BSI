package br.senac.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercicio01 extends AppCompatActivity {

    private Button btnClique;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClique = findViewById(R.id.btnClique);

        //Define um listener
        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Exercicio01.this, Exercicio01Detalhe.class);

                startActivity(intent);
            }
        };

        btnClique.setOnClickListener(listener);

    }



}
