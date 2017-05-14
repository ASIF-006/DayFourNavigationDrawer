package com.example.ussl_22.dayfournavigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        listView = (ListView) findViewById(R.id.thirdActivity_list_view);
        arrayList = new ArrayList<String>();
        arrayList.add("Bangladesh");
        arrayList.add("USA");
        arrayList.add("INDIA");
        arrayList.add("Nepal");
        arrayList.add("South Korea");
        arrayList.add("Russia");
        arrayList.add("UK");
        arrayList.add("Japan");
        arrayList.add("Australia");
        arrayList.add("North kora");
        arrayList.add("South Africa");
        arrayList.add("Canada");
        arrayList.add("Malaysia");
        arrayList.add("Singapore");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),arrayList.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
