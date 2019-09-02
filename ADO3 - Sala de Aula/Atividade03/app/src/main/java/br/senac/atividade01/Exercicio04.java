package br.senac.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio04 extends AppCompatActivity {
    private EditText txtValor1;
    private EditText txtValor2;
    private EditText txtResultado;
    private Button btnOperacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio04);

        txtValor1 = findViewById(R.id.txtValor1);
        txtValor2 = findViewById(R.id.txtValor2);
        txtResultado = findViewById(R.id.txtResultado);
        btnOperacao = findViewById(R.id.btnOperacao);

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Exercicio04.this, Exercicio04Detalhe.class);
                intent.putExtra("cmp1", txtValor1.getText().toString());
                intent.putExtra("cmp2", txtValor2.getText().toString());

                startActivityForResult(intent, 1);

            }


        };
        btnOperacao.setOnClickListener(listener);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {

            if (resultCode == RESULT_OK) {
                Double resultado = data.getDoubleExtra("resultado", 0);
                txtResultado.setText(" " + resultado);
            }
        }
    }

}
