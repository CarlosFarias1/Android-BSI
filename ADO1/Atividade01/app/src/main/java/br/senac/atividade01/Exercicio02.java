package br.senac.atividade01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio02 extends AppCompatActivity {

    private EditText txtNome;
    private EditText txtSobrenome;
    private Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio02);

        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        btnConfirmar = findViewById(R.id.btnConfirmar);

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                String nome = txtNome.getText().toString();
                String sobrenome = txtSobrenome.getText().toString();

                if(!nome.equals("") && !sobrenome.equals("")) {
                    showDialog("Olá, " + txtNome.getText().toString() + " " + txtSobrenome.getText().toString() + " !", "Bem vindo");

                }else {
                    showDialog("Erro", "Os campos estão vazios" );
                }

            }
        };
        btnConfirmar.setOnClickListener(listener);
    }
    private void showDialog(String message, String title){
        AlertDialog.Builder builder = new AlertDialog.Builder(Exercicio02.this);
        builder.setMessage(message);
        builder.setTitle(title);

        builder.setCancelable(false);

        builder.setPositiveButton("Ok", null);
        AlertDialog dialog = builder.create();

        dialog.show();
    }
}
