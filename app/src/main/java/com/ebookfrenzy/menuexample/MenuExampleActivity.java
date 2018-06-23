package com.ebookfrenzy.menuexample;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MenuExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_example);
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        ConstraintLayout mainLayout = findViewById(R.id.layoutView);

        Drawable background = mainLayout.getBackground();

        TextView selectionMsg = findViewById(R.id.selectionMsg);

        int color = Color.TRANSPARENT;

        String selectionMessage = "You have chosen the color";

        if(background instanceof ColorDrawable) color = ((ColorDrawable) background).getColor();


        switch (item.getItemId()) {
            case R.id.menu_red:
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                mainLayout.setBackgroundColor(android.graphics.Color.RED);
                selectionMsg.setTextColor(Color.WHITE);
                selectionMessage += " Red.";
                selectionMsg.setText(selectionMessage);
                return true;
            case R.id.menu_green:
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                mainLayout.setBackgroundColor(Color.GREEN);
                selectionMsg.setTextColor(Color.BLACK);
                selectionMessage += " Green.";
                selectionMsg.setText(selectionMessage);
                return true;
            case R.id.menu_yellow:
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                mainLayout.setBackgroundColor(Color.YELLOW);
                selectionMsg.setTextColor(Color.BLACK);
                selectionMessage += " Yellow.";
                selectionMsg.setText(selectionMessage);
                return true;
            case R.id.menu_blue:
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                mainLayout.setBackgroundColor(Color.BLUE);
                selectionMsg.setTextColor(Color.WHITE);
                selectionMessage += " Blue.";
                selectionMsg.setText(selectionMessage);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
