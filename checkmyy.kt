package com.example.pawan.googlematerial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.My_toolbar))


        fun onCreateOptionsMenu(menu: Menu?): Boolean {
             super.onCreateOptionsMenu(menu)
            menuInflater.inflate(R.menu.new_menu,menu)
            return true

        }

        fun onOptionsItemSelected(item: MenuItem?): Boolean {
            val id= item!!.itemId


            if(id== R.id.ABT)
                Toast.makeText(this , "You clicked About", Toast.LENGTH_SHORT).show()

            if(id== R.id.Ex)
                Toast.makeText(this,"You clicked Exit option", Toast.LENGTH_LONG).show()

            if(id==R.id.search)
                Toast.makeText(this,"You clicked search",Toast.LENGTH_LONG).show()


            return super.onOptionsItemSelected(item)



        }
}}
