package devandroid.moacir.appgaseta2025.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.moacir.appgaseta2025.R;
import devandroid.moacir.appgaseta2025.apoio.UtilGasEta;


public class GasEtaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gaseta);

       // UtilGasEta.metodoNaoEstatico();

        Toast.makeText(GasEtaActivity.this,
                UtilGasEta.calcularMelhorOPcao(5.12,5),
                Toast.LENGTH_LONG).show();

    }
}
