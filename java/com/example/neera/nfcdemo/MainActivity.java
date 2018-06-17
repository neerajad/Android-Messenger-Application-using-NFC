package com.example.neera.nfcdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.neera.nfcdemo.R;

import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callMessageActivity(View view) {
        final Context context = this;
        Intent intent = new Intent(context, SendMessageActivity.class);
        startActivity(intent);
    }

    public void callImageActivity(View view) {
        final Context context = this;
        Intent intent = new Intent(context, SendImageActivity.class);
        startActivity(intent);
    }

    public void transferDoc(View view) {
        final Context context = this;
        Intent intent = new Intent(context, SentDocActivity.class);
        startActivity(intent);

    }


}