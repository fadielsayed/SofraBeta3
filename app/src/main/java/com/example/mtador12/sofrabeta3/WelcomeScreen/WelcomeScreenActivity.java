package com.example.mtador12.sofrabeta3.WelcomeScreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mtador12.sofrabeta3.FoodMenuSeller.FoodMenuSellerActivity;
import com.example.mtador12.sofrabeta3.OrderFood.OrderFoodActivity;
import com.example.mtador12.sofrabeta3.R;

public class WelcomeScreenActivity extends AppCompatActivity {

    Button orderButton,sellButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        orderButton = findViewById(R.id.orderButton_ID);
        sellButton = findViewById(R.id.sellButton_ID);


        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreenActivity.this,OrderFoodActivity.class);
                startActivity(intent);
            }
        });

        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreenActivity.this,FoodMenuSellerActivity.class);
                startActivity(intent);
            }
        });
    }
}
