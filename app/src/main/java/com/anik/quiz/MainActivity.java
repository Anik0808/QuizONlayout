package com.anik.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.line1) ;
        linearLayout.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(MainActivity.this,Test.class);
                        startActivity(intent);
                    }
                }
        );
        LinearLayout linearLayout2=(LinearLayout)findViewById(R.id.line2) ;
        linearLayout.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(MainActivity.this,Test.class);
                        startActivity(intent);
                    }
                }
        );
        LinearLayout linearLayout3=(LinearLayout)findViewById(R.id.line3) ;
        linearLayout.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(MainActivity.this,Test.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
