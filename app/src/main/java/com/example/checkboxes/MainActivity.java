package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView etiqueta, etiqueta2;
private CheckBox opcion1, opcion2, opcion3;
private RadioButton opcionR1, opcionR2, opcionR3;
private String cad1="",cad2="",cad3="";
private String cadR1="",cadR2="",cadR3="";
private Button botonValiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etiqueta= findViewById(R.id.mostrar);
        opcion1= findViewById(R.id.op1);
        opcion2= findViewById(R.id.op2);
        opcion3= findViewById(R.id.op3);

        etiqueta2=findViewById(R.id.mostrar2);
        opcionR1=findViewById(R.id.radioButton);
        opcionR2=findViewById(R.id.radioButton2);
        opcionR3=findViewById(R.id.radioButton3);
        botonValiar=findViewById(R.id.botonValiar);

        botonValiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cadena= "Seleccionado: \n";

                if (opcion1.isChecked()==true)
                    cadena+="messi gana el mundial\n";
                if (opcion2.isChecked()==true)
                    cadena+="mbappe gana el mundial\n";
                if (opcion3.isChecked()==true)
                    cadena+="messi llora por el resto de su vida\n";

                if (opcionR1.isChecked()==true)
                    cadena+="francia\n";
                if (opcionR2.isChecked()==true)
                    cadena+="argentina";
                if (opcionR3.isChecked()==true)
                    cadena+="brazil";


                Toast.makeText(MainActivity.this,cadena,Toast.LENGTH_LONG).show();
            }
        });

    }

    public void validar(){




    }


    public void op1(View view) {
        if (opcion1.isChecked() == true)
            cad1 = " haz seleccionado messi gana el mundial\n";
        else
            cad1 = "";
        etiqueta.setText(cad1 + cad2 + cad3);
    }

        public void op2 (View view){
            if(opcion2.isChecked()==true)
                cad2= " haz seleccionado mbappe gana el mundial\n";
             else
                cad2= "";
                etiqueta.setText(cad1+cad2+cad3);
            }

    public void op3 (View view){
        if(opcion3.isChecked()==true)
            cad3= " haz seleccionado messi llora por el resto de su vida\n";
        else
            cad3= "";
        etiqueta.setText(cad1+cad2+cad3);
    }

    public void opR1 (View view){
        if(opcionR1.isChecked()==true)
            cadR1= " haz seleccionado francia\n";
        else
            cadR1= "";
        etiqueta2.setText(cadR1);

    }

    public void opR2 (View view){
        if(opcionR2.isChecked()==true)
            cadR2= " haz seleccionado argentina\n";
        else
            cadR2= "";
        etiqueta2.setText(cadR2);

    }

    public void opR3 (View view){
        if(opcionR3.isChecked()==true)
            cadR3= " haz seleccionado brazil\n";
        else
            cadR3= "";
        etiqueta2.setText(cadR3);

    }






    }





