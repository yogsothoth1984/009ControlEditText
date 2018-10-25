package com.example.a009controledittext.Activity;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.a009controledittext.Listener.Listener_Verificar;
import com.example.a009controledittext.R;

public class MainActivity extends AppCompatActivity {
    private EditText editUsuario,editClave;
    private Button buttVerificar;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vincular
        editUsuario=findViewById(R.id.editUsuario);
        editClave=findViewById(R.id.editClave);
        buttVerificar=findViewById(R.id.buttVerificar);
        toolbar=findViewById(R.id.id_toolbar);

        //Variables para pasar,asi no uso los objetos
        String user=editUsuario.getText().toString();
        String pass=editClave.getText().toString();

        //Boton 1
        Listener_Verificar listener_verificar=new Listener_Verificar(this,user,pass);
        buttVerificar.setOnClickListener(listener_verificar);

    }
}
