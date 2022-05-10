package com.example.mtador12.sofrabeta3.FoodMenuSeller;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.mtador12.sofrabeta3.Navigation.Base2Activity;
import com.example.mtador12.sofrabeta3.R;

public class FoodMenuSellerActivity extends Base2Activity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapterMenuFoodSeller adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initToolBar("طلب طعام");
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame2);
        getLayoutInflater().inflate(R.layout.activity_food_menu_seller, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view2);

        tabLayout = findViewById(R.id.tablelayoutseller_ID);
        viewPager = findViewById(R.id.viewpagerseller_ID);
        adapter = new ViewPagerAdapterMenuFoodSeller(getSupportFragmentManager());


        adapter.AddFragmentt(new MenuFoodSellerFragment(),"قائمه الطعام");
        adapter.AddFragmentt(new ReviewCommentFragmentSeller(),"التعليقات والتقيم");
        adapter.AddFragmentt(new StoreInfoFragmentSeller(),"معلومات المتجر");

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
