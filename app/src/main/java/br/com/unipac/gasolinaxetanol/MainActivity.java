package br.com.unipac.gasolinaxetanol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText campoGasolina;
    private EditText campoEtanol;
    private Button btnCalcular;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Resultado = (TextView) findViewById(R.id.Resultado);
        final EditText campoGasolina = (EditText) findViewById (R.id.campoGasolina);
        final EditText campoEtanol = (EditText) findViewById (R.id.campoEtanol);

        final Button b1 = (Button) findViewById(R.id.btnCalcular);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                String txtEtanol = campoEtanol.getText().toString();
                String txtGasolina = campoGasolina.getText().toString();

                double txtcampoEtanol = Double.parseDouble(txtEtanol);
                double txtcampoGasolina = Double.parseDouble(txtGasolina);

                double res = txtcampoEtanol/txtcampoGasolina;

                if (res <= 0.7) {
                    Resultado.setText("Alcool é melhor");

                }else{
                    Resultado.setText("Gasolina é melhor");
                }

            }
        });
    }
}
