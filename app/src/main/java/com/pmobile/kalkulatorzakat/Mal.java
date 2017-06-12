package com.pmobile.kalkulatorzakat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mal extends AppCompatActivity {

    TextView txtHasil;
    EditText txtHarga,txtHarta;
    Button btnHitung;

    int harga,harta,nizab;
    double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mal);

        txtHasil = (TextView)findViewById(R.id.txtHasil);
        txtHarga = (EditText)findViewById(R.id.txtHarga);
        txtHarta = (EditText)findViewById(R.id.txtHarta);
        btnHitung = (Button)findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                harga = Integer.parseInt(txtHarga.getText().toString());
                harta = Integer.parseInt(txtHarta.getText().toString());
                nizab = harga * 85;

                if (harta >= nizab)
                {
                    hasil = 0.025 * harta;
                    txtHasil.setText(String.valueOf("Harta anda Rp " +harta+ " lebih dari Nizab zakat" + " Maal sebesar Rp " +nizab+ ". Anda wajib membayar Zakat Maal sebesar Rp " +hasil));
                }

                else
                {
                    txtHasil.setText(String.valueOf("Anda tidak wajib membayar zakat maal, Karena nizab lebih besar dari penghasilan anda"));
                }

            }
        });
    }
}
