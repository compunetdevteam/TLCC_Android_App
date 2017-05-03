package com.example.ogan.tlcc;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    private DrawerLayout nDrawLayout;
    private ActionBarDrawerToggle nToggle;
    TabLayout tabLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    FragmentTransaction fragmentTransaction;
    FragmentManager FM;
    //FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        //frameLayout = (FrameLayout) findViewById(R.id.big_container);

        FM = getSupportFragmentManager();
        fragmentTransaction = FM.beginTransaction();
        fragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();

        navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                nDrawLayout.closeDrawers();


                if(item.getItemId()==R.id.nav_pastor_profile){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new PastorFragment()).commit();
                    toolbar.setTitle("Pastor Profile");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
                }

                return false;
            }
        });

        nDrawLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        nToggle = new ActionBarDrawerToggle(this, nDrawLayout, R.string.open, R.string.close);
        nDrawLayout.addDrawerListener(nToggle);
        nToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                    getSupportActionBar().setDisplayHomeAsUpEnabled(true); // show back button
                    toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            onBackPressed();
                        }
                    });
                } else {
                    //show hamburger
                    nToggle.setDrawerIndicatorEnabled(true); //making the toggle come back
                    nDrawLayout.addDrawerListener(nToggle);
                    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                    toolbar.setTitle("TLCC");
                    nToggle.syncState();
                    toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            nDrawLayout.openDrawer(GravityCompat.START);
                        }
                    });
                }
            }
        });


    }




    //For the toggle
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if(nToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
