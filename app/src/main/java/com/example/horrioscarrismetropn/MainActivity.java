package com.example.horrioscarrismetropn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_main);

        Spinner spinner_dia_semana = (Spinner)findViewById(R.id.spinner_dias_semana), spinner_sentido = (Spinner)findViewById(R.id.spinner2);
        Button button = (Button)findViewById(R.id.button);

        ArrayAdapter<CharSequence> adapter_dias = ArrayAdapter.createFromResource(this, R.array.dias_semana, android.R.layout.simple_spinner_item);
        adapter_dias.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_dia_semana.setAdapter(adapter_dias);

        ArrayAdapter<CharSequence> adapterSentido = ArrayAdapter.createFromResource(this, R.array.sentido, android.R.layout.simple_spinner_item);
        adapterSentido.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_sentido.setAdapter(adapterSentido);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner_dia_semana.getSelectedItemId()==0 & spinner_sentido.getSelectedItemId() == 0)
                    setContentView(R.layout.dias_semana_pn_lx);
                else if (spinner_dia_semana.getSelectedItemId()==0 & spinner_sentido.getSelectedItemId() == 1)
                    setContentView(R.layout.semana_lx_pn);
                else if (spinner_dia_semana.getSelectedItemId()==1 & spinner_sentido.getSelectedItemId() == 0)
                    setContentView(R.layout.sabado_pn_lx);
                else if (spinner_dia_semana.getSelectedItemId()==1 & spinner_sentido.getSelectedItemId() == 1)
                    setContentView(R.layout.sabado_lx_pn);
                else if (spinner_dia_semana.getSelectedItemId()==2 & spinner_sentido.getSelectedItemId() == 0)
                    setContentView(R.layout.domingo_pn_lx);
                else if (spinner_dia_semana.getSelectedItemId()==2 & spinner_sentido.getSelectedItemId() == 1)
                    setContentView(R.layout.domingo_lx_pn);
            }
        });
    }
}