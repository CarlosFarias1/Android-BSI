package br.senac.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio03 extends AppCompatActivity {

    private EditText editTextCampo;
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio03);

        editTextCampo = findViewById(R.id.editTextCampo);
        buttonEnviar = findViewById(R.id.buttonEnviar);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Exercicio03.this, Exercicio03Detalhe.class);

                intent.putExtra("Nome", editTextCampo.getText().toString());
                startActivity(intent);
            }
        };
        buttonEnviar.setOnClickListener(listener);
    }
}
