package com.example.snakesladder;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void gotos(View view)
    {
        Intent nextpage= new Intent(MainActivity.this,Main2Activity.class);
        startActivity(nextpage) ;

    }
    public void gotox(View view)
    {
        Intent nextpages= new Intent(MainActivity.this,Instruction.class);
        startActivity(nextpages) ;

    }
}