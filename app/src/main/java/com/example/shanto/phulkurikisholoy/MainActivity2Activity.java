package com.example.shanto.phulkurikisholoy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity2Activity extends Activity {

    public Button butt;
    public Button but2;
    public Button but3;
    public Button but4;
    public Button but5;
    public Button but6;
    public Button but33;
    public Button but34;

    public void  init(){
        butt=(Button)findViewById(R.id.butt);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myy = new Intent(MainActivity2Activity.this,Introduction.class);

                startActivity(myy);

            }



        });


        but2=(Button)findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myy = new Intent(MainActivity2Activity.this,Established.class);

                startActivity(myy);

            }



        });




        but3=(Button)findViewById(R.id.but3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity2Activity.this,ideologies.class);

                startActivity(toy);

            }



        });


        but4=(Button)findViewById(R.id.but4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myy = new Intent(MainActivity2Activity.this,Programs.class);

                startActivity(myy);

            }



        });


        but5=(Button)findViewById(R.id.but5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity2Activity.this,special_projects.class);

                startActivity(toy);

            }



        });


        but6=(Button)findViewById(R.id.but6);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myy = new Intent(MainActivity2Activity.this,Rajshahi_Regional_Members.class);

                startActivity(myy);

            }



        });


        but33=(Button)findViewById(R.id.but33);
        but33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity2Activity.this,Website.class);

                startActivity(toy);

            }



        });


        but34=(Button)findViewById(R.id.but34);
        but34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myy = new Intent(MainActivity2Activity.this,About_Developer.class);

                startActivity(myy);

            }



        });



    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        init();
        Toast loadingmess;
        loadingmess = Toast.makeText(this,
                "Welcome To Phulkuri App", Toast.LENGTH_SHORT);
        loadingmess.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
