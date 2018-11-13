package com.example.phanp.doan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void  onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView= (BottomNavigationView)findViewById(R.id
                .navigation);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.action_item1:
                            selectedFragment = orderFragment.newInstance();
                            break;
                        case R.id.action_item2:
                            selectedFragment = orderFragment.newInstance();
                            break;
                        case R.id.action_item3:
                            selectedFragment = orderFragment.newInstance();
                            break;
                    }

            }
        });

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, orderFragment.newInstance());
        transaction.commit();
    }

}