package mx.edu.utxj.dwi.demo_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Button btnGuardar  ;
    private Button btnBuscar  ;
    private Button btnActualizar  ;
    private Button btnEliminar  ;

    private EditText stCodigoBarras;
    private EditText etDescripcion;
    private EditText etMarca;
    private EditText etPrecioCompra;
    private EditText etPrecioVenta;
    private EditText etExistencias;
    private ListView lvProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btnGuardar= findViewById(R.id.btnGuardar);
        btnBuscar= findViewById(R.id.btnBuscar);
        btnActualizar= findViewById(R.id.btnActualizar);
        btnEliminar= findViewById(R.id.btnEliminar);
        stCodigoBarras =findViewById(R.id.stCodigoBarras);
        etDescripcion =findViewById(R.id.etDescripcion);
        etMarca =findViewById(R.id.etMarca);
        etPrecioCompra =findViewById(R.id.etPrecioCompra);
        etPrecioVenta =findViewById(R.id.etPrecioVenta);
        etExistencias =findViewById(R.id.etExistencias);
        lvProductos =findViewById(R.id.lvProductos);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}