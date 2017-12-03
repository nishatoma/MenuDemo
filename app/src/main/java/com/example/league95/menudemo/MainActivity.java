package com.example.league95.menudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * A program that adds a simple Menu to our app.
 * Things have changed with newer android updates. We have to add our menu
 * instead of the default existence.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * We need to add a few things before we can make menu work
     * We link our options menu with our xml file we created
     * We do that with something called menu inflater.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        /*link our xml menu with the menu passed on to the
        * method.*/
        menuInflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }
    /*-----------------------------------------------------------*/
    /**
     * None of the menu items will work unless we add a listener.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        /*Check which item was selected*/
        switch (item.getItemId())
        {
            case R.id.settings:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.help:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
        }
    }

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
