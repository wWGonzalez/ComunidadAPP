package umg.community.app.com.communityumg.interfaces;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import umg.community.app.com.communityumg.Fragments.About;
import umg.community.app.com.communityumg.Fragments.Favorites;
import umg.community.app.com.communityumg.Fragments.Home;
import umg.community.app.com.communityumg.Fragments.Settings;
import umg.community.app.com.communityumg.R;

public class Main2Activity extends AppCompatActivity {
    LinearLayout linearLayout1;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        linearLayout1 = findViewById(R.id.linear_semestre1);
        setLiner1(linearLayout1);
    }


    //Establece evento para Liner 1
    private  void setLiner1(LinearLayout liner){
        // LinearLayout menu_photos = (LinearLayout )findViewById(R.id.linear_semestre1);
        liner.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //MyCustomAlertDialog("Accidente");
                hola();

            }
        });
    }

    public void hola(){
        Toast.makeText(this,"Hola",Toast.LENGTH_SHORT).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_drawer, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.homeAsUp:
                hola();
                //crear nuevo aviso
             //   btn_buscarPersona(null);
                return true;
            case R.id.action_pagina_web:
                //crear nuevo aviso
                Uri uri = Uri.parse("http://bomberossanpedro.pythonanywhere.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
            case R.id.action_historia:
                //crear nuevo aviso
               // abrir_hitoria(null);
                return true;
            case R.id.action_quienes_somos:

                Intent M = new Intent(this, about2.class);
                startActivity(M);
                finish();

                //crear nuevo aviso
               // abrir_quienes_somos(null);
                return true;
            case R.id.action_desarrolladores:
                //crear nuevo aviso
               // abrir_desarrolladores(null);
                return true;
            case R.id.action_cambiar_idioma:
                //crear nuevo aviso
                //showDialog();
                return true;
            case R.id.action_salir:
                finish();
                return true;
            default:
                return false;
        }
    }




}
