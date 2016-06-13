package com.example.my.fragmentexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by annu on 29/5/16.
 */
public class C_Ques_List extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_ques_list_activity);

        LinearLayout layout_one = (LinearLayout )findViewById(R.id.linearLayout1);
        layout_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(C_Ques_List.this,CHomeActivity.class);
                startActivity(picture_intent );
            }
        });

        LinearLayout layout_two = (LinearLayout )findViewById(R.id.linearLayout2);
        layout_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(C_Ques_List.this,HomeFragment.class);
                startActivity(picture_intent );
            }
        });
    }
}
