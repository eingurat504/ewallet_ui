package com.example.tabapp;

import android.os.Bundle;

import com.example.tabapp.fragment.AccountFragment;
import com.example.tabapp.fragment.MarketFragment;
import com.example.tabapp.fragment.PerformanceFragment;
import com.example.tabapp.fragment.ProfileFragment;
import com.example.tabapp.fragment.TradeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.tabapp.ui.main.SectionsPagerAdapter;
import com.example.tabapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private Toolbar mTopToolbar;

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityMainBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());


        mTopToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mTopToolbar);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

//        bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);
//        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

//        toolbar.setTitle(menus[0]);
//        loadFragment(new AccountFragment());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.accounts) {
            Toast.makeText(MainActivity.this, "Action clicked", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//            Fragment fragment;
//            switch (item.getItemId()){
//                case R.id.accounts:
//                    fragment = new AccountFragment();
////                    toolbar.setTitle(menus[0]);
//                    loadFragment(fragment);
//                    return true;
//                case R.id.trade:
////                    toolbar.setTitle(menus[1]);
//                    fragment = new TradeFragment();
//                    loadFragment(fragment);
//                    return true;
//
//                case R.id.markets:
////                    toolbar.setTitle(menus[2]);
//                    fragment = new MarketFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.performances:
////                    toolbar.setTitle(menus[2]);
//                    fragment = new PerformanceFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.profile:
////                    toolbar.setTitle(menus[3]);
//                    fragment = new ProfileFragment();
//                    loadFragment(fragment);
//                    return true;
//            }
//            return false;
//        };
//    };

//    private void loadFragment(Fragment fragment){
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.frame_layout,fragment);
//        fragmentTransaction.commit();
//    }
//
//
}