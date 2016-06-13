package com.example.my.fragmentexample;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by annu on 29/5/16.
 */
public class CHomeActivity extends Activity {

    static Fragment fr;
    Button bnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_home_activity);
        bnext = (Button)findViewById(R.id.bnexx);
        fr = new HomeFragment();
        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fr = new CQuesTwoFragment();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.home_fragment, fr);
                fragmentTransaction.commit();
            }
        });

    }
}
