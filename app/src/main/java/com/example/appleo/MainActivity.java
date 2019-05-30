package com.example.appleo;

import android.content.Context;
import android.net.NetworkInfo;
import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.ConnectivityManager;


public class MainActivity extends AppCompatActivity {


    final static String TAG = "MainActivity dit: ";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1click(View view){
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

    public boolean phoneOnline(){
        ConnectivityManager manager =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        assert manager != null;
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        boolean online = false;
        if (networkInfo != null && networkInfo.isConnected()) {
            // Network is present and connected
            online = true;
        }
        return online;
    }

    public void liveCams(View view){
        if(phoneOnline()) {
            Intent intent = new Intent(this, Cams.class);
            startActivity(intent);
        }else{
            Context context = getApplicationContext();
            String text = "Network offline";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
