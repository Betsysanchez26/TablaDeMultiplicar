package com.example.betsysanchez.tablamultiplicar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button calc;
    SeekBar sb;
    TextView num;
    ListView salida;
    ArrayList<String> lista;
    ArrayAdapter<String> adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc=findViewById(R.id.button);
        sb=findViewById(R.id.seekBar);
        num=findViewById(R.id.textView2);
        lista=new ArrayList<String>();
        adap=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);
        salida=findViewById(R.id.list_item);
        salida.setAdapter(adap);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int a=sb.getProgress();
                num.setText(a+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(num.getText().toString());
                lista.clear();
                adap.notifyDataSetChanged();
                for(int i=1;i<=30;i++){
                    lista.add(a+"X"+i+"="+(a*i));
                    adap.notifyDataSetChanged();
                }
            }
        });
    }
}
