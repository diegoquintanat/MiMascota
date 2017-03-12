package diego.com.mimascota.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;

import diego.com.mimascota.R;
import diego.com.mimascota.adapter.ContactoAdaptador;
import diego.com.mimascota.pojo.Mascota;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    private CircularImageView fotoPerfil;
    private TextView nombrePerfil;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        fotoPerfil = (CircularImageView) v.findViewById(R.id.foto_perfil);
        fotoPerfil.setImageResource(R.drawable.rough_collie);

        nombrePerfil = (TextView) v.findViewById(R.id.nombre_perfil);
        nombrePerfil.setText("Lucas");

        RecyclerView rclFotos = (RecyclerView) v.findViewById(R.id.lista_fotos);
        ArrayList<Mascota> fotosMascota = new ArrayList<Mascota>();

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);
        rclFotos.setLayoutManager(glm);
        rclFotos.setHasFixedSize(true);
        iniciarAdaptador(fotosMascota, rclFotos);

        Mascota mascota1 = new Mascota("lucas", "schitzu", "diana.hidalgop@pucp.pe", R.drawable.rough_collie);
        Mascota mascota2 = new Mascota("lucas2", "schitzu", "diana.hidalgop@pucp.pe", R.drawable.rough_collie);
        Mascota mascota3 = new Mascota("lucas", "schitzu", "diana.hidalgop@pucp.pe", R.drawable.rough_collie);
        Mascota mascota4 = new Mascota("lucas", "schitzu", "diana.hidalgop@pucp.pe", R.drawable.rough_collie);
        Mascota mascota5 = new Mascota("lucas", "schitzu", "diana.hidalgop@pucp.pe", R.drawable.rough_collie);

        fotosMascota.add(mascota1);
        fotosMascota.add(mascota2);
        fotosMascota.add(mascota3);
        fotosMascota.add(mascota4);
        fotosMascota.add(mascota5);

        return v;
    }

    public void iniciarAdaptador(ArrayList<Mascota> mascotas, RecyclerView rclMascotas){
        ContactoAdaptador adaptador = new ContactoAdaptador(mascotas, getActivity());
        rclMascotas.setAdapter(adaptador);

    }

}
