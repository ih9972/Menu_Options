package com.example.menu_options;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
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
        return super.onOptionsItemSelected(item);
    }

    public void move(View view) {
        Intent si = new Intent(this, MainActivity2.class);
        startActivity(si);
    }
}