package com.example.betsysanchez.tablamultiplicar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText caja;
    Button calc;
    TextView salida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caja=findViewById(R.id.editText);
        calc=findViewById(R.id.button);
        salida=findViewById(R.id.salida);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(caja.getText().toString());
                String resultado="";

                for(int i=1;i<=10;i++){
                    resultado+= a+"X"+i+"="+(a*i)+"\n";
                }
                salida.setText(resultado);
                

            }
        });
    }
}
