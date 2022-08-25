package com.example.ccw6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ArrayList<Singer> singerArrayList = new ArrayList<>();
    int currentSinger = 0;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView singerPhoto = findViewById(R.id.singerPhoto);
        TextView singerName = findViewById(R.id.singerName);
        TextView singerAge = findViewById(R.id.singerAge);
        Button button = findViewById(R.id.next);


        Singer singer1 = new Singer("Zekra",44 , R.drawable.zekra);
        Singer singer2 = new Singer("um kolthom", 60 , R.drawable.umk);
        Singer singer3 = new Singer("warda", 55, R.drawable.warda);
        Singer singer4 = new Singer("nagat", 66, R.drawable.nagat);

        singerArrayList.add(singer1);
        singerArrayList.add(singer2);
        singerArrayList.add(singer3);
        singerArrayList.add(singer4);

        singerPhoto.setImageResource(singerArrayList.get(currentSinger).getSingerPhoto());
        singerName.setText(singerArrayList.get(currentSinger).getSingerName());
        singerAge.setText(singerArrayList.get(currentSinger).getSingerAge());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentSinger++;
                singerPhoto.setImageResource(singerArrayList.get(currentSinger).getSingerPhoto());
                singerName.setText(singerArrayList.get(currentSinger).getSingerName());
                singerAge.setText(singerArrayList.get(currentSinger).getSingerAge());

            }
        });

    }
}