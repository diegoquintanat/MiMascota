package diego.com.mimascota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import diego.com.mimascota.adapter.ContactoAdaptador;
import diego.com.mimascota.pojo.Mascota;

public class RankingMascota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking_mascota);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setTitle(R.string.titulo_actionbar);
        getSupportActionBar().setIcon(R.drawable.cat_footprint_52);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        Mascota mascota1 = new Mascota("lucas", "schitzu", "diana.hidalgop@pucp.pe", R.drawable.tiger);
        Mascota mascota2 = new Mascota("lucas2", "schitzu2", "diana.hidalgop@pucp.pe", R.drawable.rough_collie);
        Mascota mascota3 = new Mascota("lucas", "schitzu", "diana.hidalgop@pucp.pe", R.drawable.pig);
        Mascota mascota4 = new Mascota("lucas2", "schitzu2", "diana.hidalgop@pucp.pe", R.drawable.rat);
        Mascota mascota5 = new Mascota("lucas", "schitzu", "diana.hidalgop@pucp.pe", R.drawable.schnauzer);

        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(mascota3);
        mascotas.add(mascota4);
        mascotas.add(mascota5);

        RecyclerView rclMascotas = (RecyclerView) findViewById(R.id.mascotas_favoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rclMascotas.setLayoutManager(llm);
        iniciarAdaptador(mascotas, rclMascotas);
    }

    public void iniciarAdaptador(ArrayList<Mascota> mascotas, RecyclerView rclMascotas){
        ContactoAdaptador adaptador = new ContactoAdaptador(mascotas, RankingMascota.this);
        rclMascotas.setAdapter(adaptador);

    }
}
