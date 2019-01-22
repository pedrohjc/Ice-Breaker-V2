package com.example.android.ice_breaker_v2;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class UsersList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_list);

        final ArrayList<User> userList = new ArrayList<User>();
        Button add = (Button) findViewById(R.id.add_btn);

        userList.add(new User("Pedro","Carvalho",28,"Toronto"));
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(UsersList.this);
                builder.setTitle("Add new User");
                final EditText last = new EditText(UsersList.this);
                builder.setView(last);
//                final EditText first = new EditText(UsersList.this);
//                builder.setView(first);
//                final EditText city = new EditText(UsersList.this);
//                builder.setView(city);
//                final EditText age = new EditText(UsersList.this);
//                builder.setView(age);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String ln = last.getText().toString();
//                        Toast.makeText(getApplicationContext(), "OK button Pressed", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), "last name:" + ln, Toast.LENGTH_LONG).show();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "CANCEL button Pressed", Toast.LENGTH_LONG).show();
                    }
                });

                builder.show();
            }
        });
    }

}


