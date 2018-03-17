package com.example.kam.mytourism;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeoriMandir extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deori_mandir);

        b1= (Button) findViewById(R.id.button9);
        b2= (Button) findViewById(R.id.button10);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v==b1)
        {
            Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:33.5678,3.4556"));
            startActivity(i);
        }

        if(v==b2)
        {
            Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9006092749"));
            startActivity(i);
        }
    }
}
