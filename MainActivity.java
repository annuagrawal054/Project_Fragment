package com.example.my.fragmentexample;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView)findViewById(R.id.gridview);
        gridView.setAdapter(new MyAdapter(this));

        gridView.setOnItemClickListener(new OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                switch(position)
                {
                    case 0:
                        Intent new0Activity = new Intent(MainActivity.this,C_Ques_List.class);
                        startActivity(new0Activity);
                        break;
                    case 1:
                        Intent new1Activity = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(new1Activity);
                        break;

                    case 2:
                        Intent new2Activity = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(new2Activity);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Wrong Input", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
    }


