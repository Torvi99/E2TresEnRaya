package com.androidpprog2.e2tresenraya;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    int turno = 0;
    int[] position = new int[]{
            R.id.button,R.id.button2,R.id.button3,
            R.id.button4,R.id.button5,R.id.button6,
            R.id.button7,R.id.button8,R.id.button9
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);
        text.setText("Player 1: ");
    }


    public void onClickButton(View v){
        System.out.println(v.getId());
        int controller = 0;


        for(int x = 0; x < position.length; x++){
            if(position[x] == v.getId()){
                controller = 1;
                position[x] = 0;
            }

        }

        if(controller == 1){
            if(turno == 0){
                v.setBackgroundResource(R.drawable.o);
                turno = 1;
                text.setText("Player 2:");
            }else if(turno == 1){
                v.setBackgroundResource(R.drawable.x);
                turno = 0;
                text.setText("Player 1:");
            }
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT);
            toast.show();
            System.out.println("Error");
        }

    }
}