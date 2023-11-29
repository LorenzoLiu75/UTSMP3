package com.mobile.utsmp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNavigationView.setOnNavigationItemReselectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Handle Home item click
                    true
                }
                R.id.navigation_meal -> {
                    // Handle Meal Plans item click
                    true
                }
                R.id.navigation_exercise -> {
                    // Handle Exercise item click
                    true
                }
                R.id.navigation_profile -> {
                    // Handle Profile item click
                    true
                }
                else -> false
            }
        }

    }
}