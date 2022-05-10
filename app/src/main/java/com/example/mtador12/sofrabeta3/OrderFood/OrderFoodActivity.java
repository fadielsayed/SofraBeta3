package com.example.mtador12.sofrabeta3.OrderFood;

import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.mtador12.sofrabeta3.Navigation.BaseActivity;
import com.example.mtador12.sofrabeta3.R;

import java.util.ArrayList;

public class OrderFoodActivity extends BaseActivity {

    private RecyclerviewAdapter recyclerviewAdapter;
    private RecyclerView mrecyclerView;
    private ArrayList<Food> lstFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initToolBar("طلب طعام");
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame);
        getLayoutInflater().inflate(R.layout.activity_order_food, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        mrecyclerView = findViewById(R.id.orderfood_recycler);

        lstFood = new ArrayList<>();
        lstFood.add(new Food("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstFood.add(new Food("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        lstFood.add(new Food("تاج الفطيره الدمشقيه",R.drawable.sofraimage));
        recyclerviewAdapter = new RecyclerviewAdapter(this,lstFood);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mrecyclerView.setAdapter(recyclerviewAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.backmenu_ID) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
