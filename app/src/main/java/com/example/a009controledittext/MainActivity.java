package com.example.a009controledittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.a009controledittext.Listener.List_Verificar2;
import com.example.a009controledittext.Listener.Listener_Verificar;

public class MainActivity extends AppCompatActivity {
    private EditText editUsuario,editClave;
    private Button buttVerificar,buttVerificar2;

    public EditText getEditUsuario() {
        return editUsuario;
    }

    public EditText getEditClave() {
        return editClave;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vincular
        editUsuario=findViewById(R.id.editUsuario);
        editClave=findViewById(R.id.editClave);
        buttVerificar=findViewById(R.id.buttVerificar);
        buttVerificar2=findViewById(R.id.Verificar2);

        //Boton 1
        Listener_Verificar listener_verificar=new Listener_Verificar(this,editClave,editUsuario);
        buttVerificar.setOnClickListener(listener_verificar);

        //Boton2
        List_Verificar2 list_verificar_2 =new List_Verificar2(this);
        buttVerificar2.setOnClickListener(list_verificar_2);





    }
}
