package com.example.caljuros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JurosSimples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_simples);

        final double[] calcJuros = new double[1];
        final double[] vlFuturo = new double[1];
        final double[] vlParcela = new double[1];

        Button btCalcular = (Button) findViewById(R.id.btCalcular);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView valorInicial = (TextView) findViewById(R.id.valorInicial);
                TextView taxaJuros = (TextView) findViewById(R.id.taxaJuros);
                TextView tempo = (TextView) findViewById(R.id.tempo);

                TextView juros = (TextView) findViewById(R.id.juros);
                TextView valorFuturo = (TextView) findViewById(R.id.valorFuturo);
                TextView valorParcela = (TextView) findViewById(R.id.valorParcela);

                double valor = Double.parseDouble(valorInicial.getText().toString());
                double txJuros = Double.parseDouble(taxaJuros.getText().toString());
                int t = Integer.parseInt(tempo.getText().toString());

                calcJuros[0] = (valor * txJuros * t) / 100;
                juros.setText("Valor do Juros é: R$ " + calcJuros[0]+"");

                vlFuturo[0] = valor + (calcJuros[0]);
                valorFuturo.setText("Total com Juros é: R$ " + vlFuturo[0]+"");

                vlParcela[0] = vlFuturo[0] / t;
                valorParcela.setText("Cada Parcela fica em: R$ " + vlParcela[0]+ " de " + t +"");

            }
        });

    }
}
