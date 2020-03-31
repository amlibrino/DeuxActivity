package org.afpa.deuxactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void lanchLastActivity(View view) {
        Intent list = new Intent(this, TroisiemeAtivity.class);
        startActivity(list);
    }
}
