package br.senac.atividade01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercicio04Detalhe extends AppCompatActivity {
    private Button btnSomar;
    private Button btnSubtrair;
    private Button btnMultiplicar;
    private Button btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio04_detalhe);

        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);


        View.OnClickListener somaRetorna = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String cmp1 = intent.getStringExtra("cmp1");
                String cmp2 = intent.getStringExtra("cmp2");

                Double soma = Double.parseDouble(cmp1) + Double.parseDouble(cmp2);

                Intent i = new Intent();
                i.putExtra("resultado", soma);

                setResult(RESULT_OK, i);
                finish();


            }


        };

        View.OnClickListener subRetorna = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String cmp1 = intent.getStringExtra("cmp1");
                String cmp2 = intent.getStringExtra("cmp2");

                Double sub = Double.parseDouble(cmp1) - Double.parseDouble(cmp2);

                Intent i = new Intent();
                i.putExtra("resultado", sub);
                setResult(RESULT_OK, i);
                finish();
            }
        };

        View.OnClickListener subMulti = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String cmp1 = intent.getStringExtra("cmp1");
                String cmp2 = intent.getStringExtra("cmp2");

                Double mult = Double.parseDouble(cmp1) * Double.parseDouble(cmp2);

                Intent i = new Intent();
                i.putExtra("resultado", mult);
                setResult(RESULT_OK, i);
                finish();
            }
        };


        View.OnClickListener subDividir = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String cmp1 = intent.getStringExtra("cmp1");
                String cmp2 = intent.getStringExtra("cmp2");

                Double divi = Double.parseDouble(cmp1) / Double.parseDouble(cmp2);

                Intent i = new Intent();
                i.putExtra("resultado", divi);
                setResult(RESULT_OK, i);
                finish();
            }
        };

            btnSomar.setOnClickListener(somaRetorna);
            btnSubtrair.setOnClickListener(subRetorna);
            btnMultiplicar.setOnClickListener(subMulti);
            btnDividir.setOnClickListener(subDividir);

    }
}


