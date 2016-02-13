package com.example.joaopfsilva.portfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

import static com.example.joaopfsilva.portfolioapp.R.id.buttonLibrary;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    private static Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button spotify = (Button) findViewById(R.id.buttonSpotify);
        spotify.setOnClickListener(this);

        Button score = (Button) findViewById(R.id.buttonScore);
        score.setOnClickListener(this);

        Button library = (Button) findViewById(R.id.buttonLibrary);
        library.setOnClickListener(this);

        Button bigger = (Button) findViewById(R.id.buttonBigger);
        bigger.setOnClickListener(this);

        Button bacon = (Button) findViewById(R.id.buttonBacon);
        bacon.setOnClickListener(this);

        Button capstone = (Button) findViewById(R.id.buttonCapstone);
        capstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        String tmptext = "";
        int duration = Toast.LENGTH_SHORT;

        if (toast != null)
            toast.cancel();

        switch (v.getId()) {

            case R.id.buttonSpotify:
                tmptext = "Spotify Streamer!";
                break;

            case R.id.buttonScore:
                tmptext = "Score App!";
                break;

            case R.id.buttonLibrary:
                tmptext = "Library App!";
                break;

            case R.id.buttonBigger:
                tmptext = "Bigger App!";
                break;

            case R.id.buttonBacon:
                tmptext = "Bacon App!";
                break;

            case R.id.buttonCapstone:
                tmptext = "Capstone App!";
                break;

            default:
                break;
        }

        String text = "This button will launch my " + tmptext;

        toast = Toast.makeText(context, text, duration);

        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
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


    public void onClose(IOException e) {

    }
}
