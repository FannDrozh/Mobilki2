package com.example.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GetList(View v)
    {
        ListView lstv = (ListView) findViewById(R.id.listview1);

        List<Map<String,String>> Mydatalist = null;
        ListItem Mydata = new ListItem();
        Mydatalist = Mydata.getlist();

        String[] Fromw = {"Country_ID", "Country", "Population"};
        int[] Tow={R.id.Country_ID, R.id.Country, R.id.Population};
        ad = new SimpleAdapter(MainActivity.this, Mydatalist, R.layout.listayouttemplate, Fromw, Tow);
        lstv.setAdapter(ad);
    }
}