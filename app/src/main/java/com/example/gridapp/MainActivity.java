package com.example.gridapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        // Data to be displayed into gridView

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("Blog Course",R.drawable.blogcourse));
        courseModelArrayList.add(new CourseModel("Training Course",R.drawable.traingcourse));
        courseModelArrayList.add(new CourseModel("videoCourse",R.drawable.videocourse));
        courseModelArrayList.add(new CourseModel("Complete Data Strucutre",R.drawable.blogcourse));

        // Attach the Adapter

        MyAdapter myAdapter = new MyAdapter(this, courseModelArrayList);
        gridView.setAdapter(myAdapter);



    }
}