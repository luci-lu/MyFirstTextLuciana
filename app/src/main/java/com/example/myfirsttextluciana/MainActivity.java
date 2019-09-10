package com.example.myfirsttextluciana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView myTextView =(TextView) findViewById(R.id.etiqueta);
        myTextView.setText("A Continuacion viene una modificacion");
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"OnStart",Toast.LENGTH_LONG).show();
    }
}





