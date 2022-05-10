package com.example.mtador12.sofrabeta3.RegisterSeller;

import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.mtador12.sofrabeta3.Navigation.Base2Activity;
import com.example.mtador12.sofrabeta3.R;

public class SignUpSellerCompleteActivity extends Base2Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolBar(" انشاء حساب جديد");
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame2);
        getLayoutInflater().inflate(R.layout.activity_sign_up_seller_complete, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view2);

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
