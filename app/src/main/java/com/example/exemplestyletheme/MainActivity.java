package com.example.exemplestyletheme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Recuperer la taille de l'ecran en px
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;

        TextView textView = findViewById(R.id.text1);
        TextView textView2 = findViewById(R.id.text2);

        textView.setText(""+width);
        textView2.setText(""+height);

        ImageView imageView = findViewById(R.id.imageView);
        Picasso.get().load("https://cdn.pixabay.com/photo/2016/10/13/05/16/thai-curry-1736806_1280.jpg").into(imageView);

    }
}
