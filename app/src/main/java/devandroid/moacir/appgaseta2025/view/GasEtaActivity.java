package devandroid.moacir.appgaseta2025.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.moacir.appgaseta2025.R;
import devandroid.moacir.appgaseta2025.apoio.UtilGasEta;
import devandroid.moacir.appgaseta2025.model.Combustivel;


public class GasEtaActivity extends AppCompatActivity {
    Combustivel combustivelGasolina;
    Combustivel combustivelEtanol;
    EditText editGasolina;
    EditText editEtanol;
    TextView txtResultado;
    Button btnCalcular;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;
    double precoGasolina;
    double precoEtanol;
    String recomendacao;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaseta);

        editGasolina = findViewById(R.id.editGasolina);
        editEtanol = findViewById(R.id.editEtanol);
        txtResultado = findViewById(R.id.txtResultado);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isDadosOk = true;
                if(TextUtils.isEmpty(editGasolina.getText())){
                    editGasolina.setError("Campo Obrigatório");
                    editGasolina.requestFocus();
                    isDadosOk = false;
                }
                if(TextUtils.isEmpty(editEtanol.getText())){
                    editEtanol.setError("Campo Obrigatório");
                    editEtanol.requestFocus();
                    isDadosOk = false;
                }
                if(isDadosOk){
                    precoGasolina = Double.parseDouble(editGasolina.getText().toString());
                    precoEtanol = Double.parseDouble(editEtanol.getText().toString());
                    recomendacao = UtilGasEta.calcularMelhorOPcao(precoGasolina,precoEtanol);
                    txtResultado.setText(recomendacao);
                }else {
                    Toast.makeText(GasEtaActivity.this, "Preencha os campos", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                combustivelGasolina = new Combustivel();
                combustivelEtanol = new Combustivel();

                combustivelGasolina.setNomeDoCombustivel("Gasolina");
                combustivelGasolina.setPrecoDoCombustivel(precoGasolina);

                combustivelEtanol.setNomeDoCombustivel("Etanol");
                combustivelEtanol.setPrecoDoCombustivel(precoEtanol);

                combustivelGasolina.setRecomendacao(UtilGasEta.calcularMelhorOPcao(precoGasolina,precoEtanol));
                combustivelEtanol.setRecomendacao(UtilGasEta.calcularMelhorOPcao(precoGasolina,precoEtanol));

                int parada = 0;


            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editGasolina.setText("");
                editEtanol.setText("");

            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GasEtaActivity.this, "GasEta: Volte sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        Toast.makeText(GasEtaActivity .this,
                            UtilGasEta.calcularMelhorOPcao(5.12,2),
                            Toast.LENGTH_LONG).
                show();

                }
            }
