package com.thiagoretondar.addressbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        String[] students = {"Thiago", "Tiffany", "Felipe", "Paulo", "Thiago", "Tiffany", "Felipe",
                "Paulo", "Thiago", "Tiffany", "Felipe", "Paulo", "Thiago", "Tiffany", "Felipe", "Paulo"};

        ListView studentList = (ListView) findViewById(R.id.student_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, students);
        studentList.setAdapter(adapter);

        Button newContactBtn = (Button) findViewById(R.id.student_new_btn);
        newContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToFormIntent = new Intent(StudentListActivity.this, FormActivity.class);
                startActivity(goToFormIntent);
            }
        });
    }

}
