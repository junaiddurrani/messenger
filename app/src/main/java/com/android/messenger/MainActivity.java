package com.android.messenger;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.content_main, new HomeFragment()).commit();

        navigationView = findViewById(R.id.bottom_navigation_view);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        setFragment(new HomeFragment());
                        return true;
                    case R.id.contact:
                        setFragment(new ContactFragment());
                        return true;
                    case R.id.camera:
                        setFragment(new CameraFragment());
                        return true;
                    case R.id.game:
                        setFragment(new GameFragment());
                        return true;
                    case R.id.news:
                        setFragment(new NewsFragment());
                        return true;
                    default:
                        return false;
                }
            }
        });

    }

    private void setFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.content_main, fragment).commit();
    }
}