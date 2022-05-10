package com.example.mtador12.sofrabeta3.OrdersBasket;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.mtador12.sofrabeta3.RegisterCutomer.LoginActivity;
import com.example.mtador12.sofrabeta3.Navigation.BaseActivity;
import com.example.mtador12.sofrabeta3.R;

import java.util.ArrayList;

public class OrdersBasketActivity extends BaseActivity {

    private RecyclerAdapterOrderBasket recyclerviewAdapter;
    private RecyclerView mrecyclerView;
    private ArrayList<OrdersBasketData> lstorderbaskets;

    private Button gotoLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initToolBar("سله الطلبات");
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame);
        getLayoutInflater().inflate(R.layout.activity_orders_basket, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        mrecyclerView = findViewById(R.id.recyclerview_requestBasket);

        lstorderbaskets = new ArrayList<>();
        lstorderbaskets.add(new OrdersBasketData("ساندوتش برجر تركي"));
        lstorderbaskets.add(new OrdersBasketData("ساندوتش برجر تركي"));
        recyclerviewAdapter = new RecyclerAdapterOrderBasket(this,lstorderbaskets);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mrecyclerView.setAdapter(recyclerviewAdapter);

        gotoLogin = findViewById(R.id.makeOrderBt_ID);
        gotoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrdersBasketActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

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
