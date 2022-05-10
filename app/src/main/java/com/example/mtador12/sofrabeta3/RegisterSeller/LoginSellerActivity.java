package com.example.mtador12.sofrabeta3.RegisterSeller;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.mtador12.sofrabeta3.Navigation.Base2Activity;
import com.example.mtador12.sofrabeta3.R;
import com.example.mtador12.sofrabeta3.RegisterCutomer.SignUpCustomerActivity;

public class LoginSellerActivity extends Base2Activity {

    private Button RegisterSellerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolBar("تسجيل الدخول");
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame2);
        getLayoutInflater().inflate(R.layout.activity_login_seller, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view2);
        RegisterSellerButton = findViewById(R.id.RegisterSellerButton_ID);
        RegisterSellerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSellerActivity.this,SignUpCustomerActivity.class);
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