package com.example.a009controledittext.Listener;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a009controledittext.Activity.MainActivity;

public class Listener_Verificar implements View.OnClickListener {

    private Context contextListener;
    private String user, pass,usuario, clave;

    public Listener_Verificar(Context contextListener, String user, String pass) {
        this.contextListener = contextListener;
        this.user = user;
        this.pass = pass;
    }

    //En este metodo se los paso por parametro del listener1
    @Override
    public void onClick(View v) {
        if (user.length()==0){
            Toast.makeText(contextListener,"El usuario no puede quedar vacia",Toast.LENGTH_LONG).show();
            if (pass.length()==0){//El método length() de la clase String sirve para ver cuantos caracteres se ingresaron.
                Toast.makeText(contextListener,"La clave no puede quedar vacia",Toast.LENGTH_LONG).show();
            }
        }
    }

}

