package com.pmobile.kalkulatorzakat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fitrah extends AppCompatActivity {

    TextView txtHasil;
    EditText txtHarga;
    Button btnHitung;

    int harga;
    double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fitrah);

        txtHasil = (TextView)findViewById(R.id.txtHasil);
        txtHarga = (EditText)findViewById(R.id.txtHarga);
        btnHitung = (Button)findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                harga = Integer.parseInt(txtHarga.getText().toString());
                hasil = harga * 3.5;
                txtHasil.setText(String.valueOf("Anda dapat membayar zakat fitrah dengan beras " + "sebesar 3,5 liter atau dengan uang sebesar Rp " +hasil ));
            }
        });

    }
}
