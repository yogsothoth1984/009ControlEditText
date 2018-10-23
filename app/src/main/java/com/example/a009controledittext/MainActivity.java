package com.example.a009controledittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.a009controledittext.Listener.Listener_Verificar;

public class MainActivity extends AppCompatActivity {
    private EditText editUsuario,editClave;
    private Button buttVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vincular
        editUsuario=findViewById(R.id.editUsuario);
        editClave=findViewById(R.id.editClave);
        buttVerificar=findViewById(R.id.buttVerificar);

        //Boton
        Listener_Verificar listener_verificar=new Listener_Verificar(this);
        buttVerificar.setOnClickListener(listener_verificar);
    }
}
