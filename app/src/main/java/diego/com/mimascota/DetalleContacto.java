package diego.com.mimascota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DetalleContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setTitle(R.string.titulo_actionbar);
        getSupportActionBar().setIcon(R.drawable.cat_footprint_52);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
