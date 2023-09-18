package com.example.menu_options;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    String st;
    Intent gi = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"Yellow");
        return true;
    }

    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        st = item.getTitle().toString();
        if (st.equals("Red")) {
            setActivityBackgroundColor(Color.RED);
        } else if (st.equals("Green")) {
            setActivityBackgroundColor(Color.GREEN);
        } else if (st.equals("Blue")) {
            setActivityBackgroundColor(Color.BLUE);}
        else if (st.equals("Yellow")) {
            setActivityBackgroundColor(Color.YELLOW);}
        return super.onOptionsItemSelected(item);
    }

    public void myreturn(View view) {
        finish();
    }
}