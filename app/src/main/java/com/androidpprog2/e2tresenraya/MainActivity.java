package com.androidpprog2.e2tresenraya;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    int turno = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);
        text.setText("Player 1: ");
    }


    public void onClickButton(View v){

        if(turno == 0){
            v.setBackgroundResource(R.drawable.o);
            turno = 1;
            text.setText("Player 2:");
        }else if(turno == 1){
            v.setBackgroundResource(R.drawable.x);
            turno = 0;
            text.setText("Player 1:");
        }
    }
}