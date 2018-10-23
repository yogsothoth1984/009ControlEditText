package com.example.a009controledittext.Listener;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class List_Verificar_con_Intent implements View.OnClickListener {

    private Context context;

    public List_Verificar_con_Intent(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {

        //intent
        if (clave.length()==0){//El método length() de la clase String sirve para ver cuantos caracteres se ingresaron.
            Toast.makeText(contextListener,"La clave no puede quedar vacia",Toast.LENGTH_LONG).show();
        }if (usuario.length()==0){
            Toast.makeText(contextListener,"El usuario no puede quedar vacia",Toast.LENGTH_LONG).show();
        }
    }
}
