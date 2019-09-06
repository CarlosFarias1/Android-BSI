package br.senac.testfragments;


import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class TesteFragmentos01 extends Fragment {
    private Button btnMensagem;


    public TesteFragmentos01() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teste_fragmentos01, container, false);

        btnMensagem = view.findViewById(R.id.btnMensagem);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessageDialog("Olá", "Você está no"
                + "fragmento 1!");
            }
        };

        btnMensagem.setOnClickListener(listener);

        return view;
    }

    private void showMessageDialog(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", null);
        builder.create().show();

    }

}
