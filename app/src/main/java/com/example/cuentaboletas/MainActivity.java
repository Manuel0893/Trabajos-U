package com.example.cuentaboletas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnBoleta;
    private TextView txtFolio;
    private TextView txtMonto;
    private TextView txtCuentaBoletas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMonto = findViewById(R.id.txtMonto);

        txtCuentaBoletas = findViewById(R.id.txtCuentaBoletas);


        btnBoleta = findViewById(R.id.btnBoleta);
        btnBoleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnBoleta.setText(contador(Integer.parseInt(txtCuentaBoletas.getText().toString())));
                txtCuentaBoletas.getText();
            }
        });
    }

    public int contador(int a){
        int n = 0;
        if (n > 190){
            a ++;
        }
        return a;
    }

}