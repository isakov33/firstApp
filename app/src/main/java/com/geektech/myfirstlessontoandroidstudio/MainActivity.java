package com.geektech.myfirstlessontoandroidstudio;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText alba,alba1;
    Button hh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alba = findViewById(R.id.et_gmail);
        alba1 = findViewById(R.id.et_password);
        hh = findViewById(R.id.next);

        hh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(alba.getText().toString().isEmpty() && !(alba1.getText().toString().isEmpty()))){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                    hh.setBackgroundColor(Color.BLACK);
                    Toast toast1 = Toast.makeText (getApplicationContext(), "Вы успешно зашли", Toast.LENGTH_SHORT);
                    toast1.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Заполните все поля", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


    }
}