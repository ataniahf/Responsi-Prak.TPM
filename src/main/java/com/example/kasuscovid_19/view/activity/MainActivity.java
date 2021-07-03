package com.example.kasuscovid_19.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.kasuscovid_19.R;
import com.example.kasuscovid_19.view.fragment.FasilitasKesehatanFragment;
import com.example.kasuscovid_19.view.fragment.KasusHarianFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    //mengatur tampilan yang ada di layar dari activity main
    //deklarasi
    private BottomNavigationView navbar;
    private Fragment fragment = new KasusHarianFragment() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //koneksi dari layout activity main
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        //menemukan id yang terdapat di activity_main
        navbar = findViewById(R.id.bottom_nav);
        navbar.setOnNavigationItemSelectedListener(this);
        //load fragmentnya
        loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        if(fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.activitymain_fragmentcontainer, fragment)
                    .commit();
            return true;
        }
        return false;
    }
//navbabar bawah navigasi pindah halaman
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_botnav_kashar:
                fragment = new KasusHarianFragment();
                break;

            case R.id.menu_botnav_faskes:
                fragment = new FasilitasKesehatanFragment();
        }
        return loadFragment(fragment);
    }
}