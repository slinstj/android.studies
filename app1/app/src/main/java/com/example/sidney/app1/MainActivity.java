package com.example.sidney.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView lblHello = (TextView)findViewById(R.id.lblHello);
        String texto = lblHello.getText().toString();
        lblHello.setText(texto + " mudado");

        EditText txtNome = (EditText)findViewById(R.id.txtNome);
        txtNome.setText(lblHello.getText().toString() + " - e de novo.");
    }
}
