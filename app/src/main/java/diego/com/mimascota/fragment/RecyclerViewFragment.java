package diego.com.mimascota.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import diego.com.mimascota.MainActivity;
import diego.com.mimascota.R;
import diego.com.mimascota.adapter.ContactoAdaptador;
import diego.com.mimascota.pojo.Mascota;

/**
 * Created by Diego on 19/02/2017.
 */

public class RecyclerViewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_rcl, container, false);

        RecyclerView rclMascotas = (RecyclerView) v.findViewById(R.id.lista_contactos);
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rclMascotas.setLayoutManager(llm);
        iniciarAdaptador(mascotas, rclMascotas);

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

        return v;
    }


    public void iniciarAdaptador(ArrayList<Mascota> mascotas, RecyclerView rclMascotas){
        ContactoAdaptador adaptador = new ContactoAdaptador(mascotas, getActivity());
        rclMascotas.setAdapter(adaptador);

    }
}
