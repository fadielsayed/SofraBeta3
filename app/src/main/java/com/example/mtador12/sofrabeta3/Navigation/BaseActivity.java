package com.example.mtador12.sofrabeta3.Navigation;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.mtador12.sofrabeta3.About.AboutAppActivity;
import com.example.mtador12.sofrabeta3.CallUs.CallUsActivity;
import com.example.mtador12.sofrabeta3.NewOffer.NewOffersActivity;
import com.example.mtador12.sofrabeta3.Notify.NotifyActivity;
import com.example.mtador12.sofrabeta3.OrderFood.OrderFoodActivity;
import com.example.mtador12.sofrabeta3.Orders.OrdersActivity;
import com.example.mtador12.sofrabeta3.R;

public class BaseActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        toolbar = (Toolbar) findViewById(R.id.Basetoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                final String appPackageName = getPackageName();
                switch (item.getItemId()) {

                    case R.id.homemenu_ID:
                        Intent dash = new Intent(getApplicationContext(), OrderFoodActivity.class);
                        startActivity(dash);
                        drawerLayout.closeDrawers();
                        break;


                    case R.id.ordersmenu_ID:
                        Intent anIntent = new Intent(getApplicationContext(), OrdersActivity.class);
                        startActivity(anIntent);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.notifymenu_ID:
                        Intent notifyIntent = new Intent(getApplicationContext(), NotifyActivity.class);
                        startActivity(notifyIntent);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.newOffersmenu_ID:
                        Intent newofferIntent = new Intent(getApplicationContext(), NewOffersActivity.class);
                        startActivity(newofferIntent);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.aboutaAppmenu_ID:
                        Intent aboutappIntent = new Intent(getApplicationContext(), AboutAppActivity.class);
                        startActivity(aboutappIntent);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.call_usmenu_ID:
                        Intent callusIntent = new Intent(getApplicationContext(), CallUsActivity.class);
                        startActivity(callusIntent);
                        drawerLayout.closeDrawers();
                        break;


                }
                return false;
            }
        });

    }

    public void initToolBar(String title) {
        toolbar.setTitle(title);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        actionBarDrawerToggle.syncState();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransitionExit();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransitionEnter();
    }

    /**
     * Overrides the pending Activity transition by performing the "Enter" animation.
     */
    protected void overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }

    /**
     * Overrides the pending Activity transition by performing the "Exit" animation.
     */
    protected void overridePendingTransitionExit() {
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

//    public void gotoLogin(View view){
//        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
//        startActivity(intent);
//    }

}

