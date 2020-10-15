package com.e.contacto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private TextView nombre, telefono, email, descripcion;
    private CalendarView fecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.nombre);
        telefono = findViewById(R.id.telefono);
        fecha = findViewById(R.id.fecha);
        email = findViewById(R.id.email);
        descripcion = findViewById(R.id.descripcion);


    }

    public void datos(View view){
        
    }
}