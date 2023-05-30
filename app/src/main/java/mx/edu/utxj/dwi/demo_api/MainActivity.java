package mx.edu.utxj.dwi.demo_api;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

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
    private RequestQueue requestQueue;
    private JsonArrayRequest jsonArrayRequest;
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
        requestQueue= Volley.newRequestQueue(this);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListarProductos();
            }
        });

        }
    protected void ListarProductos(){
        String url="http://10.10.62.17:3300/";
        jsonArrayRequest=new JsonArrayRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Toast.makeText(MainActivity.this, response.toString(),Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }


        );

        requestQueue.add(jsonArrayRequest);
    }

}