package com.example.a009controledittext.Listener;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class Listener_Verificar implements View.OnClickListener {

    private Context contextListener;

    public Listener_Verificar(Context contextListener) {
        this.contextListener = contextListener;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(contextListener,"boton verificar",Toast.LENGTH_SHORT).show();
    }
}
