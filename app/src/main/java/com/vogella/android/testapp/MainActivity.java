package com.vogella.android.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioGroup;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup group1 = (RadioGroup) findViewById(R.id.orientation);
        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.horizontal:
                        group.setOrientation(LinearLayout.HORIZONTAL);
                        break;
                    case R.id.vertical:
                        group.setOrientation(LinearLayout.VERTICAL);
                        break;
                }
            }
        });

    }

    public void onClick(View view) {
        EditText input = (EditText) findViewById(R.id.main_input);
        String string = input.getText().toString();
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }
}


