package diego.com.mimascota;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Datos extends AppCompatActivity implements View.OnClickListener{

    private TextInputEditText nombre;
    private TextInputEditText correo;
    private TextInputEditText mensaje;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setTitle(R.string.titulo_actionbar);
        getSupportActionBar().setIcon(R.drawable.cat_footprint_52);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nombre = (TextInputEditText) findViewById(R.id.etNombre);
        correo = (TextInputEditText) findViewById(R.id.etCorreo);
        mensaje = (TextInputEditText) findViewById(R.id.etMensaje);
        enviar = (Button) findViewById(R.id.btEnviar);

        enviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String textoCorreo = correo.getText().toString();
        String textoMensaje = mensaje.getText().toString();

        //Creating SendMail object
        SendMail sm = new SendMail(this, textoCorreo, textoMensaje);

        //Executing sendmail to send email
        sm.execute();
    }
}
