package com.example.mtador12.sofrabeta3.MyOffers;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.mtador12.sofrabeta3.AddOffer.AddOfferActivity;
import com.example.mtador12.sofrabeta3.Navigation.Base2Activity;
import com.example.mtador12.sofrabeta3.R;

import java.util.ArrayList;

public class MyOffersActivity extends Base2Activity {

    private RecyclerAdapterMyOffers recyclerViewAdapternewofferss;
    private RecyclerView mrecyclerView;
    private ArrayList<MyOffersData> lstmyOffersData;
    private LinearLayout addOfferBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolBar("عروضي");
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame2);
        getLayoutInflater().inflate(R.layout.activity_my_offers, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view2);

        mrecyclerView = findViewById(R.id.recyclerMyOrders_ID);
        lstmyOffersData = new ArrayList<>();
        lstmyOffersData.add(new MyOffersData("محلات الفطيره الدمشقيه"));
        lstmyOffersData.add(new MyOffersData("محلات الفطيره الدمشقيه"));
        lstmyOffersData.add(new MyOffersData("محلات الفطيره الدمشقيه"));
        lstmyOffersData.add(new MyOffersData("محلات الفطيره الدمشقيه"));
        lstmyOffersData.add(new MyOffersData("محلات الفطيره الدمشقيه"));

        recyclerViewAdapternewofferss = new RecyclerAdapterMyOffers(this,lstmyOffersData);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mrecyclerView.setAdapter(recyclerViewAdapternewofferss);

        addOfferBt = findViewById(R.id.addProductlinear_ID);
        addOfferBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyOffersActivity.this,AddOfferActivity.class);
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

