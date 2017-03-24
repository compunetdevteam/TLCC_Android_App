package com.example.ogan.tlcc;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class HomeScreen extends AppCompatActivity {

    private DrawerLayout nDrawLayout;
    private ActionBarDrawerToggle nToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        nDrawLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        nToggle = new ActionBarDrawerToggle(this, nDrawLayout, R.string.open, R.string.close);
        nDrawLayout.addDrawerListener(nToggle);
        nToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
