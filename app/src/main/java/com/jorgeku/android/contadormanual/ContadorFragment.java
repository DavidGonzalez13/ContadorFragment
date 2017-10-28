package com.jorgeku.android.contadormanual;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;

/**
 * Created by david on 27/10/2017.
 */

public class ContadorFragment extends Fragment {

    private Button mBotonContar, mBotonReiniciar;
    private EditText mTextoContar;
    int mcontar = 0;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragmento_contador,container,false);



        mBotonContar = (Button) v.findViewById(R.id.BotonContar);
        mBotonReiniciar = (Button)v. findViewById(R.id.BotonReiniciar);
        mTextoContar = (EditText)v. findViewById(R.id.Incrementa);

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcontar++;
                mTextoContar.setText(mcontar + "");

            }
        }); return v;
    }

    public void reiniciar (View v){

        mcontar=0;
        mTextoContar.setText("0");

    }

}
