package com.example.salutem24;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView tv_registro;
    Button bt_ingresar;
    Dialog olvido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        tv_registro = findViewById(R.id.tv_registro);
        bt_ingresar = findViewById(R.id.bt_ingresar);
        olvido = new Dialog( this );

        tv_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClass(Login.this, Registro.class);
                startActivity(intent);
                finish();
            }
        });

        bt_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClass(Login.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void olvido_contrasena( View v){
        TextView txtClose;
        olvido.setContentView( R.layout.olvido_contrasena );

        txtClose = (TextView) olvido.findViewById( R.id.txtClose );

        txtClose.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                olvido.dismiss();
            }
        } );

        olvido.show();
    }

}