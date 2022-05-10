package com.example.mtador12.sofrabeta3.FoodMenu;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.mtador12.sofrabeta3.Navigation.BaseActivity;
import com.example.mtador12.sofrabeta3.R;

public class FoodMenuActivity extends BaseActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapterMenuFood adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initToolBar("طلب طعام");
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame);
        getLayoutInflater().inflate(R.layout.activity_food_menu, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        tabLayout = findViewById(R.id.tablelayout2_ID);
        viewPager = findViewById(R.id.viewpager2_ID);
        adapter = new ViewPagerAdapterMenuFood(getSupportFragmentManager());


        adapter.AddFragmentt(new MenuFoodFragment(),"قائمه الطعام");
        adapter.AddFragmentt(new ReviewCommentFragment(),"التعليقات والتقيم");
        adapter.AddFragmentt(new StoreInfoFragment(),"معلومات المتجر");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
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
        if (id == R.id.backmenu_ID) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
