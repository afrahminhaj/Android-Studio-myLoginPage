
package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class homepage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        TextView mytextview=(TextView)findViewById(R.id.textView);
        mytextview.setTextSize(20);
        Intent i = getIntent();
        Bundle b2=i.getExtras();
        String uname=b2.getString("user");
        String branch=b2.getString("branch");
        int section=b2.getInt("section");
        double marks=b2.getDouble("marks");
        mytextview.setText("Hello, "+uname+"\n Your Branch: "+branch+"\n Your Section: "+section
        +"\n Your Marks are: "+marks);



        //String user = i.getStringExtra("userid");


    }

    public void logout(View v){
        Intent lo = new Intent(homepage.this,myLoginActivity.class);
        startActivity(lo);

    }
}