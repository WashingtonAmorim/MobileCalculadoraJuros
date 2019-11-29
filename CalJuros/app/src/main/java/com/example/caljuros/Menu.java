package com.example.caljuros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class Menu extends AppCompatActivity {

    private Button btSimples, btComposto, btDesconto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btSimples = (Button) findViewById(R.id.btSimples);
        btComposto = (Button) findViewById(R.id.btComposto);
        btDesconto = (Button) findViewById(R.id.btDesconto);

        btSimples.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                btSimplesActivity();
            }
        });


        btComposto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                btCompostoActivity();
            }
        });

        btDesconto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                btDescontoActivity();
            }
        });

    }

    private void btSimplesActivity() {

        startActivity(new Intent(Menu.this, JurosSimples.class));
    }

    private void btCompostoActivity() {

        startActivity(new Intent(Menu.this, JurosComposto.class));
    }

    private void btDescontoActivity() {

        startActivity(new Intent(Menu.this, DescontoSimples.class));
    }
}
