package com.example.a009controledittext.Listener;

import android.view.View;
import android.widget.Toast;

import com.example.a009controledittext.MainActivity;

public class List_Verificar2 implements View.OnClickListener {

    private MainActivity mainActivity;

    public List_Verificar2(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
    //en este metodo uso los getter y el contexto del Main
    @Override
    public void onClick(View v) {
        String usuario=mainActivity.getEditUsuario().getText().toString();
        String clave=mainActivity.getEditClave().getText().toString();

        if (clave.length()==0){//El método length() de la clase String sirve para ver cuantos caracteres se ingresaron.
            Toast.makeText(mainActivity,"La clave no puede quedar vacia",Toast.LENGTH_LONG).show();
        }if (usuario.length()==0){
            Toast.makeText(mainActivity,"El usuario no puede quedar vacia",Toast.LENGTH_LONG).show();
        }
    }
}
