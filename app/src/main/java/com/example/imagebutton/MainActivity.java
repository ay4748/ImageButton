package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iV1;
    ImageButton iB1;
    Random rnd = new Random();
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iV1= findViewById(R.id.iV1);
        iB1= findViewById(R.id.iB1);
    }

    public void dodge(View view) {
        x=rnd.nextInt(3)+1;
        if (x==1) {
            iB1.setImageResource(R.drawable.one);
            iV1.setImageResource(R.drawable.cat);
    }
        if (x==2){
            iB1.setImageResource(R.drawable.two);
            iV1.setImageResource(R.drawable.dog);
        }
        if (x==3){
            iB1.setImageResource(R.drawable.three);
            iV1.setImageResource(R.drawable.rabbit);
        }
    }
}