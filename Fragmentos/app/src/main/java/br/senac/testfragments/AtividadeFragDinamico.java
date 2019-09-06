package br.senac.testfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AtividadeFragDinamico extends AppCompatActivity {
    private Button btnFrag1;
    private Button btnFrag2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_frag_dinamico);

        btnFrag1 = findViewById(R.id.btnFrag1);
        btnFrag2 = findViewById(R.id.btnFrag2);

        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TesteFragmentos01 fragmento = new TesteFragmentos01();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, fragmento).commit();
            }
        });

        btnFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TesteFragmentos02 fragmento = new TesteFragmentos02();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, fragmento).commit();
            }
        });

    }
}
