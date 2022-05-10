package com.example.mtador12.sofrabeta3.Products;

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

import com.example.mtador12.sofrabeta3.AddProduct.AddProductActivity;
import com.example.mtador12.sofrabeta3.Navigation.Base2Activity;
import com.example.mtador12.sofrabeta3.R;

import java.util.ArrayList;

public class ProductsActivity extends Base2Activity {

    private RecyclerViewAdapterProducts recyclerViewAdapterproducts;
    private RecyclerView mrecyclerView;
    private ArrayList<ProductsData> lstProductData;
    private LinearLayout addProductLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolBar("جديد العروض");
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame2);
        getLayoutInflater().inflate(R.layout.activity_products, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view2);

        mrecyclerView = findViewById(R.id.recyclerviewProducts_ID);
        lstProductData = new ArrayList<>();
        lstProductData.add(new ProductsData("ساندوتش برجر تركي"));
        lstProductData.add(new ProductsData("ساندوتش برجر تركي"));
        lstProductData.add(new ProductsData("ساندوتش برجر تركي"));
        lstProductData.add(new ProductsData("ساندوتش برجر تركي"));
        lstProductData.add(new ProductsData("ساندوتش برجر تركي"));
        lstProductData.add(new ProductsData("ساندوتش برجر تركي"));

        recyclerViewAdapterproducts = new RecyclerViewAdapterProducts(this,lstProductData);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mrecyclerView.setAdapter(recyclerViewAdapterproducts);

        addProductLinear = findViewById(R.id.addProductlinear_ID);
        addProductLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductsActivity.this,AddProductActivity.class);
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
