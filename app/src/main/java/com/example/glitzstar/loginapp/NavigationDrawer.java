package com.example.glitzstar.loginapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

public class NavigationDrawer extends AppCompatActivity {



    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        dl = (DrawerLayout)findViewById(R.id.drawer);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.support:
                        Log.d("archana","support");
                        return true;
//                        Toast.makeText(getApplicationContext(), "Support",Toast.LENGTH_SHORT).show();
                        //break;
                    case R.id.refer:

                        Log.d("archana","refer");
                        return true;
                        //break;
//                        Toast.makeText(getApplicationContext(), "Refer and Earn",Toast.LENGTH_SHORT).show();
                    case R.id.contact:
                        Log.d("archana","contact");
                        return true;
                        //break;
//                        Toast.makeText(getApplicationContext(), "Contact Us",Toast.LENGTH_SHORT).show();
                    default:
                        return true;
                }
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))

        {
            Log.d("archana", item.toString());
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    }

