package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Alazkar extends AppCompatActivity {

    public static final String INTENT_RESULT = "com.example.azkar.RESULT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_zkar);

        Intent intent = getIntent();

        String result = intent.getStringExtra(INTENT_RESULT);

        displayAzkar(result);

    }

        private void displayAzkar(String zikrType) {
        List<Zikr> azkar = new ArrayList<>();
        if(zikrType.equals("masaa")) {
            azkar = DataManager.getInstance().getMasaaZikr();

        } else if(zikrType.equals("sabah")) {
            azkar = DataManager.getInstance().getSabahZikr();
        }

        ListView masaaListView = findViewById(R.id.azkar_list_view);

        ArrayAdapter<Zikr> azkarAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, azkar);
        masaaListView.setAdapter(azkarAdapter);
        }
}