package com.pmobile.kalkulatorzakat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Profesi extends AppCompatActivity {

    TextView txtHasil;
    EditText txtHarga,txtPenghasilan,txtHutang;
    Button btnHitung;

    int harga,gaji,hutang,nizab;
    double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profesi);

        txtHasil = (TextView) findViewById(R.id.txtHasil);
        txtHarga = (EditText) findViewById(R.id.txtHarga);
        txtPenghasilan = (EditText) findViewById(R.id.txtPenghasilan);
        txtHutang = (EditText) findViewById(R.id.txtHutang);
        btnHitung = (Button) findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                harga = Integer.parseInt(txtHarga.getText().toString());
                gaji = Integer.parseInt(txtPenghasilan.getText().toString());
                hutang = Integer.parseInt(txtHutang.getText().toString());
                nizab = harga * 520;

                if (gaji > nizab)
                {
                    hasil = 0.025 * (gaji - hutang);
                    txtHasil.setText(String.valueOf("Gaji anda Rp " +gaji+ " lebih dari Nizab zakat Profesi sebesar Rp " +nizab+ ". Anda wajib" + " membayar Zakat Profesi sebesar Rp " +hasil));
                }

                else
                {
                    txtHasil.setText(String.valueOf("Anda tidak wajib membayar zakat profesi, Karena" + " nizab lebih besar dari penghasilan anda"));
                }


            }
        });
    }
}
