package com.example.view_model_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT).setAction("Action", null).show();

            }
        });
        TextView mTextView = findViewById(R.id.number_id);
        ViewModelActivity myData = new ViewModelActivity();

        ViewModelActivity model = ViewModelProviders.of(this).get(ViewModelActivity.class);

        String myRandomNumber = model.getNumber();
        mTextView.setText(myRandomNumber);
        Log.i(TAG, "Random Number Set");

    }

}