package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        Button basico= findViewById(R.id.btbasico);
        Button avanzado= findViewById(R.id.btavanzado);
        Button cerrar= findViewById(R.id.cerrar);

        basico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a= new Intent(Menu.this, Basico.class);
                startActivity(a);
            }
        });

        avanzado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a= new Intent(Menu.this,Avanzado.class);
                startActivity(a);
            }
        });

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Sesion.class);
                startActivity(intent);
            }
        });
    }

}