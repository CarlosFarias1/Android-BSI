package br.senac.atividade01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Exercicio03 extends AppCompatActivity {

    private EditText txtNome;
    private EditText txtSobrenome;
    private Button btnConfirmar;
    private RadioButton Masculino;
    private RadioButton Feminino;
    private RadioButton Solteiro;
    private RadioButton Casado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio03);

        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        Masculino = findViewById(R.id.Masculino);
        Feminino = findViewById(R.id.Feminino);
        Solteiro = findViewById(R.id.Solteiro);
        Casado = findViewById(R.id.Casado);

        btnConfirmar = findViewById(R.id.btnConfirmar);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = txtNome.getText().toString();
                String sobrenome = txtSobrenome.getText().toString();
                String nome1 = txtNome.getText().toString();
                String sobrenome1 = txtSobrenome.getText().toString();


                    if (Feminino.isChecked() && Casado.isChecked()) {
                        showDialog("\n Sra. " + nome + " " + sobrenome + "\n Estado Civil: Casada " + " \n Genêro: Feminino ", "Bem vinda");
                    } else if (Feminino.isChecked() && Solteiro.isChecked()) {
                        showDialog("\n Sra. " + nome + " " + sobrenome + "\n Estado Civil: Solteira " + " \nGenêro: Feminino", "Bem vinda");

                    }else if (Masculino.isChecked() && Casado.isChecked()) {
                            showDialog("\n Sr. " + nome1 + " " + sobrenome1 + " \nEstado Civil: Casado " + " \nGenêro: Masculino", "Bem vindo");
                    } else if (Masculino.isChecked() && Solteiro.isChecked()) {
                            showDialog("\n Sr. " + nome1 + " " + sobrenome1 + " \nEstado Civil: Solteiro " + " \nGenêro: Masculino", "Bem vindo");


                    } else {
                    showDialog("Erro", "Selecione ás opções!");
                    }


                if (!nome.trim().equals("") && !sobrenome.trim().equals("") && !nome1.trim().equals("") && !sobrenome1.trim().equals("")) {

                } else {
                    showDialog("Erro", "Os campos estão vazio!");

                }

            }
        };

        btnConfirmar.setOnClickListener(listener);

    }
        private void showDialog(String message, String title){
            AlertDialog.Builder builder = new AlertDialog.Builder(Exercicio03.this);
            builder.setMessage(message);
            builder.setTitle(title);

            builder.setCancelable(false);

            builder.setPositiveButton("OK", null);

            AlertDialog dialog = builder.create();

            dialog.show();


        }

}
