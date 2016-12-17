package com.androidbolivia.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String sValorActual="0";
    private String sOpePendiente="";
    private int iTotal=0;
    boolean bFlagOpcion=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

    }
    public void CliNum(View view){
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        String value = view.getTag().toString();

        if(value.equals("1") || value.equals("2") || value.equals("3") || value.equals("4")
                || value.equals("5") || value.equals("6") || value.equals("7")
                || value.equals("8") || value.equals("9") || value.equals("0")){
            if(sValorActual.equals("0")){
                tvResultado.setText(value);
            }else{
                if(bFlagOpcion){
                    tvResultado.setText(value);
                }else{
                    tvResultado.setText(sValorActual+value);
                }
            }
        }
        sValorActual=tvResultado.getText().toString();
        Toast.makeText(this, "iTotal: "+String.valueOf(iTotal), Toast.LENGTH_SHORT).show();
    }

    public void CliSuma(View view){
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        if (bFlagOpcion){
            iTotal += Integer.valueOf(tvResultado.getText().toString());
            bFlagOpcion=false;
            sOpePendiente="";
            tvResultado.setText(String.valueOf(iTotal));

        }else {
            iTotal = Integer.valueOf(tvResultado.getText().toString());
            sValorActual ="0";
            bFlagOpcion=true;
            sOpePendiente="suma";
            tvResultado.setText("0");
        }
        sValorActual=tvResultado.getText().toString();
        Toast.makeText(this, "iTotal: "+String.valueOf(iTotal), Toast.LENGTH_SHORT).show();
    }

    public void CliResta(View view){
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        if (bFlagOpcion){
            iTotal -= Integer.valueOf(tvResultado.getText().toString());
            bFlagOpcion=false;
            sOpePendiente="";
            tvResultado.setText(String.valueOf(iTotal));

        }else {
            iTotal = Integer.valueOf(tvResultado.getText().toString());
            sValorActual ="0";
            bFlagOpcion=true;
            sOpePendiente="resta";
            tvResultado.setText("0");
        }
        sValorActual=tvResultado.getText().toString();
        Toast.makeText(this, "iTotal: "+String.valueOf(iTotal), Toast.LENGTH_SHORT).show();
    }

    public void CliMulti(View view){
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        if (bFlagOpcion){
            iTotal *= Integer.valueOf(tvResultado.getText().toString());
            bFlagOpcion=false;
            sOpePendiente="";
            tvResultado.setText(String.valueOf(iTotal));

        }else {
            iTotal = Integer.valueOf(tvResultado.getText().toString());
            sValorActual ="0";
            bFlagOpcion=true;
            sOpePendiente="multiplicar";
            tvResultado.setText("0");
        }
        sValorActual=tvResultado.getText().toString();
        Toast.makeText(this, "iTotal: "+String.valueOf(iTotal), Toast.LENGTH_SHORT).show();
    }

    public void CliDivi(View view){
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        if (bFlagOpcion){
            iTotal /= Integer.valueOf(tvResultado.getText().toString());
            bFlagOpcion=false;
            sOpePendiente="";
            tvResultado.setText(String.valueOf(iTotal));

        }else {
            iTotal = Integer.valueOf(tvResultado.getText().toString());
            sValorActual ="0";
            bFlagOpcion=true;
            sOpePendiente="division";
            tvResultado.setText("0");
        }
        sValorActual=tvResultado.getText().toString();
        Toast.makeText(this, "iTotal: "+String.valueOf(iTotal), Toast.LENGTH_SHORT).show();
    }

    public void CliIgual(View view){
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        if (bFlagOpcion){
            switch (sOpePendiente) {
                case "suma":
                    iTotal += Integer.valueOf(tvResultado.getText().toString());
                    break;
                case "resta":
                    iTotal -= Integer.valueOf(tvResultado.getText().toString());
                    break;
                case "multiplicar":
                    iTotal *= Integer.valueOf(tvResultado.getText().toString());
                    break;
                case "division":
                    iTotal /= Integer.valueOf(tvResultado.getText().toString());
                    break;
            }
            bFlagOpcion=false;
            sOpePendiente="";
            tvResultado.setText(String.valueOf(iTotal));
        }else {
            iTotal = Integer.valueOf(tvResultado.getText().toString());
            sValorActual ="0";
            tvResultado.setText("0");
        }
        sValorActual=tvResultado.getText().toString();
        Toast.makeText(this, "iTotal: "+String.valueOf(iTotal), Toast.LENGTH_SHORT).show();
    }

    public void CliCe(View view){
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        iTotal = Integer.valueOf(tvResultado.getText().toString());
        sValorActual ="0";
        tvResultado.setText("0");
    }
}
