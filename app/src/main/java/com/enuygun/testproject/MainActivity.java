package com.enuygun.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewPerson;
    PersonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPerson = (RecyclerView) findViewById(R.id.recylerviewPerson);
        recyclerViewPerson.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerViewPerson.setLayoutManager(mLayoutManager);

        adapter = new PersonAdapter(Utils.getPersonList());
        recyclerViewPerson.setAdapter(adapter);
    }
}
