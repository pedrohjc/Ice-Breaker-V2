package com.example.android.ice_breaker_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_acivity);

        ImageButton accept = (ImageButton) findViewById(R.id.image_button_accept);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuAcivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        ImageButton decline = (ImageButton) findViewById(R.id.image_button_decline);
        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuAcivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
