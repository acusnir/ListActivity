package com.concordia.cejv669.listactivity;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] mApps = {"Skype", "WhatsApp", "Yahoo Messenger"};

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, mApps);
        setListAdapter(adapter);
    }
}
