package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Alazkar extends AppCompatActivity {

    public static final String INTENT_RESULT = "com.example.azkar.RESULT";
    public static String zikrClicked;

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

            // The ListView and all the code related to it would be removed and replaced
            // with a RecyclerView and code related to it.

//            ListView masaaListView = findViewById(R.id.azkar_list_view);
//
//            ArrayAdapter<Zikr> azkarAdapter =
//                    new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, azkar);
//            masaaListView.setAdapter(azkarAdapter);
//
//            List<Zikr> finalAzkar = azkar;
//            masaaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//
//                    zikrClicked = finalAzkar.get(position).getZikrText();
//
//                    DisplayZikrdialog displayZikrdialog = new DisplayZikrdialog();
//
//                    displayZikrdialog.show(getSupportFragmentManager(), "Example Dialog");
//
//                }
//            });

            RecyclerView zikrRecyclerView = findViewById(R.id.list_zikr);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            zikrRecyclerView.setLayoutManager(linearLayoutManager);

            ZikrRecyclerAdapter zikrRecyclerAdapter =
                    new ZikrRecyclerAdapter(this, azkar);

            zikrRecyclerView.setAdapter(zikrRecyclerAdapter);

        }
}