package br.senac.atividade01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio01 extends AppCompatActivity {
    private EditText txtNome;
    private EditText txtSobrenome;
    private Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio01);

        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        btnConfirmar = findViewById(R.id.btnConfirmar);

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                showDialog("Olá, " +txtNome.getText().toString() + " " +txtSobrenome.getText().toString() + " !", "Bem Vindo");
            }
        };

        btnConfirmar.setOnClickListener(listener);

    }
    private  void showDialog(String message, String title){
        AlertDialog.Builder builder = new AlertDialog.Builder(Exercicio01.this);
        builder.setMessage(message);
        builder.setTitle(title);

        builder.setCancelable(false);
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();

        dialog.show();
    }
}
