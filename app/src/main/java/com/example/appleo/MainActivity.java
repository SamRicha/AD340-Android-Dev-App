package com.example.appleo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayToast(View v) {

        Toast.makeText(MainActivity.this,"Message Sent",Toast.LENGTH_SHORT).show();
    }

    public void displayToast1(View v) {
        Toast.makeText(MainActivity.this,"Carrots",Toast.LENGTH_SHORT).show();
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
