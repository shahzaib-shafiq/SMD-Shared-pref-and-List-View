package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText editText_Name,editText_CNIC,editText_PHONE,editText_SGPA,editText_CGPA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_Name=(EditText)findViewById(R.id.editText_Name);
        editText_CNIC=(EditText)findViewById(R.id.editText_CNIC);
        editText_PHONE=(EditText)findViewById(R.id.editText_PHONE);
        editText_SGPA=(EditText)findViewById(R.id.editText_SGPA);
        editText_CGPA=(EditText)findViewById(R.id.editText_CGPA);


    }
    public void SAVE_DATA(View view) {


        SharedPreferences sharedPreferences=getSharedPreferences("StudentData",MODE_PRIVATE);
        SharedPreferences.Editor ed=sharedPreferences.edit();

        ed.putString("Name",editText_Name.getText().toString());
        ed.putString("Cnic",editText_CNIC.getText().toString());
        ed.putString("Phone",editText_PHONE.getText().toString());
        ed.putString("Sgpa",editText_SGPA.getText().toString());
        ed.putString("Cgpa",editText_CGPA.getText().toString());
        ed.commit();


        editText_Name.setText(" ");
        editText_CNIC.setText(" ");
        editText_PHONE.setText(" ");
        editText_SGPA.setText(" ");
        editText_CGPA.setText(" ");

        Toast.makeText(this,"Data Inserted",Toast.LENGTH_LONG).show();

        Intent intent = new Intent(MainActivity.this,ListViewDisplay.class);
        startActivity(intent);
    }
}