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

//for the individual menus
                if(item.getItemId()==R.id.nav_signIn){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new MyAccount()).commit();
                    toolbar.setTitle("My Account");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }
                else if(item.getItemId()==R.id.nav_pastor_profile){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new PastorFragment()).commit();
                    toolbar.setTitle("Pastor Profile");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }
                else if(item.getItemId()==R.id.nav_sermons){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new Sermons()).commit();
                    toolbar.setTitle("Sermons");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }
                else if(item.getItemId()==R.id.nav_gallery){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new Gallery()).commit();
                    toolbar.setTitle("Gallery");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }
                else if(item.getItemId()==R.id.nav_store){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new Store()).commit();
                    toolbar.setTitle("Store");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }
                else if(item.getItemId()==R.id.nav_ePayment){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new Give()).commit();
                    toolbar.setTitle("Give");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }
                else if(item.getItemId()==R.id.nav_liveStream){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new StreamService()).commit();
                    toolbar.setTitle("Live Service");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }
                else if(item.getItemId()==R.id.nav_prayHands){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new PrayerRequest()).commit();
                    toolbar.setTitle("Prayer Request");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }
                else if(item.getItemId()==R.id.nav_houseFellowship){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new FellowshipCenter()).commit();
                    toolbar.setTitle("Fellowship Centers");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }
                else if(item.getItemId()==R.id.nav_downloads){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new Downloads()).commit();
                    toolbar.setTitle("My Downloads");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }
                else if(item.getItemId()==R.id.nav_facebook){
                    FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView, new FacebookFragment()).commit();
                    toolbar.setTitle("Facebook");
                    fragmentTransaction1.addToBackStack(null);
                    nToggle.setDrawerIndicatorEnabled(false);
                    nToggle.setHomeAsUpIndicator(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
                }

                return false;
            }
        });

        nDrawLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        nToggle = new ActionBarDrawerToggle(this, nDrawLayout, R.string.open, R.string.close);
        nDrawLayout.addDrawerListener(nToggle);
        nToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //getting the fragment return to home page
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
