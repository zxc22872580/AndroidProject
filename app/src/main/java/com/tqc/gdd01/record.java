package com.tqc.gdd01;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class record extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record);
        SharedPreferences preferences = getSharedPreferences("myPrefs", MODE_PRIVATE);
        int value = preferences.getInt("value", 0);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<String> data1 = new ArrayList<>();
        ArrayList<String> data2 = new ArrayList<>();
        ArrayList<String> data3 = new ArrayList<>();
        for(int i=0;i<=value;i++)
        {
            String date = preferences.getString("pDate"+i, null);
            data1.add(date);
            String sex = preferences.getString("pSex"+i, null);
            data2.add(sex);
            String Bmi = preferences.getString("pBmi"+i, null);
            data3.add(Bmi);
        }


        MyAdapter adapter = new MyAdapter(data1,data2,data3);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);

    }
}

