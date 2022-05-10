package com.example.mtador12.sofrabeta3.Notify;

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

public class NotifyActivity extends BaseActivity {

    private RecyclerViewAdapterNotify recyclerViewAdapterNotify;
    private RecyclerView mrecyclerView;
    private ArrayList<NotifyData> lstNotifyData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolBar("طلباتي");
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame);
        getLayoutInflater().inflate(R.layout.activity_notify, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        mrecyclerView = findViewById(R.id.notifyRecycler_ID);
        lstNotifyData = new ArrayList<>();
        lstNotifyData.add(new NotifyData("التنبيه لم يظهر بعد",R.mipmap.notify));
        lstNotifyData.add(new NotifyData("التنبيه لم يظهر بعد",R.mipmap.notify));
        lstNotifyData.add(new NotifyData("التنبيه لم يظهر بعد",R.mipmap.notify));
        lstNotifyData.add(new NotifyData("التنبيه لم يظهر بعد",R.mipmap.notify));
        recyclerViewAdapterNotify = new RecyclerViewAdapterNotify(this,lstNotifyData);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mrecyclerView.setAdapter(recyclerViewAdapterNotify);
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
