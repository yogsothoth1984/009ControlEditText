package com.example.a009controledittext.Listener;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Listener_Verificar implements View.OnClickListener {

    private Context contextListener;
    private EditText editClave,editUsuario;

    public Listener_Verificar(Context contextListener, EditText editClave, EditText editUsuario) {
        this.contextListener = contextListener;
        this.editClave = editClave;
        this.editUsuario = editUsuario;
    }
    //En este metodo se los paso por parametro del listener
    @Override
    public void onClick(View v) {
        String usuario = editUsuario.getText().toString();
        String clave = editClave.getText().toString();
        if (clave.length()==0){//El método length() de la clase String sirve para ver cuantos caracteres se ingresaron.
            Toast.makeText(contextListener,"La clave no puede quedar vacia",Toast.LENGTH_LONG).show();
    }if (usuario.length()==0){
            Toast.makeText(contextListener,"El usuario no puede quedar vacia",Toast.LENGTH_LONG).show();
        }
    }
}

