package com.example.rts.simpleapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity implements View.OnClickListener {

    Button b1;
    int ACTIVITY_2= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            String message = data.getExtras().getString("msg");
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View view) {

        if (view == b1) {

            Intent i = new Intent (this, Activity2.class);
            startActivityForResult(i,ACTIVITY_2);

        }

    }
}
