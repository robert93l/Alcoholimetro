package com.roberto.alcoholimetro;

import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.GestureDescription;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText numero,numero1,numero2;
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero =  (EditText)findViewById(R.id.numero);
        numero1 = (EditText)findViewById(R.id.numero1);
        numero2 = (EditText)findViewById(R.id.numero2);
        text = (TextView)findViewById(R.id.alcoholimetrotext);


            }


            public void operacionHombre(View view){
            float n0,n1,n2,graduacion, alcohol;

                n0 = Float.parseFloat(numero.getText().toString());
                n1 = Float.parseFloat(numero1.getText().toString());
                n2 = Float.parseFloat(numero2.getText().toString());

                graduacion= (float) (n0*n1*0.8)/100;
                alcohol= (float) (graduacion/(n2*0.7));

                text.setText("Resultado" + alcohol);

                //Abre cada activity segun el grado de alcohol en la sangre

                if (alcohol>=.10 & alcohol<=.29){
                    Intent i = new Intent(this, Grado1.class);
                    startActivity(i);}

                if (alcohol>=.30 & alcohol<=.59){
                    Intent i = new Intent(this, Grado2.class);
                    startActivity(i);}

                if (alcohol>=.60 & alcohol<=.99){
                    Intent i = new Intent(this, Grado3.class);
                    startActivity(i);}

                if (alcohol>=1 & alcohol<=2.99){
                    Intent i = new Intent(this, Grado4.class);
                    startActivity(i);}

                if (alcohol>=3 & alcohol<=4.99){
                    Intent i = new Intent(this, Grado5.class);
                    startActivity(i);}

                if (alcohol>=5){
                    Intent i = new Intent(this, Grado6.class);
                    startActivity(i);}


            }


            public void operacionMujer(View view){
            float n0,n1,n2,graduacion, alcohol;

                 n0 = Float.parseFloat(numero.getText().toString());
                 n1 = Float.parseFloat(numero1.getText().toString());
                 n2 = Float.parseFloat(numero2.getText().toString());

                graduacion= (float) (n0*n1*0.8)/100;
                alcohol= (float) (graduacion/(n2*0.6));

                 text.setText("Resultado" + alcohol);

                if (alcohol>=.10 & alcohol<=.29){
                    Intent i = new Intent(this, Grado1.class);
                    startActivity(i);}

                if (alcohol>=.30 & alcohol<=.59){
                    Intent i = new Intent(this, Grado2.class);
                    startActivity(i);}

                if (alcohol>=.60 & alcohol<=.99){
                    Intent i = new Intent(this, Grado3.class);
                    startActivity(i);}

                if (alcohol>=1 & alcohol<=2.99){
                    Intent i = new Intent(this, Grado4.class);
                    startActivity(i);}

                if (alcohol>=3 & alcohol<=4.99){
                    Intent i = new Intent(this, Grado5.class);
                    startActivity(i);}

                if (alcohol>=5){
                    Intent i = new Intent(this, Grado6.class);
                    startActivity(i);}
    }
        };

