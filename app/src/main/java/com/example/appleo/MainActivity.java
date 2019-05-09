package com.example.appleo;

import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    final static String TAG = "MainActivity dit: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void button1click(View view){
        Intent intent=new Intent(this,MovieList.class);
        startActivity(intent);
    }

    public void displayToast(View v) {

        Toast.makeText(MainActivity.this,"Message Sent",Toast.LENGTH_SHORT).show();
    }

    public void displayToast2(View v) {
        Toast.makeText(MainActivity.this,"Jelly",Toast.LENGTH_SHORT).show();
    }

    public void displayToast3(View v) {
        Toast.makeText(MainActivity.this,"Cookies",Toast.LENGTH_SHORT).show();
    }

    public void displayToast4(View v) {
        Toast.makeText(MainActivity.this,"Eggs",Toast.LENGTH_SHORT).show();
    }
}
