package com.example.otabek.mycard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView pic1;
    private ImageView pic2;
    private ImageView pic3;
    private ImageView pic4;
    private ImageView pic5;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        pic1 = (ImageView) findViewById(R.id.pic1);
        pic2 = (ImageView) findViewById(R.id.pic2);
        pic3 = (ImageView) findViewById(R.id.pic3);
        pic4 = (ImageView) findViewById(R.id.pic4);
        pic5 = (ImageView) findViewById(R.id.pic5);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pic1:
                pic1.setVisibility(View.GONE);
                pic2.setVisibility(View.VISIBLE);
                pic3.setVisibility(View.GONE);
                pic4.setVisibility(View.GONE);
                pic5.setVisibility(View.GONE);
                break;
            case R.id.pic2:
                pic1.setVisibility(View.GONE);
                pic2.setVisibility(View.GONE);
                pic3.setVisibility(View.VISIBLE);
                pic4.setVisibility(View.GONE);
                pic5.setVisibility(View.GONE);
                break;
            case R.id.pic3:
                pic1.setVisibility(View.GONE);
                pic2.setVisibility(View.GONE);
                pic3.setVisibility(View.GONE);
                pic4.setVisibility(View.VISIBLE);
                pic5.setVisibility(View.GONE);
                break;
            case R.id.pic4:
                pic1.setVisibility(View.VISIBLE);
                pic2.setVisibility(View.GONE);
                pic3.setVisibility(View.GONE);
                pic4.setVisibility(View.GONE);
                pic5.setVisibility(View.GONE);
                break;
            case R.id.pic5:
                pic1.setVisibility(View.GONE);
                pic2.setVisibility(View.GONE);
                pic3.setVisibility(View.GONE);
                pic4.setVisibility(View.GONE);
                pic5.setVisibility(View.VISIBLE);
                break;




        }
    }
}