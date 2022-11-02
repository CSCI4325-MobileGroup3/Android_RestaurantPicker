package com.example.restaurantpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.restaurantpicker.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val TAG = "MainActivity/"

class MainActivity : AppCompatActivity()
{
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater);
        val view = binding.root;
        setContentView( view );

        val fragmentManager: FragmentManager = supportFragmentManager

        // define your fragments here
        val homeFragment: Fragment    = HomeFragment();
        val listFragment: Fragment    = ListListFragment();
        val mapFragment: Fragment     = MapFragment();
        val settingFragment: Fragment = SettingsFragment();

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // handle navigation selection
        bottomNavigationView.setOnItemSelectedListener { item ->
            lateinit var fragment: Fragment
            when (item.itemId) {
                R.id.nav_home -> fragment = homeFragment
                R.id.nav_list -> fragment = listFragment
                R.id.nav_map -> fragment = mapFragment
                R.id.nav_settings -> fragment = settingFragment
            }
            fragmentManager.beginTransaction().replace(R.id.main_frame, fragment).commit()
            true
        }

        // Set default selection
        bottomNavigationView.selectedItemId = R.id.nav_home
    }

}