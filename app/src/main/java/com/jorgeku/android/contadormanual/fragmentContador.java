package com.jorgeku.android.contadormanual;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by david on 27/10/2017.
 */

public class fragmentContador extends Fragment {
    private final String KEY_CONTEO = "inicio";
    private EditText mContador;
    private Button mBotoncontar,mBotonreiniciar;
    int inicio=0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragmento_contador, container, false);

        mContador = (EditText) v.findViewById(R.id.Incrementa);
        mBotoncontar = (Button) v.findViewById(R.id.BotonContar);
        mBotonreiniciar = (Button) v.findViewById(R.id.BotonReiniciar);

        mBotoncontar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inicio++;
                mContador.setText(inicio+"");
            }
        });
        mBotonreiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inicio = 0;
                mContador.setText("0");
            }
        });


        return v;



    }
}
