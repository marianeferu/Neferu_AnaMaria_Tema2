package com.example.neferu_anamaria_tema2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    public static MyAppDatabase myAppDatabase;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();


        myAppDatabase = Room.databaseBuilder(getApplicationContext(),MyAppDatabase.class, "userdb").allowMainThreadQueries().build();



        if (findViewById(R.id.fragment_container) != null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container,new HomeFragment()).commit();
            //add homefragment to the main activity

        }

    }
}