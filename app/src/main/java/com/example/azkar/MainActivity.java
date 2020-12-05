package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerZikr = findViewById(R.id.spinner_zikr_type);

        List<String> zikrType = DataManager.getInstance().getZikrType();

        ArrayAdapter<String> zikrAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, zikrType);
        zikrAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerZikr.setAdapter(zikrAdapter);

        TextView tv = findViewById(R.id.warning_text_view);

        Button submit = findViewById(R.id.button_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Alazkar.class);

                if (spinnerZikr.getSelectedItem().equals("اختر ذكر")) {
                    tv.setVisibility(View.VISIBLE);

                } else if (spinnerZikr.getSelectedItem().equals("أذكار الصباح")) {
                    tv.setVisibility(View.INVISIBLE);
                    intent.putExtra(Alazkar.INTENT_RESULT, "sabah");
                    startActivity(intent);

                } else if (spinnerZikr.getSelectedItem().equals("أذكار المساء")) {
                    tv.setVisibility(View.INVISIBLE);
                    intent.putExtra(Alazkar.INTENT_RESULT, "masaa");
                    startActivity(intent);
                }
            }
        });
    }
}