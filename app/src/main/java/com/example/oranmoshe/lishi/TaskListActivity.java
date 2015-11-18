package com.example.oranmoshe.lishi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class TaskListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ArrayList<ListViewItem> items;
        String[] arr = {"Task 1","Task 2","Task 3","Task 4","Task 5","Task 6","Task 7","Task 8","Task 9","Task 10"};
        ListView lv = (ListView)findViewById(R.id.listViewTasks);
        items = new ArrayList<ListViewItem>();
        items.add(new ListViewItem("tesk1"));
        items.add(new ListViewItem("tesk2"));
        items.add(new ListViewItem("tesk3"));
        items.add(new ListViewItem("tesk4"));
        CustomAdapter customAdapter;
        customAdapter = new CustomAdapter(this,items);
        lv.setAdapter(customAdapter);

    }

    public void onClickFunc(View v){

        Intent intent = new Intent(this,CreateTaskActivity.class);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
