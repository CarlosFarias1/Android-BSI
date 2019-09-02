package br.senac.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio02 extends AppCompatActivity {
    private Button buttonAbrirUrl;
    private EditText editTextUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio02);

        buttonAbrirUrl = findViewById(R.id.buttonAbrirUrl);
        editTextUrl = findViewById(R.id.editTextUrl);

        //Define um listener
        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:// "+editTextUrl.getText().toString()));

                startActivity(intent);
            }
        };
        buttonAbrirUrl.setOnClickListener(listener);
    }
}
