package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewDisplay extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_display);


        listView=findViewById(R.id.listview1);
        SharedPreferences sharedPreferences=getSharedPreferences("StudentData",MODE_PRIVATE);

        // Get value from the file using sharedPreferences
        String name = sharedPreferences.getString("Name", "");
        String cnic = sharedPreferences.getString("Cnic", "");
        String phone = sharedPreferences.getString("Phone", "");
        String sgpa = sharedPreferences.getString("Sgpa", "");
        String cgpa = sharedPreferences.getString("Cgpa", "");

        String[] sdata={name,cnic,phone,sgpa,cgpa};

        //display adatpter to display the data items
        ArrayAdapter<String> adapter  = new ArrayAdapter<String>(ListViewDisplay.this, android.R.layout.simple_dropdown_item_1line, sdata);
        listView.setAdapter(adapter);

    }
}