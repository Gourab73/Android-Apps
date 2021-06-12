package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.text.TextUtils.isEmpty;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText number;
    ToggleButton toggleButton;
    TextView text3;
    Double a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        number = findViewById(R.id.number);
        toggleButton = findViewById(R.id.toggleButton);
        text3 = findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please enter the temperature",Toast.LENGTH_SHORT).show();
                }
                else if(toggleButton.isChecked())
                {
                    a=Double.parseDouble(String.valueOf(number.getText()));
                    Double b=a*9/5+32;
                    String r=String.valueOf(b);
                    text3.setText(r+" °F");
                }
                else
                {
                    a=Double.parseDouble(String.valueOf(number.getText()));
                    Double b=a-32;
                    Double c=b*5/9;
                    String r=String.valueOf(c);
                    text3.setText(r+" °C");
                }
            }
        });

    }
}