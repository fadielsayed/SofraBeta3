package com.example.mtador12.sofrabeta3.NewOffer;

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

public class NewOffersActivity extends BaseActivity {

    private RecyclerViewAdapterOffer recyclerViewAdapterOffer;
    private RecyclerView mrecyclerView;
    private ArrayList<NewOfferData> lstNewofferData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initToolBar("جديد العروض");
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame);
        getLayoutInflater().inflate(R.layout.activity_new_offer, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        mrecyclerView = findViewById(R.id.newofferRecycler_ID);
        lstNewofferData = new ArrayList<>();
        lstNewofferData.add(new NewOfferData("احصل على خصم 50% على كل طلب جديد",R.drawable.sofraimage));
        lstNewofferData.add(new NewOfferData("احصل على خصم 50% على كل طلب جديد",R.drawable.sofraimage));
        lstNewofferData.add(new NewOfferData("احصل على خصم 50% على كل طلب جديد",R.drawable.sofraimage));
        lstNewofferData.add(new NewOfferData("احصل على خصم 50% على كل طلب جديد",R.drawable.sofraimage));
        lstNewofferData.add(new NewOfferData("احصل على خصم 50% على كل طلب جديد",R.drawable.sofraimage));
        lstNewofferData.add(new NewOfferData("احصل على خصم 50% على كل طلب جديد",R.drawable.sofraimage));
        recyclerViewAdapterOffer = new RecyclerViewAdapterOffer(this,lstNewofferData);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mrecyclerView.setAdapter(recyclerViewAdapterOffer);
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
