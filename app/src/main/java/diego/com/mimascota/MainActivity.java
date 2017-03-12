package diego.com.mimascota;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import diego.com.mimascota.adapter.ContactoAdaptador;
import diego.com.mimascota.adapter.PageAdapter;
import diego.com.mimascota.fragment.PerfilFragment;
import diego.com.mimascota.fragment.RecyclerViewFragment;
import diego.com.mimascota.pojo.Mascota;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        if (toolbar != null){
            setSupportActionBar(toolbar);
            getSupportActionBar().setIcon(R.drawable.cat_footprint_52);
        }

        setUpViewPager();



    }

    private ArrayList<Fragment> agregarFragment(){

        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());

        return fragments;

    }

    private void setUpViewPager(){

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragment()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_contacto);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_detalle);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_star:
                Intent intent = new Intent(this, RankingMascota.class);
                startActivity(intent);
                break;

            case R.id.m_about:
                Toast.makeText(getApplicationContext(),"Creado por Diego",Toast.LENGTH_SHORT).show();
                break;

            case R.id.m_contact:
                Intent intentContact = new Intent(MainActivity.this, Datos.class);
                this.startActivity(intentContact);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
