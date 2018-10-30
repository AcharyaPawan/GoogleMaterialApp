package com.example.pawan.googlematerial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.My_toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.new_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id= item!!.itemId


        if(id== R.id.ABT)
            Toast.makeText(this , "You clicked About", Toast.LENGTH_SHORT).show()

        if(id== R.id.Ex)
            Toast.makeText(this,"You clicked Exit", Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}
