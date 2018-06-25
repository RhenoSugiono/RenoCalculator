package com.example.baka.renocalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvResult;
    private EditText etAngka1, etAngka2;
    private Button btnTambah, btnKurang, btnKali, btnBagi;

    protected String sAngka1, sAngka2;
    protected float angka1, angka2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = (TextView) findViewById(R.id.tvResult);
        etAngka1 = (EditText) findViewById(R.id.etAngka1);
        etAngka2 = (EditText) findViewById(R.id.etAngka2);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(this);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKurang.setOnClickListener(this);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnKali.setOnClickListener(this);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        sAngka1 = etAngka1.getText().toString();
        sAngka2 = etAngka2.getText().toString();

        if (sAngka1.isEmpty() || sAngka2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Angka Ke-1 dan Angka Ke-2 tidka boleh kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        angka1 = Float.parseFloat(sAngka1);
        angka2 = Float.parseFloat(sAngka2);

        switch (view.getId()) {
            case R.id.btnTambah:
                hasil = angka1 + angka2;
                break;

            case R.id.btnKurang:
                hasil = angka1 - angka2;
                break;

            case R.id.btnKali:
                hasil = angka1 * angka2;
                break;

            case R.id.btnBagi:
                hasil = angka1 / angka2;
                break;
        }

        tvResult.setText(Float.toString(hasil));
    }
}
