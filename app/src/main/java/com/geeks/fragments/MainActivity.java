package com.geeks.fragments;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
            NavigationUI.setupActionBarWithNavController(this, navController);
            navController.setGraph(R.navigation.nav_graph);

        } catch (Exception e) {
            Log.e("MainActivity", "NavController setup failed: ", e);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        try {
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
            return navController.navigateUp() || super.onSupportNavigateUp();
        } catch (Exception e) {
            Log.e("MainActivity", "Error in navigateUp: ", e);
            return super.onSupportNavigateUp();
        }
    }
}