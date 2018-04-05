package com.kcci.emmi.donasmainview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.maps.SupportMapFragment;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ArrayList<HashMap<String, String>> tkykPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentManager fm = getSupportFragmentManager();
        Intent intent = getIntent();
        tkykPoints = (ArrayList<HashMap<String, String>>) intent.getSerializableExtra("tkykPoints");

        MapFragment mf = new MapFragment();

        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.region_layout, mf);
        fragmentTransaction.commit();

        LinearLayout menu = (LinearLayout) findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.map_layout).setVisibility(View.GONE);
                findViewById(R.id.scroll).setVisibility(View.VISIBLE);

                MenuFragment mf = new MenuFragment();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, mf);
                fragmentTransaction.commit();

            }
        });
        LinearLayout map = (LinearLayout) findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.map_layout).setVisibility(View.VISIBLE);
                findViewById(R.id.scroll).setVisibility(View.GONE);

                MapFragment mf = new MapFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("tkykPoints", tkykPoints);
                mf.setArguments(bundle);

                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.map_layout, mf);
                fragmentTransaction.commit();


            }
        });

//        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
//        startActivity(intent);

//        Intent blogIntent = new Intent(MainActivity.this, BlogActivity.class);
//        startActivity(blogIntent);
    }
}
