package com.kevinmcr.personas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listado extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Persona> personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        tabla = findViewById(R.id.tabla);
        personas = Datos.obtener();

        for (int i = 0; i < personas.size(); i++) {
            //Nueva fila
            TableRow fila = new TableRow(this);

            //Se crean las columanas
            TextView col1 = new TextView(this);
            TextView col2 = new TextView(this);
            TextView col3 = new TextView(this);
            TextView col4 = new TextView(this);

            //Valores de las columnas
            col1.setText("" + (i+1));
            col2.setText(personas.get(i).getCedula());
            col3.setText(personas.get(i).getNombre());
            col4.setText(personas.get(i).getApellido());

            //Se agregan los valores de las columnas a la nueva fila
            fila.addView(col1);
            fila.addView(col2);
            fila.addView(col3);
            fila.addView(col4);

            //Se agrega fila a la tabla
            tabla.addView(fila);
        }
    }
}
