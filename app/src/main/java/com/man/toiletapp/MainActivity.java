package com.man.toiletapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        GridView gridView_content= findViewById(R.id.content_session);
        SessionAdapter sessionAdapter = new SessionAdapter(this, getSessions());
        gridView_content.setAdapter(sessionAdapter);

    }

    private Session[] getSessions() {
        User[] users = {
                new User("child1"),
                new User("child2"),
                new User("child3"),
        };

        return new Session[]{
                new Session("name1", new User("name"), users),
                new Session("name2", new User("name"), users),
                new Session("name3", new User("name"), users),
                new Session("name4", new User("name"), users),
        };
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
