package com.twindev.mqtt_semana15;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FirebaseActivity extends AppCompatActivity {

    private EditText editTextInput;
    private Button buttonSaveData;
    private RecyclerView recyclerView;
    private DataAdapter dataAdapter;
    private List<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);

        editTextInput = findViewById(R.id.editTextInput);
        buttonSaveData = findViewById(R.id.buttonSaveData);
        recyclerView = findViewById(R.id.recyclerView);

        dataList = new ArrayList<>();
        dataAdapter = new DataAdapter(dataList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(dataAdapter);

        buttonSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editTextInput.getText().toString().trim();
                if (!input.isEmpty()) {
                    dataList.add(input);
                    dataAdapter.notifyItemInserted(dataList.size() - 1);
                    editTextInput.setText("");
                }
            }
        });
    }
}
