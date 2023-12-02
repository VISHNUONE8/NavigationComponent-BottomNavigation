package com.vishnu.navigationcomponent_bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setNavController()
    }


    private fun setNavController(){
        try{
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.navigationHostFragment) as NavHostFragment
            val navController = navHostFragment.navController

            // Find reference to bottom navigation view
            val navView: BottomNavigationView = findViewById(R.id.bottomNavigation)
            // Hook your navigation controller to bottom navigation view
            navView.setupWithNavController(navController)
        } catch (e:Exception){
            Log.e(TAG,"there is an exception${e.message.toString()}")
        }
    }

}