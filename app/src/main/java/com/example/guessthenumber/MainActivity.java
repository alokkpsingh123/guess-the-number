package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int random;
    public void getRandom(){
        Random r = new Random();
        random= r.nextInt(20)+1;
    }
    public void guess(View v){
        EditText editText = (EditText) findViewById(R.id.editText);
        int number= Integer.parseInt(editText.getText().toString());
        String message;
        if(number>random){
            message="Lower!";
        }
        else if(number<random){
            message="Higger!";
        }
        else{
            message="You got it! Try another!";
            getRandom();
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getRandom();
    }
}