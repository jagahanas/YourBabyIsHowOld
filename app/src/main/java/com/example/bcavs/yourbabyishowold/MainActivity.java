package com.example.bcavs.yourbabyishowold;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.ageinyr";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    //.add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
    /** Called when the user clicks the Calculate age button */
    public void calculateAge(View view) {
        // Do something in response to button
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText ageinmo = (EditText) findViewById(R.id.agePrompt);
        Float ageinyrflexact = Float.valueOf(ageinmo.getText().toString())/(float)12.00;
        Float ageinyrflround = Float.valueOf(Math.round(2.0*Float.valueOf(ageinmo.getText().toString())/(float)12.00))/(float)2.0;


        //String ageinyr = String.format("%.2f",(Float.valueOf(ageinmo.getText().toString())/(float)12.00));


        //intent.putExtra(EXTRA_MESSAGE, ageinyr);
        //startActivity(intent);

        TextView textView = new TextView(this);
        textView.setTextSize(35);
        textView.setText("Just say " + ageinyrflround + " years old!!!");
        textView.setGravity(Gravity.CENTER);
        //LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(();
        //addContentView(textView,);
        setContentView(textView);
        //test git repo
    }
}
