package com.example.kam.mytourism;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TourismListActivity extends ListActivity {

    String[] tour={"Hundru Fall","Dasham Fall","Pahadi Mandir","Patratu Valley","Deori Mandir"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,tour);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this,""+tour[position], Toast.LENGTH_SHORT).show();

        switch(position)
        {

            case 0: {
            Intent i = new Intent(this, HundruFall.class);
            startActivity(i);
                break;
            }

            case 1: {
                Intent i = new Intent(this, DashamFall.class);
                startActivity(i);
                break;
            }

            case 2: {
                Intent i = new Intent(this, PahadiMandir.class);
                startActivity(i);
                break;
            }
            case 3: {
                Intent i = new Intent(this, PatratuValley.class);
                startActivity(i);
                break;
            }

            case 4: {
                Intent i = new Intent(this, DeoriMandir.class);
                startActivity(i);
                break;
            }

        }
    }
}
