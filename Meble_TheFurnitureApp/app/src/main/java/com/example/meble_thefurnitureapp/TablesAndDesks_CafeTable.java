package com.example.meble_thefurnitureapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

public class TablesAndDesks_CafeTable extends AppCompatActivity implements PaymentResultListener {

    String API_KEY = "rzp_test_ug6aiUEmeZMscW";
    Checkout checkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables_and_desks_cafe_table);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#A18D67")));

        Checkout.preload(getApplicationContext());
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }

        return true;
    }

    public void Buy_ca(View view) {

        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Nakamura Cafe Table");
            object.put("amount","3800000");

            object.put("currency","INR");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            object.put("retry", retryObj);

            checkout.open(activity,object);



        }


        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void Buy_ca1(View view) {

        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Hutch Cafe Table with Couch");
            object.put("amount","2900000");

            object.put("currency","INR");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            object.put("retry", retryObj);

            checkout.open(activity,object);



        }


        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void Buy_ca2(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Eskada Cafe Table");
            object.put("amount","4200000");

            object.put("currency","INR");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            object.put("retry", retryObj);

            checkout.open(activity,object);



        }


        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void Buy_ca3(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Stark Cafe Table");
            object.put("amount","5400000");

            object.put("currency","INR");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            object.put("retry", retryObj);

            checkout.open(activity,object);



        }


        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void Buy_ca4(View view) {
        checkout = new Checkout();
        checkout.setKeyID(API_KEY);

        final Activity activity = this;

        try {
            JSONObject object = new JSONObject();
            object.put("Name","Zenith Cafe Table");
            object.put("amount","3200000");

            object.put("currency","INR");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            object.put("retry", retryObj);

            checkout.open(activity,object);



        }


        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onPaymentSuccess(String s) {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }
}