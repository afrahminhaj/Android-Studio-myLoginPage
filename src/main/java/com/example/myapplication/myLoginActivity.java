package com.example.myapplication;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.widget.ViewAnimator;

import androidx.annotation.Nullable;

public class myLoginActivity extends Activity{
    Button b1;
    EditText userid,password,Branch,section,marks;


    @Override
    protected void onCreate(@Nullable Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.mylogin);
        b1=(Button)findViewById(R.id.button);
        userid=(EditText)findViewById(R.id.userid);
        password=(EditText)findViewById(R.id.password);
        Branch=(EditText)findViewById(R.id.Branch);
        section=(EditText)findViewById(R.id.section);
        marks=(EditText)findViewById(R.id.marks);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "Inside onStart", Toast.LENGTH_SHORT).show();
        Log.d("MyActivity","Inside onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "Inside onResume", Toast.LENGTH_SHORT).show();
        Log.d("MyActivity","Inside onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "Inside onPause", Toast.LENGTH_SHORT).show();
        Log.d("MyActivity","Inside onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "Inside onStop", Toast.LENGTH_SHORT).show();
        Log.d("MyActivity","Inside onStop");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(), "Inside onRestart", Toast.LENGTH_SHORT).show();
        Log.d("MyActivity","Inside onRestart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Inside onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("MyActivity","Inside onDestroy");
    }



    public void checkCredentials(View v){

    String u=userid.getText().toString();
    String p=password.getText().toString();
        Intent i=new Intent(myLoginActivity.this, homepage.class);
    if (u.equals("afrah") && p.equals("123.App")){

        Toast.makeText(getApplicationContext(),"logged in successfully",Toast.LENGTH_LONG).show();

    }
    else{
        Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
    }
    if (u.equals("afrah") && p.equals("123.App")){
        Bundle b1=new Bundle();
        b1.putString("user",u);
        b1.putString("branch",Branch.getText().toString());
        b1.putInt("section",Integer.parseInt(section.getText().toString()));
        b1.putDouble("marks",Float.parseFloat(marks.getText().toString()));
        i.putExtras(b1); //instead of putExtra
        Log.d("Mydebug","user id" +userid + "Password"+password);
        startActivity(i);
    }

    }
}

