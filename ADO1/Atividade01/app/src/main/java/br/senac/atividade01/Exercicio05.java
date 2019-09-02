package br.senac.atividade01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Exercicio05 extends AppCompatActivity {
    private EditText txtCampo1;
    private EditText txtCampo2;
    private EditText txtResultado;
    private RadioButton RadioButtonSomar;
    private RadioButton RadioButtonSubtracao;
    private RadioButton RadioButtonMultiplicar;
    private RadioButton RadioButtonDivisao;
    private Button   btnSomar;
    double valor1, valor2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio05);

        txtCampo1 = findViewById(R.id.txtCampo1);
        txtCampo2 = findViewById(R.id.txtCampo2);
        txtResultado = findViewById(R.id.txtResultado);
        RadioButtonSomar = findViewById(R.id.RadioButtonSomar);
        RadioButtonSubtracao = findViewById(R.id.RadioButtonSubtracao);
        RadioButtonMultiplicar = findViewById(R.id.RadioButtonMultiplicar);
        RadioButtonDivisao = findViewById(R.id.RadioButtonDivisao);
        btnSomar = findViewById(R.id.btnSomar);



        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                if (RadioButtonSomar.isChecked()) {
                    try {
                        valor2 = Double.parseDouble(txtCampo1.getText().toString());
                    } catch (NumberFormatException e) {
                        showDialog("Erro", "Campo 2 incorreto!");
                    }

                    try {
                        valor1 = Double.parseDouble(txtCampo2.getText().toString());
                    } catch (NumberFormatException e) {
                        showDialog("Erro", "Campo 1 incorreto!");

                    }
                    double result1 = valor1 + valor2;
                    txtResultado.setText(String.valueOf(result1));
                }


                if (RadioButtonSubtracao.isChecked()) {
                    try {
                        valor2 = Double.parseDouble(txtCampo1.getText().toString());
                    } catch (NumberFormatException e) {
                        showDialog("Erro", "Campo 2 incorreto!");
                    }

                    try {
                        valor1 = Double.parseDouble(txtCampo2.getText().toString());
                    } catch (NumberFormatException e) {
                        showDialog("Erro", "Campo 1 incorreto!");

                    }
                    double result1 = valor1 - valor2;
                    txtResultado.setText(String.valueOf(result1));
                }

                if (RadioButtonMultiplicar.isChecked()) {
                    try {
                        valor2 = Double.parseDouble(txtCampo1.getText().toString());
                    } catch (NumberFormatException e) {
                        showDialog("Erro", "Campo 2 incorreto!");
                    }

                    try {
                        valor1 = Double.parseDouble(txtCampo2.getText().toString());
                    } catch (NumberFormatException e) {
                        showDialog("Erro", "Campo 1 incorreto!");

                    }
                    double result1 = valor1 * valor2;
                    txtResultado.setText(String.valueOf(result1));
                }

                if (RadioButtonDivisao.isChecked()) {
                    try {
                        valor2 = Double.parseDouble(txtCampo1.getText().toString());
                    } catch (NumberFormatException e) {
                        showDialog("Erro", "Campo 2 incorreto!");
                    }

                    try {
                        valor1 = Double.parseDouble(txtCampo2.getText().toString());
                    } catch (NumberFormatException e) {
                        showDialog("Erro", "Campo 1 incorreto!");

                    }
                    double result1 = valor1 / valor2;
                    txtResultado.setText(String.valueOf(result1));




                           }

                    }
                };
                btnSomar.setOnClickListener(listener);

}
    public void showDialog(String message, String title) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Exercicio05.this);
        builder.setMessage(message);
        builder.setTitle(title);
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}
